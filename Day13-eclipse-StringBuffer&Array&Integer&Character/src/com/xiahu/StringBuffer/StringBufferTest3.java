package com.xiahu.StringBuffer;

import java.util.Scanner;

/**
 * @author Administrator
 * �ж�һ���ַ����Ƿ��ǶԳ��ַ���
 * ����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"�ǶԳ��ַ���
 * 
 * ������
 * 		�ж�һ���ַ����Ƿ��ǶԳƵ��ַ�������ֻ��Ҫ��
 * 			��һ�������һ���Ƚ�
 * 			�ڶ����͵����ڶ����Ƚ�
 * 			...
 * 		�ȽϵĴ����ǳ��ȳ���2��
 */
public class StringBufferTest3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ոݔ��һ���ַ���");
		String s=sc.nextLine();
		boolean b=isSame2(s);
		System.out.println(b);
	}
	
	//��String�ķ�ʽ���D
//	public static boolean isSame(String s){
//		char[] ch=s.toCharArray();
//		for(int start=0,end=ch.length-1;start<end;start++,end--){
//			if(ch[start]!=ch[end]){
//				return false;
//			}
//		}
//		return true;
//	}
	
	//��StringBuffer�ķ�ʽ���D
	public static boolean isSame2(String s) {
//		StringBuffer sb=new StringBuffer(s);
//		StringBuffer s3=sb.reverse();
//		String s4=s3.toString();
//		boolean b=s4.equals(s);
//		return b;
		
		return new StringBuffer(s).reverse().toString().equals(s);
	}

}
