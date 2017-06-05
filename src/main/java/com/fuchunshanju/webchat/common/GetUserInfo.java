package com.fuchunshanju.webchat.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fuchunshanju.web.util.GlobalConstants;
import com.fuchunshanju.webchat.util.HttpUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lee on 2017/6/5.
 */
public class GetUserInfo {

    public static Map<String, String> getUserByOpenId(String openid) throws Exception {
        HashMap<String, String> params = new HashMap<>();
        params.put("access_token",
                GlobalConstants.getInterfaceUrl("access_token"));  //定时器中获取到的token
        params.put("openid", openid);  //需要获取的用户的openid
        params.put("lang", "zh_CN");
        String subscribers = HttpUtils.sendGet(
                GlobalConstants.getInterfaceUrl("OpenidUserinfoUrl"), params);
        System.out.println(subscribers);
        JSONObject object = JSON.parseObject(subscribers);
        params.clear();
        //这里返回参数只取了昵称、头像、和性别
        params.put("nickname",
                object.getString("nickname"));//昵称
        params.put("headimgurl",
                object.getString("headimgurl"));  //图像
        params.put("sex", object.getString("sex"));  //性别
        return params;
    }
}
