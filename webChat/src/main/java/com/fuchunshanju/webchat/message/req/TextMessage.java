package com.fuchunshanju.webchat.message.req;

/**
 * 
 * @ClassName: TextMessage
 * @Description: (文本消息类)
 * @author LeeFC
 * @date 2017年2月21日 下午3:17:44
 *
 */
public class TextMessage extends BaseMessage {
	// 消息标题
	private String title;
	// 消息描述
	private String Description;
	// 消息链接
	private String LinkUrl;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getLinkUrl() {
		return LinkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		LinkUrl = linkUrl;
	}

}
