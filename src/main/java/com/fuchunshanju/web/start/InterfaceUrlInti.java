package com.fuchunshanju.web.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
* @ClassName: InterfaceUrlInti 
* @Description: TODO(配置读取) 
* @author Lee 
* @date 2017年4月21日 上午11:58:50 
*
 */

public class InterfaceUrlInti {
	public synchronized static void init(){
		 ClassLoader cl = Thread.currentThread().getContextClassLoader();
	        Properties props = new Properties();
	        if(GlobalConstants.interfaceUrlProperties==null){
	            GlobalConstants.interfaceUrlProperties = new Properties();
	        }
	        InputStream in = null;
	        try {
	        	/*
	        	 * interface_url.properties存放经常用到的 http 请求的 url 地址
	        	 */
	            in = cl.getResourceAsStream("interface_url.properties");
	            props.load(in);
	            for(Object key : props.keySet()){
	                GlobalConstants.interfaceUrlProperties.put(key, props.get(key));
	            }
	            /*
	             * webchat.properties存的是公众号相关的东西，如appID，AppSecret，token
	             */
	            props = new Properties();
	            in = cl.getResourceAsStream("wechat.properties");
	            props.load(in);
	            for(Object key : props.keySet()){
	                GlobalConstants.interfaceUrlProperties.put(key, props.get(key));
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }finally{
	            if(in!=null){
	                try {
	                    in.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	        return;
	}
}
