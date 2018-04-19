
package com.home.hiaes.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * <code>Loan</code>
 * </p>
 * Description:借出实体
 *
 * @author Mcchu
 * @date 2017/12/14 11:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Loan {

    //id
    private Long id;

    //借出人
    private String loanPersonName;

    //借出日期
    private Date loanTime;

    //借出类型
    private Integer loanType;

    //借出金额
    private BigDecimal loanAmount;

    //是否包含利息
    private Boolean containInterest;

    //利率
    private BigDecimal interestRate;

    //借还指定期限
    private String loanTerm;

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
