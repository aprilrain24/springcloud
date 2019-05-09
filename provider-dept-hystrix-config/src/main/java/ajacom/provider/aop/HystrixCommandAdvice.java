package ajacom.provider.aop;

import ajacom.provider.common.ApiResult;
import com.google.gson.Gson;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author liucm
 *         Date 2019/4/30
 *         Time 14:15
 */
@Aspect
@Component
public class HystrixCommandAdvice {

    @Pointcut("execution(* ajacom.provider.controller.*.*(..))")
    public void hystrixPointCut() {
    }

    @Around("hystrixPointCut()")
    public Object runCommand(final ProceedingJoinPoint joinPoint) {
        return wrapWithHystrixCommnad(joinPoint).execute();
    }

    private HystrixCommand<Object> wrapWithHystrixCommnad(final ProceedingJoinPoint pjp) {
        String method = pjp.getSignature().getName();
        return new HystrixCommand<Object>(setter(method)) {
            @Override
            public Object run() throws Exception {
                try {
                    return pjp.proceed();
                } catch (Throwable throwable) {
                    throw (Exception) throwable;
                }
            }

            @Override
            public Object getFallback() {
                return ApiResult.builder()
                        .flag(false)
                        .method(pjp.getTarget().getClass().getSimpleName()+"-"+method)
                        .args(new Gson().toJson(pjp.getArgs())).build();
            }
        };
    }

    private HystrixCommand.Setter setter(String method) {
        return HystrixCommand.Setter
                .withGroupKey(HystrixCommandGroupKey.Factory.asKey(method == null ? "groupName" : method))
                .andCommandKey(HystrixCommandKey.Factory.asKey(method == null ? "commandName" : method));
    }

}
