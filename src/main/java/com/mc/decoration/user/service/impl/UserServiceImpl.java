package com.mc.decoration.user.service.impl;

import com.mc.decoration.user.dao.UserDao;
import com.mc.decoration.user.model.User;
import com.mc.decoration.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhangzhenguo on 2017/02/09.
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserDao userDao;

    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }
    
    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        return userDao.selectUserByPhoneOrEmail(emailOrPhone,state);
    }
    
    public List<User> getAllUser() {
        try {
            return userDao.selectAllUser();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
