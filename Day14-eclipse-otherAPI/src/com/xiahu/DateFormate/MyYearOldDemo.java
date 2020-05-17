package com.xiahu.DateFormate;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Administrator 算一下你来到这个世界多少天?
 * 
 *         分析： A:键盘录入你的出生的年月日 B:把该字符串转换为一个日期 C:通过该日期得到一个毫秒值 D:获取当前时间的毫秒值
 *         E:用D-C得到一个毫秒值 F:把E的毫秒值转换为年 /1000/60/60/24
 */
public class MyYearOldDemo {
	public static void main(String[] args) throws ParseException {
		 // A:键盘录入你的出生的年月日
		 Scanner sc = new Scanner(System.in);
		 System.out.println("请输入你的出生年月日");
		 String time = sc.nextLine();
		
		 // B:把该字符串转换为一个日期
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
		 Date d = sdf.parse(time);
		 // System.out.println(d);
		
		 // C:通过该日期得到一个毫秒值
		 long startTime = d.getTime();
		 // System.out.println(startTime);
		
		 // D:获取当前时间的毫秒值
		
		 long nowTime = System.currentTimeMillis();
		
		 // E:用D-C得到一个毫秒值
		 long oldTime = nowTime - startTime;
		 // System.out.println(oldTime);
		
		 // F:把E的毫秒值转换为年
		 long day = oldTime / 1000 / 60 / 60 / 24;
		 long year=oldTime / 1000 / 60 / 60 / 24/365;
		 System.out.println("你来到这个世界上有"+day+"天");
		 System.out.println("你来到这个世界上有"+year+"年");
		 
		
	}

}
