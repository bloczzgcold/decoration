package com.mc.decoration.user.dao;

import com.mc.decoration.user.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhangzhenguo on 2017/02/09
 */

public interface UserDao {

    User selectUserById(@Param("userId") Long userId);

    User selectUserByPhoneOrEmail(@Param("emailOrPhone") String emailOrPhone, @Param("state") Short state);

    List<User> selectAllUser();
}
