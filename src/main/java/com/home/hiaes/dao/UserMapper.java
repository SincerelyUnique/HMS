
package com.home.hiaes.dao;

import com.home.hiaes.domain.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * <code>UserMapper</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2017/12/14 13:38
 */
@Repository
public interface UserMapper {

    User selectByPrimaryKey(Long id);

    void insert(User user);

    void insertSelective( User user );

    Integer deleteByPrimaryKey(Long id);

    Integer updateByPrimaryKey(User user);

    User selectByUsernameAndPassword(String username, String password);

    User selectByUsername(String username);

    List<User> selectAllAndPageable(Integer pageNum, Integer pageSize);
}
