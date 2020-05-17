package com.xiahu.Calender;

import java.util.Calendar;

/**
 * @author Administrator
 *  Calendar:它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等 日历字段之间的转换提供了一些方法，
 *           并为操作日历字段（例如获得下星期的日期）提供了一些方法。
 * 
 *  public int get(int field):返回给定日历字段的值。日历类中的每个日历字段都是静态的成员变量，并且是int类型。
 */
public class CalenderDemo {
	public static void main(String[] args) {
		Calendar rigthNow=Calendar.getInstance();
		
		//获取年  月   日
		int year=rigthNow.get(Calendar.YEAR);
		int month=rigthNow.get(Calendar.MONTH);
		int day=rigthNow.get(Calendar.DATE);
		int hou=rigthNow.get(Calendar.HOUR);
		int min=rigthNow.get(Calendar.MINUTE);
		System.out.println(year+"年"+(month+1)+"月"+day+"日"+hou+"时"+min+"分");
	}

}
