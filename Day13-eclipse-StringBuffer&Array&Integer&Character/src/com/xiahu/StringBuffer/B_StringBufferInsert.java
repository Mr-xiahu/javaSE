package com.xiahu.StringBuffer;

/**
 * @author Administrator
 * StringBuffer的添加功能：
 * 
 *  public StringBuffer append(String str):
 *  可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
 * 
 *  public StringBuffer insert(int offset,String str):
 *  在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
 *
 */
public class B_StringBufferInsert {
	public static void main(String[] args) {
		//创建字符缓冲区
		StringBuffer sb=new StringBuffer();
		
		//可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
		//public StringBuffer append(String str):
		
		
		StringBuffer sb2=sb.append("hello");
		System.out.println("sb:"+sb);
		System.out.println("sb2:"+sb2);
		System.out.println(sb==sb2);
		sb.append(true).append('a').append(8).append(12.2);
		System.out.println(sb);
		System.out.println("--------------");
		
//		public StringBuffer insert(int offset,String str):
//	         在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
		sb.insert(5, "xiahu");
		System.out.println(sb);
		
	}

}
