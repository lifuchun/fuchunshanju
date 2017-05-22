package com.fuchunshanju.webchat.message.req;

/**
 * 
* @ClassName: VoiceMessage 
* @Description: (语音消息类) 
* @author LeeFC
* @date 2017年2月21日 下午3:18:36 
*
 */
public class VoiceMessage extends BaseMessage {
	  // 媒体 ID   
    private String MediaId;  
    // 语音格式   
    private String Format;  

    public String getMediaId() {  
        return MediaId;  
    }  

    public void setMediaId(String mediaId) {  
        MediaId = mediaId;  
    }  

    public String getFormat() {  
        return Format;  
    }  

    public void setFormat(String format) {  
        Format = format;  
    }  
}
