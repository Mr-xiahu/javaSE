package com.xiahu.Expection_Throws;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��try���淢�������jvm�����������һ���쳣����Ȼ�����������׳�����catch����������ƥ�䡣
 * ����ö�����ĳ�����͵ģ��ͻ�ִ�и�catch����Ĵ�����Ϣ��
 * 
 * �쳣��Ҫ�˽�ļ���������
 * public String getMessage():�쳣����Ϣ�ַ���		
 * public String toString():�����쳣�ļ���Ϣ����
 * 		�˶������� name(ȫ·����)
 * 		": "��ð�ź�һ���ո� 
 * 		���ô˶��� getLocalizedMessage()�����Ľ�� (Ĭ�Ϸ��ص���getMessage()������)
 * printStackTrace() ��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�á�����ֵvoid������Ϣ����ڿ���̨��
 */
public class ExpectionDemo {
	public static void main(String[] args) {
		String date = "2018-11-11";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date newdate = sdf.parse(date);// ������һ��ParseException����Ȼ���׳�ȥ����catch�������ƥ��
			System.out.println(newdate);
		} catch (ParseException e) {// ParseException e = new ParseException();

			// public String getMessage():�쳣����Ϣ�ַ���
			// Unparseable date: "2018-11-11"
			System.out.println(e.getMessage());

			// public String toString():�����쳣�ļ���Ϣ����
			System.out.println(e.toString());
			// �˶������� name(ȫ·����)
			// ": "��ð�ź�һ���ո�
			// java.text.ParseException: Unparseable date: "2018-11-11"

			// printStackTrace() ��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�á�����ֵvoid������Ϣ����ڿ���̨��
			e.printStackTrace();

		}
	}

}
