package com.mc.decoration.base;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by zhangzhenguo on 2017/2/12.
 */
public class BaseResponseJson {

    public static final int  CODE_SUCCESS=1;
    public static final int  CODE_ERROR=0;

    private int status;
    private String msg;
    private Object data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public JSONObject toJsonObject(){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("status", status);
        jsonObject.put("msg", msg);
        jsonObject.put("data", data);
        return jsonObject;
    }
}
