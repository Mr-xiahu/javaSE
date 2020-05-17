package com.xiahu.BianMa;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 *  String(byte[] bytes, String charsetName):通过指定的字符集解码字节数组
 * byte[] getBytes(String charsetName):使用指定的字符集合把字符串编码为字节数组
 * 
 * 编码:把看得懂的变成看不懂的
 * String -- byte[]
 * 
 * 解码:把看不懂的变成看得懂的
 * byte[] -- String
 * 
 * 举例：谍战片(发电报，接电报)
 * 
 * 码表：小本子
 * 		字符	数值
 * 
 * 要发送一段文字：
 * 		今天晚上在老地方见
 * 
 * 		发送端：今 -- 数值 -- 二进制 -- 发出去
 * 		接收端：接收 -- 二进制 -- 十进制 -- 数值 -- 字符 -- 今
 * 
 * 		今天晚上在老地方见
 * 
 * 编码问题简单，只要编码解码的格式是一致的。
 */
public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "我爱你";

		byte[] bys = s.getBytes();// [-50, -46, -80, -82, -60, -29]
		// byte[] bys=s.getBytes("UTF-8");//[-26, -120, -111, -25, -120, -79,
		// -28, -67, -96]
		// byte[] bys=s.getBytes("GBK");//[-50, -46, -80, -82, -60, -29]
		// 默认采用的是GBK码表
		System.out.println(Arrays.toString(bys));

		 String ss=new String(bys);//我爱你
		// String ss=new String(bys,"UTF-8");//?????
		// String ss = new String(bys, "GBK");//我爱你
		System.out.println(ss);
	}

}
