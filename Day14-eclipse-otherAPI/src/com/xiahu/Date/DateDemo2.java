package com.xiahu.Date;

import java.util.Date;

/**
 * @author Administrator
 *  public long getTime():��ȡʱ�䣬�Ժ���Ϊ��λ
 *  public void setTime(long time):����ʱ��
 * 
 * ��Date�õ�һ������ֵ
 * 		getTime()
 * ��һ������ֵת��ΪDate
 * 		���췽��
 * 		setTime(long time)
 */
public class DateDemo2 {
	public static void main(String[] args) {
		Date d=new Date();
		long time=d.getTime();
		System.out.println(time);//����-->System.out.println(System.currentTimeMillis());
		
		d.setTime(time);
		System.out.println(d);
		
		
	}

}
