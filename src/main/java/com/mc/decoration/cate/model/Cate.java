package com.mc.decoration.cate.model;

/**
 * Created by zhangzhenguo on 2017/3/7.
 * 商品类别
 */
public class Cate {
    private int id;

    /**
     * 类别编码
     */
    private String cateCode;

    /**
     * 类别名称
     */
    private String cateName;

    /**
     * 备注
     */
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCateCode() {
        return cateCode;
    }

    public void setCateCode(String cateCode) {
        this.cateCode = cateCode;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
