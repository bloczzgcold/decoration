package com.mc.decoration.cate.service.impl;

import com.mc.decoration.cate.dao.CateDao;
import com.mc.decoration.cate.model.Cate;
import com.mc.decoration.cate.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhangzhenguo on 2017/3/7.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CateServiceImpl implements CateService {

    @Autowired
    private CateDao cateDao;

    public List<Cate> selectAllCates() {
        try {
            return cateDao.selectAllGoodsCate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
