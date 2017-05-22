package com.fuchunshanju.webchat.message.req;

/**
 * 
* @ClassName: VideoMessage 
* @Description: (小视频消息类) 
* @author LeeFC
* @date 2017年2月21日 下午3:36:41 
*
 */
public class VideoMessage extends BaseMessage{
	
	 private String MediaId; // 视频消息媒体 id，可以调用多媒体文件下载接口拉取数据
	    private String ThumbMediaId; // 视频消息缩略图的媒体 id，可以调用多媒体文件下载接口拉取数据

	    public String getMediaId() {
	        return MediaId;
	    }

	    public void setMediaId(String mediaId) {
	        MediaId = mediaId;
	    }

	    public String getThumbMediaId() {
	        return ThumbMediaId;
	    }

	    public void setThumbMediaId(String thumbMediaId) {
	        ThumbMediaId = thumbMediaId;
	    }
}
