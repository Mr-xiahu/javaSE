package com.xiahu.DateFormate;

import java.text.ParseException;
import java.util.Date;

public class DateUtilDemo {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		//yyyy年MM月dd日 HH:MM:ss
		String formate="yyyy年MM月dd日 HH:MM:ss";
		String s=DateUtil.dateToString(d, formate);
		System.out.println(s);
		
		String str = "2014-10-14 18:32:56";
		Date dd = DateUtil.stringToDate(str, "yyyy-MM-dd HH:MM:ss");
		System.out.println(dd);
	}

}
