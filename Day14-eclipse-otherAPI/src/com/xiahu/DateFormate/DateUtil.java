package com.xiahu.DateFormate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * 这是字符串与日期相互转换的工具类
 * @author 夏小Fu
 *
 */
public class DateUtil {
	private DateUtil(){}
	
	
	/**
	 * 这是方法的作用就是把一个日期 转化成一个字符串
	 * @param d  输入的日期
	 * @param formate  传递过来的要被转化成的格式
	 * @return  转化的字符串
	 */
	public static String dateToString(Date d,String formate){
//		SimpleDateFormat sdf=new SimpleDateFormat(formate);
//		sdf.format(d);
		
		return new SimpleDateFormat(formate).format(d);
	}
	
	/**
	 * 这个方法的作用就是把一个字符串转化成一个日期
	 * @param formate 传递过来的要被转换的格式
	 * @param s  被解析的字符串
	 * @return  解析后的日期对象
	 * @throws ParseException 抛出的异常
	 */
	public static Date stringToDate(String s,String formate) throws ParseException{
		return new SimpleDateFormat(formate).parse(s);
		
	}

}
