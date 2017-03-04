package com.mc.decoration.utils;

import com.alibaba.fastjson.JSONObject;

public class JsonUtil {

	public static JSONObject dealJson(boolean flag, String url, String msg) {
		JSONObject json = new JSONObject();
		json.put("flag", flag);
		json.put("url", url);
		json.put("message", msg);
		return json;
	}
}
