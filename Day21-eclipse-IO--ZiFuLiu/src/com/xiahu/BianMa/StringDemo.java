package com.xiahu.BianMa;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 *  String(byte[] bytes, String charsetName):ͨ��ָ�����ַ��������ֽ�����
 * byte[] getBytes(String charsetName):ʹ��ָ�����ַ����ϰ��ַ�������Ϊ�ֽ�����
 * 
 * ����:�ѿ��ö��ı�ɿ�������
 * String -- byte[]
 * 
 * ����:�ѿ������ı�ɿ��ö���
 * byte[] -- String
 * 
 * ��������սƬ(���籨���ӵ籨)
 * 
 * ���С����
 * 		�ַ�	��ֵ
 * 
 * Ҫ����һ�����֣�
 * 		�����������ϵط���
 * 
 * 		���Ͷˣ��� -- ��ֵ -- ������ -- ����ȥ
 * 		���նˣ����� -- ������ -- ʮ���� -- ��ֵ -- �ַ� -- ��
 * 
 * 		�����������ϵط���
 * 
 * ��������򵥣�ֻҪ�������ĸ�ʽ��һ�µġ�
 */
public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "�Ұ���";

		byte[] bys = s.getBytes();// [-50, -46, -80, -82, -60, -29]
		// byte[] bys=s.getBytes("UTF-8");//[-26, -120, -111, -25, -120, -79,
		// -28, -67, -96]
		// byte[] bys=s.getBytes("GBK");//[-50, -46, -80, -82, -60, -29]
		// Ĭ�ϲ��õ���GBK���
		System.out.println(Arrays.toString(bys));

		 String ss=new String(bys);//�Ұ���
		// String ss=new String(bys,"UTF-8");//?????
		// String ss = new String(bys, "GBK");//�Ұ���
		System.out.println(ss);
	}

}
