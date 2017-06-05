package com.fuchunshanju.webchat.util;

import java.security.MessageDigest;
import java.util.Arrays;

/**
 * 
* @ClassName: SignUtil 
* @Description: (sign值验证) 
* @author Lee 
* @date 2017年4月28日 下午2:34:06 
*
 */
public class SignUtil{

	private final static String token = "fuchuanshanjuwebchat";

	public static boolean checkSignature(String signature, String timestamp,String nonce){
		//将参数装入数组
			String[] arr = new String[]{token,timestamp,nonce};
		//进行排序
			Arrays.sort(arr);
			StringBuffer content = new StringBuffer();
			for (int i = 0;i<arr.length;i++){
				content.append(arr[i]);
			}
		MessageDigest md = null;
		String tempStr = null;
		try{
			md = MessageDigest.getInstance("SHA-1");
			byte[] digst = md.digest(content.toString().getBytes());
			//对三个参数进行SHA-1加密
			tempStr = byteToStr(digst);
		}catch (Exception e){
			e.printStackTrace();
		}
			content = null;
			//将加密后的数据与传入的sign值进行比较，判断其是否来至微信
			return tempStr != null ? tempStr.equals(signature.toUpperCase()) : false;
	}
	/**
	 * 将字节数组转换为十六进制字符串
	 * @param byteArray
	 * @return
	 */
	private static String byteToStr(byte[] byteArray) {
		String strDigest = "";
		for (int i = 0; i < byteArray.length; i++) {
			strDigest += byteToHexStr(byteArray[i]);
		}
		return strDigest;
	}

	/**
	 * 将字节转换为十六进制字符串
	 * @param mByte
	 * @return
	 */
	private static String byteToHexStr(byte mByte) {
		char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		char[] tempArr = new char[2];
		tempArr[0] = Digit[(mByte >>> 4) & 0X0F];
		tempArr[1] = Digit[mByte & 0X0F];
		String s = new String(tempArr);
		return s;
	}
}
