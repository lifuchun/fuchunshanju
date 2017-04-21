package com.fuchunshanju.web.util;

import java.util.Properties;

public class GlobalConstants {
	
	public static Properties interfaceUrlProperties;

	/**
	 * 
	* @Title: getInterfaceUrl 
	* @Description: () 
	* @param @param key
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	public static String getInterfaceUrl(String key) {
		return (String) interfaceUrlProperties.get(key);
	}
}
