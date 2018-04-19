
package com.home.hiaes.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * <code>EmailVo</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2017/12/22 14:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailVo {

    private String senderAddress;

    private String recipientAddress;

    private String subject;

    private String message;
}
