package com.fuchunshanju.webchat.message.req;

/**
 * 
 * @ClassName: LocationMessage
 * @Description: (位置信息类)
 * @author LeeFC
 * @date 2017年2月21日 下午3:41:16
 *
 */
public class LocationMessage extends BaseMessage {
	// 经度
	private String Longitude;
	// 纬度
	private String Latitude;
	// 地图缩放比例
	private String scala;
	// 地理位置信息
	private String addr;

	public String getLongitude() {
		return Longitude;
	}

	public void setLongitude(String longitude) {
		Longitude = longitude;
	}

	public String getLatitude() {
		return Latitude;
	}

	public void setLatitude(String latitude) {
		Latitude = latitude;
	}

	public String getScala() {
		return scala;
	}

	public void setScala(String scala) {
		this.scala = scala;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
