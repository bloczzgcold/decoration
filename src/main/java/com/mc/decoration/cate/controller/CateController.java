package com.mc.decoration.cate.controller;

import com.mc.decoration.base.BaseResponseJson;
import com.mc.decoration.cate.model.Cate;
import com.mc.decoration.cate.service.CateService;
import com.mc.decoration.user.controller.UserController;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangzhenguo on 2017/3/7.
 */
@Controller
@RequestMapping("/cate")
public class CateController {
    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private CateService cateService;

    @RequestMapping("/findAllGoodsCate")
    @ResponseBody
    public BaseResponseJson findAllGoodsCate(){
        log.info("查询所有类别信息");
        List<Cate> cateList = cateService.selectAllCates();

        BaseResponseJson json = new BaseResponseJson();
        json.setStatus(BaseResponseJson.CODE_SUCCESS);
        json.setMsg("成功");
        json.setData(cateList);
        return json;
    }
}
