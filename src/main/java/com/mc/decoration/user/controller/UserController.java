package com.mc.decoration.user.controller;

import com.mc.decoration.user.model.User;
import com.mc.decoration.user.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by zhangzhenguo on 2017/2/9.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public ModelAndView showUser(){
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        return new ModelAndView("/pages/user/showUser","userList",userList);
    }

    @RequestMapping("/findById")
    public String findById(long id){
        User user = userService.getUserById(id);
        return "showUserBuId";
    }
}
