package com.xiahu.Date;

import java.util.Date;



/**
 * @author Administrator
 *  Date:��ʾ�ض���˲�䣬��ȷ�����롣 
 * 
 *  ���췽����
 * 		Date():���ݵ�ǰ��Ĭ�Ϻ���ֵ�������ڶ���
 * 		Date(long date)�����ݸ����ĺ���ֵ�������ڶ���
 */
public class DateDemo {
	public static void main(String[] args) {
		//Date()
		Date d = new Date();
		System.out.println("d1:" + d);
		
		//Date(long date)�����ݸ����ĺ���ֵ�������ڶ���
		long time = System.currentTimeMillis();
		Date d2=new Date(time);
		System.out.println("d2:"+d2);
	}

}
