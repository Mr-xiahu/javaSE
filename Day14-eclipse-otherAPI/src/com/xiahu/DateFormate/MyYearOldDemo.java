package com.xiahu.DateFormate;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Administrator ��һ��������������������?
 * 
 *         ������ A:����¼����ĳ����������� B:�Ѹ��ַ���ת��Ϊһ������ C:ͨ�������ڵõ�һ������ֵ D:��ȡ��ǰʱ��ĺ���ֵ
 *         E:��D-C�õ�һ������ֵ F:��E�ĺ���ֵת��Ϊ�� /1000/60/60/24
 */
public class MyYearOldDemo {
	public static void main(String[] args) throws ParseException {
		 // A:����¼����ĳ�����������
		 Scanner sc = new Scanner(System.in);
		 System.out.println("��������ĳ���������");
		 String time = sc.nextLine();
		
		 // B:�Ѹ��ַ���ת��Ϊһ������
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
		 Date d = sdf.parse(time);
		 // System.out.println(d);
		
		 // C:ͨ�������ڵõ�һ������ֵ
		 long startTime = d.getTime();
		 // System.out.println(startTime);
		
		 // D:��ȡ��ǰʱ��ĺ���ֵ
		
		 long nowTime = System.currentTimeMillis();
		
		 // E:��D-C�õ�һ������ֵ
		 long oldTime = nowTime - startTime;
		 // System.out.println(oldTime);
		
		 // F:��E�ĺ���ֵת��Ϊ��
		 long day = oldTime / 1000 / 60 / 60 / 24;
		 long year=oldTime / 1000 / 60 / 60 / 24/365;
		 System.out.println("�����������������"+day+"��");
		 System.out.println("�����������������"+year+"��");
		 
		
	}

}
