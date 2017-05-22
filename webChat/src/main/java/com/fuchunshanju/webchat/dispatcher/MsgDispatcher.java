package com.fuchunshanju.webchat.dispatcher;

import java.util.Date;
import java.util.Map;

import com.fuchunshanju.webchat.message.resp.TextMessage;
import com.fuchunshanju.webchat.util.MessageUtil;

public class MsgDispatcher {
	
	public static String processMessage(Map<String, String> map) {
		
		String openid = map.get("FromUserName");
		String mpid = map.get("ToUserName");
		TextMessage textMessage = new TextMessage();
		textMessage.setToUserName(openid);
		textMessage.setFromUserName(mpid);
		textMessage.setCreateTime(new Date().getTime());
		textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
		
		if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) { // 文本消息
			textMessage.setContent("Hello,This is fuchunlee");
			return MessageUtil.textMessageToXml(textMessage);
//			System.out.println("==============这是文本消息！");
		}

		if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) { // 图片消息
			System.out.println("==============这是图片消息！");
		}

		if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) { // 链接消息
			System.out.println("==============这是链接消息！");
		}

		if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) { // 位置消息
			System.out.println("==============这是位置消息！");
		}

		if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_VIDEO)) { // 视频消息
			System.out.println("==============这是视频消息！");
		}

		if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) { // 语音消息
			System.out.println("==============这是语音消息！");
		}
		return null;
	}
}
