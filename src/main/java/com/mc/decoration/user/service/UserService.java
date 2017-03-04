package com.mc.decoration.user.service;



import com.mc.decoration.user.model.User;

import java.util.List;

/**
 * Created by zhangzhenguo on 2017/02/09.
 */
public interface UserService {

    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);
}
