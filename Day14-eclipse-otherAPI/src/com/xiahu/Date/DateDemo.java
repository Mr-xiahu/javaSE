package com.xiahu.Date;

import java.util.Date;



/**
 * @author Administrator
 *  Date:表示特定的瞬间，精确到毫秒。 
 * 
 *  构造方法：
 * 		Date():根据当前的默认毫秒值创建日期对象
 * 		Date(long date)：根据给定的毫秒值创建日期对象
 */
public class DateDemo {
	public static void main(String[] args) {
		//Date()
		Date d = new Date();
		System.out.println("d1:" + d);
		
		//Date(long date)：根据给定的毫秒值创建日期对象
		long time = System.currentTimeMillis();
		Date d2=new Date(time);
		System.out.println("d2:"+d2);
	}

}
