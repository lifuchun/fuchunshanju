package com.fuchunshanju.webchat.message.resp;

/**
 * 
* @ClassName: Video 
* @Description: (视频消息体) 
* @author Lee 
* @date 2017年4月28日 下午3:00:48 
*
 */
public class Video {
	private String MediaId;
	private String Title;
	private String Description;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

}
