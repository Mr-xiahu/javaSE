package com.xiahu.Calender;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Administrator
 *  ��ȡ����һ��Ķ����ж�����
 * 
 *  ������
 * 		A:����¼����������
 * 		B:�������������������
 * 			�����A���������
 * 			����2
 * 			����1
 * 		C:��ʱ����ǰ��һ�죬����2�µ����һ��
 * 		D:��ȡ��һ���������
 */
public class CalenderTest {
	public static void main(String[] args) {
		//����¼���¼�
		Scanner sc=new Scanner(System.in);
		System.out.println("���������");
		int year=sc.nextInt();
		
		//B:�������������������
		Calendar c=Calendar.getInstance();
		c.set(year, 2, 1);
		c.add(Calendar.DATE, -1);
		System.out.println(c.get(Calendar.DATE));
	}

}
