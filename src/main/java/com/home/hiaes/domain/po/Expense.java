
package com.home.hiaes.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * <code>expense</code>
 * </p>
 * Description:支出实体
 *
 * @author Mcchu
 * @date 2017/12/14 8:52
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Expense {

    //id
    private Long id;

    //支出人
    private String incomePersonName;

    //支出时间
    private Date incomeTime;

    //支出金额
    private BigDecimal incomeAmount;

    //支出类型
    private Integer incomeType;

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
