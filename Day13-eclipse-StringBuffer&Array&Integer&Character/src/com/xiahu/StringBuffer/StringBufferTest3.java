package com.xiahu.StringBuffer;

import java.util.Scanner;

/**
 * @author Administrator
 * 判断一个字符串是否是对称字符串
 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 * 
 * 分析：
 * 		判断一个字符串是否是对称的字符串，我只需要把
 * 			第一个和最后一个比较
 * 			第二个和倒数第二个比较
 * 			...
 * 		比较的次数是长度除以2。
 */
public class StringBufferTest3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入一個字符串");
		String s=sc.nextLine();
		boolean b=isSame2(s);
		System.out.println(b);
	}
	
	//用String的方式反轉
//	public static boolean isSame(String s){
//		char[] ch=s.toCharArray();
//		for(int start=0,end=ch.length-1;start<end;start++,end--){
//			if(ch[start]!=ch[end]){
//				return false;
//			}
//		}
//		return true;
//	}
	
	//用StringBuffer的方式反轉
	public static boolean isSame2(String s) {
//		StringBuffer sb=new StringBuffer(s);
//		StringBuffer s3=sb.reverse();
//		String s4=s3.toString();
//		boolean b=s4.equals(s);
//		return b;
		
		return new StringBuffer(s).reverse().toString().equals(s);
	}

}
