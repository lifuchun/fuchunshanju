package com.fuchunshanju.webchat.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.fuchunshanju.webchat.message.resp.Article;
import com.fuchunshanju.webchat.message.resp.ImageMessage;
import com.fuchunshanju.webchat.message.resp.MusicMessage;
import com.fuchunshanju.webchat.message.resp.NewsMessage;
import com.fuchunshanju.webchat.message.resp.TextMessage;
import com.fuchunshanju.webchat.message.resp.VideoMessage;
import com.fuchunshanju.webchat.message.resp.VoiceMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;


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
     * 请求消息类型：小视频
     */
    public static final String REQ_MESSAGE_TYPE_VIDEO = "video";
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
     * 事件类型：SCAN(扫描二维码)
     */
    public static final String EVENT_TYPE_SCAN= "SCAN";
    
    /**
     * 事件类型：LOCATION(位置上报)
     */
    public  static final String EVENT_TYPE_LOCATION="LOCATION";
    
    /**
     * 事件类型：VIEW(自定义菜单 View 事件)
     */
    public static final String EVENT_TYPE_VIEW="VIEW";
    
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
    @SuppressWarnings("unchecked")
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
    
    /**
     * @Description: 文本消息对象转换成 xml
     * @param @param textMessage
     * @param @return
     * @author Lee
     */
    public static String textMessageToXml(TextMessage textMessage) {
        xstream.alias("xml", textMessage.getClass());
        return xstream.toXML(textMessage);
    }

    /**
     * @Description: 图文消息对象转换成 xml
     * @param @param newsMessage
     * @param @return
     * @author Lee
     */
    public static String newsMessageToXml(NewsMessage newsMessage) {
        xstream.alias("xml", newsMessage.getClass());
        xstream.alias("item", new Article().getClass());
        return xstream.toXML(newsMessage);
    }

    /**
     * @Description: 图片消息对象转换成 xml
     * @param @param imageMessage
     * @param @return
     * @author Lee
     */
    public static String imageMessageToXml(ImageMessage imageMessage) {
        xstream.alias("xml", imageMessage.getClass());
        return xstream.toXML(imageMessage);
    }

    /**
     * @Description: 语音消息对象转换成 xml
     * @param @param voiceMessage
     * @param @return
     * @author Lee
     */
    public static String voiceMessageToXml(VoiceMessage voiceMessage) {
        xstream.alias("xml", voiceMessage.getClass());
        return xstream.toXML(voiceMessage);
    }

    /**
     * @Description: 视频消息对象转换成 xml
     * @param @param videoMessage
     * @param @return
     * @author Lee
     */
    public static String videoMessageToXml(VideoMessage videoMessage) {
        xstream.alias("xml", videoMessage.getClass());
        return xstream.toXML(videoMessage);
    }

    /**
     * @Description: 音乐消息对象转换成 xml
     * @param @param musicMessage
     * @param @return
     * @author Lee
     */
    public static String musicMessageToXml(MusicMessage musicMessage) {
        xstream.alias("xml", musicMessage.getClass());
        return xstream.toXML(musicMessage);
    }

    
    @SuppressWarnings("unchecked")
    private static XStream xstream = new XStream(new XppDriver() {  
        public HierarchicalStreamWriter createWriter(Writer out) {  
            return new PrettyPrintWriter(out) {  
                // 对所有 xml 节点的转换都增加 CDATA 标记   
                boolean cdata = true;  
                @SuppressWarnings("rawtypes")
                public void startNode(String name, Class clazz) {  
                    super.startNode(name, clazz);  
                }  

                protected void writeText(QuickWriter writer, String text) {  
                    if (cdata) {  
                        writer.write("<![CDATA[");  
                        writer.write(text);  
                        writer.write("]]>");  
                    } else {  
                        writer.write(text);  
                    }  
                }  
            };  
        }  
    });  
}
