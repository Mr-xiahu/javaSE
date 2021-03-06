package com.xiahu.Calender;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Administrator
 *  获取任意一年的二月有多少天
 * 
 *  分析：
 * 		A:键盘录入任意的年份
 * 		B:设置日历对象的年月日
 * 			年就是A输入的数据
 * 			月是2
 * 			日是1
 * 		C:把时间往前推一天，就是2月的最后一天
 * 		D:获取这一天输出即可
 */
public class CalenderTest {
	public static void main(String[] args) {
		//键盘录入事件
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年份");
		int year=sc.nextInt();
		
		//B:设置日历对象的年月日
		Calendar c=Calendar.getInstance();
		c.set(year, 2, 1);
		c.add(Calendar.DATE, -1);
		System.out.println(c.get(Calendar.DATE));
	}

}
