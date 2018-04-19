
package com.home.hiaes.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * <code>ResponseVo</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2017/12/22 9:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseVo<T> {

    /**
     * 请求成功或失败标志
     */
    Boolean flag;

    /**
     * 请求返回状态码
     */
    String code;

    /**
     * 请求返回提示信息
     */
    String message;

    /**
     * 请求返回的详细数据
     */
    T content;
}
