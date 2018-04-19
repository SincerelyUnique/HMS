
package com.home.hiaes.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <p>
 * <code>Administrator</code>
 * </p>
 * Description:管理员实体
 *
 * @author Mcchu
 * @date 2017/12/14 11:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    //id
    private Long id;

    //管理员姓名（账号）
    private String username;

    //密码
    private String password;

    //管理员角色
    private String userRole;

    //是否登录
    private String isLogin;

    //是否启用
    private String enable;

    //电子邮箱
    private String email;

    //电话号码
    private String telephone;

    //token
    private String token;

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
