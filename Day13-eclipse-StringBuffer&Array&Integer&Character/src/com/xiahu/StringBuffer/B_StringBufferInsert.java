package com.xiahu.StringBuffer;

/**
 * @author Administrator
 * StringBuffer����ӹ��ܣ�
 * 
 *  public StringBuffer append(String str):
 *  ���԰���������������ӵ��ַ�������������,�������ַ�������������
 * 
 *  public StringBuffer insert(int offset,String str):
 *  ��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ�������������
 *
 */
public class B_StringBufferInsert {
	public static void main(String[] args) {
		//�����ַ�������
		StringBuffer sb=new StringBuffer();
		
		//���԰���������������ӵ��ַ�������������,�������ַ�������������
		//public StringBuffer append(String str):
		
		
		StringBuffer sb2=sb.append("hello");
		System.out.println("sb:"+sb);
		System.out.println("sb2:"+sb2);
		System.out.println(sb==sb2);
		sb.append(true).append('a').append(8).append(12.2);
		System.out.println(sb);
		System.out.println("--------------");
		
//		public StringBuffer insert(int offset,String str):
//	         ��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ�������������
		sb.insert(5, "xiahu");
		System.out.println(sb);
		
	}

}
