package com.fuchunshanju.webchat.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


/**
 * 
 * @ClassName: MessageUtil
 * @Description: 消息工具类
 * @author LeeFC
 * @date 2017年2月8日 下午5:10:55
 *
 */
public class MessageUtil {
	
	/** 
     * 返回消息类型：文本 
     */  
    public static final String RESP_MESSAGE_TYPE_TEXT = "text";  

    /** 
     * 返回消息类型：音乐 
     */  
    public static final String RESP_MESSAGE_TYPE_MUSIC = "music";  

    /** 
     * 返回消息类型：图文 
     */  
    public static final String RESP_MESSAGE_TYPE_NEWS = "news";  

    /** 
     * 请求消息类型：文本 
     */  
    public static final String REQ_MESSAGE_TYPE_TEXT = "text";  

    /** 
     * 请求消息类型：图片 
     */  
    public static final String REQ_MESSAGE_TYPE_IMAGE = "image";  

    /** 
     * 请求消息类型：链接 
     */  
    public static final String REQ_MESSAGE_TYPE_LINK = "link";  

    /** 
     * 请求消息类型：地理位置 
     */  
    public static final String REQ_MESSAGE_TYPE_LOCATION = "location";  

    /** 
     * 请求消息类型：音频 
     */  
    public static final String REQ_MESSAGE_TYPE_VOICE = "voice";  

    /** 
     * 请求消息类型：推送 
     */  
    public static final String REQ_MESSAGE_TYPE_EVENT = "event";  

    /** 
     * 事件类型：subscribe(订阅) 
     */  
    public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";  

    /** 
     * 事件类型：unsubscribe(取消订阅) 
     */  
    public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";  

    /** 
     * 事件类型：CLICK(自定义菜单点击事件) 
     */  
    public static final String EVENT_TYPE_CLICK = "CLICK";  
    
    /**
     * 
    * @Title: parseXml 
    * @Description: 解析微信的xml 
    * @param @param request
    * @param @return
    * @param @throws IOException    设定文件 
    * @return Map<String,String>    返回类型 
    * @throws
     */
    public static Map<String, String> parseXml(HttpServletRequest request) throws IOException{
    	Map<String, String> map = new HashMap<String, String>();
    	//从请求获取流
    	InputStream inputStream = request.getInputStream();
    	//读取输入流
    	SAXReader reader = new SAXReader();
    	try {
			Document document = reader.read(inputStream);
			//得到xml根元素
			Element element = document.getRootElement();
			//获取所有子节点
			List<Element> elementLists = element.elements();
			for (Element e : elementLists) {
				map.put(e.getName(), e.getText());
			}
			inputStream.close();
			inputStream = null;
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return map;
    }
    
}
