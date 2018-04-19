
package com.home.hiaes.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <p>
 * <code>User</code>
 * </p>
 * Description:人员信息
 *
 * @author Mcchu
 * @date 2017/12/14 11:14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    //id
    private Long id;

    //人员姓名
    private String name;

    //年龄
    private Integer age;

    //出生日期
    private String birthday;

    //关系
    private String relationship;

    //电子邮箱
    private String email;

    //电话号码
    private String telephone;

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
