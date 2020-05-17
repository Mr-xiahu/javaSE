package com.xiahu.DateFormate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 *  Date	 --	 String(��ʽ��)
 * 		public final String format(Date date)
 * 
 *  String -- Date(����)
 * 		public Date parse(String source)
 * 
 *  DateForamt:���Խ������ں��ַ����ĸ�ʽ���ͽ��������������ǳ����࣬����ʹ�þ�������SimpleDateFormat��
 * 
 *  SimpleDateFormat�Ĺ��췽����
 * 		SimpleDateFormat():Ĭ��ģʽ
 * 		SimpleDateFormat(String pattern):������ģʽ
 * 			���ģʽ�ַ��������д��?
 * 			ͨ���鿴API�����Ǿ��ҵ��˶�Ӧ��ģʽ
 * 			�� y
 * 			�� M	
 * 			�� d
 * 			ʱ H
 * 			�� m
 * 			�� s
 * 
 * 			2014��12��12�� 12:12:12
 */
public class DateFormateDemo {
	public static void main(String[] args) throws ParseException   {
		// Date --> String
		// �������ڶ���
		Date d = new Date();
		// ������ʽ������
		// Ĭ��ģʽ
		// SimpleDateFormat sd=new SimpleDateFormat();
		// ����ģʽ
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		String format = simpleDateFormat.format(d);
		System.out.println(format);
		// String --> Date
		String ss = "2018-5-12 19:23:12";
		////�ڰ�һ���ַ�������Ϊ���ڵ�ʱ����ע���ʽ����͸������ַ�����ʽƥ��
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf2.parse(ss);
		System.out.println(dd);
		
		
	}

}
