package com.xiahu.DateFormate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * �����ַ����������໥ת���Ĺ�����
 * @author ��СFu
 *
 */
public class DateUtil {
	private DateUtil(){}
	
	
	/**
	 * ���Ƿ��������þ��ǰ�һ������ ת����һ���ַ���
	 * @param d  ���������
	 * @param formate  ���ݹ�����Ҫ��ת���ɵĸ�ʽ
	 * @return  ת�����ַ���
	 */
	public static String dateToString(Date d,String formate){
//		SimpleDateFormat sdf=new SimpleDateFormat(formate);
//		sdf.format(d);
		
		return new SimpleDateFormat(formate).format(d);
	}
	
	/**
	 * ������������þ��ǰ�һ���ַ���ת����һ������
	 * @param formate ���ݹ�����Ҫ��ת���ĸ�ʽ
	 * @param s  ���������ַ���
	 * @return  ����������ڶ���
	 * @throws ParseException �׳����쳣
	 */
	public static Date stringToDate(String s,String formate) throws ParseException{
		return new SimpleDateFormat(formate).parse(s);
		
	}

}
