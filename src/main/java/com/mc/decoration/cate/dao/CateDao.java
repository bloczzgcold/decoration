package com.mc.decoration.cate.dao;

import com.mc.decoration.cate.model.Cate;

import java.util.List;

/**
 * Created by zhangzhenguo on 2017/3/7.
 * 商品类别DAO
 */
public interface CateDao {

    List<Cate> selectAllGoodsCate();

}
