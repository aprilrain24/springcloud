package ajacom.provider.aop;

import ajacom.provider.common.ApiResult;
import com.google.gson.Gson;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author liucm
 *         Date 2019/4/30
 *         Time 16:08
 */
/*@Aspect
@Configuration*/
public class HystrixMonitor {
    @Pointcut("execution(* ajacom.provider.service.*.*(..))")
    public void hystrixPointCut() {
    }

    @Around("hystrixPointCut()")
    @AfterThrowing(pointcut = "hystrixPointCut()", throwing = "e")
    @HystrixCommand(fallbackMethod="fallback")
    public Object runCommand(final ProceedingJoinPoint joinPoint) {
        try {
            return joinPoint.proceed();
        }catch(Throwable e) {
            return e;
        }
    }
    public Object fallback(ProceedingJoinPoint pjp) {
        return ApiResult.builder()
                .flag(false)
                .method(pjp.getSignature().getName())
                .args(pjp.getArgs() == null ? "null" : new Gson().toJson(pjp.getArgs()))
                .build();
    }
}
