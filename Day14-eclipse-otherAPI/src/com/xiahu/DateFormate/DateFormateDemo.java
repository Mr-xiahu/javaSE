package com.xiahu.DateFormate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 *  Date	 --	 String(格式化)
 * 		public final String format(Date date)
 * 
 *  String -- Date(解析)
 * 		public Date parse(String source)
 * 
 *  DateForamt:可以进行日期和字符串的格式化和解析，但是由于是抽象类，所以使用具体子类SimpleDateFormat。
 * 
 *  SimpleDateFormat的构造方法：
 * 		SimpleDateFormat():默认模式
 * 		SimpleDateFormat(String pattern):给定的模式
 * 			这个模式字符串该如何写呢?
 * 			通过查看API，我们就找到了对应的模式
 * 			年 y
 * 			月 M	
 * 			日 d
 * 			时 H
 * 			分 m
 * 			秒 s
 * 
 * 			2014年12月12日 12:12:12
 */
public class DateFormateDemo {
	public static void main(String[] args) throws ParseException   {
		// Date --> String
		// 创建日期对象
		Date d = new Date();
		// 创建格式化对象
		// 默认模式
		// SimpleDateFormat sd=new SimpleDateFormat();
		// 给定模式
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		String format = simpleDateFormat.format(d);
		System.out.println(format);
		// String --> Date
		String ss = "2018-5-12 19:23:12";
		////在把一个字符串解析为日期的时候，请注意格式必须和给定的字符串格式匹配
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf2.parse(ss);
		System.out.println(dd);
		
		
	}

}
