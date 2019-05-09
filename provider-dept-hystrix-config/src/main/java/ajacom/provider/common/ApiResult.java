package ajacom.provider.common;

import lombok.Builder;
import lombok.Data;

/**
 * @author liucm
 *         Date 2019/4/30
 *         Time 14:36
 */

@Data
@Builder
public class ApiResult<T> {
    /**
     * 返回结果代码
     */
    private boolean flag;

    private T  data;

    /**
     * 结果信息
     */
    private String message;

    /**
     * 错误编号
     */
    private String method;
    /**
     * 请求参数
     */
    private String args;
}
