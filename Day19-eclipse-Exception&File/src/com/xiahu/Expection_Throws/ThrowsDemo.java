package com.xiahu.Expection_Throws;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��Щʱ�������ǿ��Զ��쳣���д���ģ���������Щʱ�����Ǹ�����û��Ȩ��ȥ����ĳ���쳣��
 * ����˵���Ҵ����ˣ��ҾͲ������ˡ�
 * Ϊ�˽���������⣬Java���������������ṩ����һ�ִ��������׳���
 * 
 * ��ʽ��
 * 		throws �쳣����
 * 		ע�⣺�����ʽ������ڷ��������ź��档
 * 
 * ע�⣺
 * 		������Ҫ��main�������׳��쳣��
 * 		�����ҽ���Ϊ�˷����Ҿ��������ˡ�
 * 
 * С�᣺
 * 		�������쳣�׳������������߱��봦��
 * 		�������쳣�׳����������ÿ��Բ��ô���
 */

public class ThrowsDemo {
	public static void main(String[] args) {
		System.out.println("���Ǻ�ѽ�����Ӷ�");
		try {
			method();
		} catch (ParseException e) {

			e.printStackTrace();
		}
		System.out.println("��������ѽ��");
		method2();
	}

	// // �������쳣���׳�
	// �ڷ����������׳�����Ϊ�˸��ߵ����ߣ���ע���ˣ��������⡣
	public static void method() throws ParseException {
		String s = "2018-05-18";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(s);
		System.out.println(d);

	}

	// �������쳣�׳�
	//���ô���
	public static void method2() {
		int a = 10;
		int b = 0;
		System.out.println(a / b);

	}

}
