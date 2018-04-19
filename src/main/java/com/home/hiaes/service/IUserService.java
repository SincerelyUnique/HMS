
package com.home.hiaes.service;

import com.home.hiaes.domain.po.User;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * <code>IUserService</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2017/12/14 15:40
 */
public interface IUserService {

    /**
     * 添加用户
     * @param currentUser 当前用户
     * @param user 准备添加的用户
     */
    void addUser(User currentUser,User user);

    /**
     * 检测登录用户
     *
     * 1.如果不存在，返回null
     * 2.如果存在，但token=null，为第一次登录，生成token,写入session
     * 3.如果存在，但token!=null，且与db中token一致
     * @param username 用户名
     * @param password 密码
     * @return 是否拥有权限
     */
    User checkLoginUser(String username,String password);

    /**
     * token过期检测
     *
     * 用于拦截器
     * @param id session中用户id
     * @param token session中token
     * @return 是否一致
     */
    Boolean checkToken(Long id,String token);

    /**
     * 更新token
     * @param id 用户id
     * @param token 新的token
     */
    void updateToken(Long id,String token);

}
