package com.xiahu.StringBuffer;

/**
 * @author Administrator
 *  
 *  StringBuffer�Ľ�ȡ����:ע�ⷵ��ֵ���Ͳ�����StringBuffer������
 *  public String substring(int start)
 *  public String substring(int start,int end)
 */
public class E_StringBufferSubstring {
	public static void main(String[] args) {
		
		//�����ַ���������
		StringBuffer sb=new StringBuffer();
		
		//���Ԫ��
		sb.append("hello").append("world").append("java");
		System.out.println(sb);
		//��ȡ����
		//public String substring(int start)
		String s=sb.substring(5);
		System.out.println(s);
		
		// public String substring(int start,int end)
				
		String ss = sb.substring(5, 10);
				
		System.out.println("ss:" + ss);
				
		System.out.println("sb:" + sb);
		
	}

}
