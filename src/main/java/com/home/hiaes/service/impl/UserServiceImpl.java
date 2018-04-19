
package com.home.hiaes.service.impl;

import com.home.hiaes.dao.UserMapper;
import com.home.hiaes.domain.po.User;
import com.home.hiaes.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.UUID;

/**
 * <p>
 * <code>UserServiceImpl</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2017/12/14 15:41
 */
@Service
public class UserServiceImpl implements IUserService{

    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    public void addUser(User currentUser,User user) {
        UUID uuid = UUID.randomUUID();
        String newToken = uuid.toString();
        user.setToken(newToken);
        user.setCreateTime(new Date());
        user.setCreateUser(currentUser.getUsername());
        userMapper.insert(user);
    }

    public User checkLoginUser(String username, String password) {
        return userMapper.selectByUsernameAndPassword(username,password);
    }

    public Boolean checkToken(Long id,String token) {
        User dbUser = userMapper.selectByPrimaryKey(id);
        String dbToken = dbUser.getToken();
        return token.equals(dbToken);
    }

    public void updateToken(Long id, String token) {
        User user = new User();
        user.setId(id);
        user.setToken(token);
        userMapper.updateByPrimaryKey(user);
    }


}
