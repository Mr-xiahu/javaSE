package com.xiahu.Date;

import java.util.Date;

/**
 * @author Administrator
 *  public long getTime():获取时间，以毫秒为单位
 *  public void setTime(long time):设置时间
 * 
 * 从Date得到一个毫秒值
 * 		getTime()
 * 把一个毫秒值转换为Date
 * 		构造方法
 * 		setTime(long time)
 */
public class DateDemo2 {
	public static void main(String[] args) {
		Date d=new Date();
		long time=d.getTime();
		System.out.println(time);//等于-->System.out.println(System.currentTimeMillis());
		
		d.setTime(time);
		System.out.println(d);
		
		
	}

}
