
package com.home.hiaes.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * <code>borrow</code>
 * </p>
 * Description:借入实体
 *
 * @author Mcchu
 * @date 2017/12/14 11:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Borrow {

    //id
    private Long id;

    //借入人
    private String borrowPersonName;

    //借入日期
    private Date borrowTime;

    //借入类型
    private Integer borrowType;

    //借入金额
    private BigDecimal borrowAmount;

    //是否包含利息
    private Boolean containInterest;

    //利率
    private BigDecimal interestRate;

    //借还指定期限
    private String borrowTerm;

    //到期应还金额
    private BigDecimal payBackMoney;

    //是否已还款
    private Boolean payBack;

    //备注
    private String remark;

    //创建时间
    private Date createTime;

    //创建人
    private String createUser;

    //更新时间
    private Date updateTime;

    //更新人
    private String updateUser;
}
