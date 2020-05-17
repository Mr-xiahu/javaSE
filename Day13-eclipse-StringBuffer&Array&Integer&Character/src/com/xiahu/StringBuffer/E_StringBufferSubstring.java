package com.xiahu.StringBuffer;

/**
 * @author Administrator
 *  
 *  StringBuffer的截取功能:注意返回值类型不再是StringBuffer本身了
 *  public String substring(int start)
 *  public String substring(int start,int end)
 */
public class E_StringBufferSubstring {
	public static void main(String[] args) {
		
		//定义字符串缓冲区
		StringBuffer sb=new StringBuffer();
		
		//添加元素
		sb.append("hello").append("world").append("java");
		System.out.println(sb);
		//截取功能
		//public String substring(int start)
		String s=sb.substring(5);
		System.out.println(s);
		
		// public String substring(int start,int end)
				
		String ss = sb.substring(5, 10);
				
		System.out.println("ss:" + ss);
				
		System.out.println("sb:" + sb);
		
	}

}
