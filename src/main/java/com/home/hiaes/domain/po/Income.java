
package com.home.hiaes.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * <code>income</code>
 * </p>
 * Description:收入实体
 *
 * @author Mcchu
 * @date 2017/12/14 8:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Income {

    //id
    private Long id;

    //收入人
    private String incomePersonName;

    //收入时间
    private Date incomeTime;

    //收入金额
    private BigDecimal incomeAmount;

    //收入类型
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
