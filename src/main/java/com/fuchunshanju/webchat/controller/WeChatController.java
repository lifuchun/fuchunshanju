package com.fuchunshanju.webchat.controller;

import com.fuchunshanju.Message;
import com.fuchunshanju.webchat.common.JSSDK_Config;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


/**
 * 控制类
 * Created by Lee on 2017/6/2.
 */

@Controller
@RequestMapping("webchat")
public class WeChatController {

    private Logger logger = Logger.getLogger(WeChatController.class);

    /**
     * 前端获取微信jssdk配置参数
     */

    public Message jssdk_config(@RequestParam(value = "url", required = true) String url) {
        try {
            Map<String,String> configMap = JSSDK_Config.jsSDK_Sign(url);
            return  Message.success(configMap);
        } catch (Exception e) {
            logger.error(e,e);
            return  Message.error();
        }
    }


}
