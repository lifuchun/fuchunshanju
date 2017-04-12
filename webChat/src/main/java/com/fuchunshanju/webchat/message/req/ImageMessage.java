package com.fuchunshanju.webchat.message.req;

/**
 * 
 * @ClassName: PicMessage
 * @Description: (图片消息类)
 * @author LeeFC
 * @date 2017年2月21日 下午3:31:28
 *
 */
public class ImageMessage extends BaseMessage {
	// 图片地址
	private String PicUrl;

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

}
