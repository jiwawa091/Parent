package cloud.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 统一响应
 *
 * @className: CommonResult
 * @author: wangyan
 * @date: 2020/7/24
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable {
    private static final long serialVersionUID = -4664776543001171129L;

    /**
     * 返回码
     */
    private Integer code;
    /**
     * 信息
     */
    private String message;

    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
