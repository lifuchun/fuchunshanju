package com.fuchunshanju.webchat.message.req;

/**
 * 
 * @ClassName: BasePojo
 * @Description: (基础实体类)
 * @author LeeFC
 * @date 2017年2月21日 下午2:41:41
 *
 */
public class BaseMessage {
	// 开发者公众号ID
	private String ToUserName;
	// 发送者openId
	private String FromUserName;
	// 消息类型
	private String MsgType;
	// 创建时间
	private Long CreateTime;
	// 消息ID
	private Long MsgId;

	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}

	public Long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(Long createTime) {
		CreateTime = createTime;
	}

	public Long getMsgId() {
		return MsgId;
	}

	public void setMsgId(Long msgId) {
		MsgId = msgId;
	}
}
