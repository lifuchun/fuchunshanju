package com.fuchunshanju.webchat.message.resp;

/**
 * 
* @ClassName: TextMessage 
* @Description: (文本消息消息体) 
* @author Lee 
* @date 2017年4月28日 下午3:03:02 
*
 */
public class TextMessage extends BaseMessage{
	 // 回复的消息内容   
    private String Content;  

    public String getContent() {  
        return Content;  
    }  

    public void setContent(String content) {  
        Content = content;  
    }  
}
