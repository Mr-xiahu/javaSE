package com.xiahu.Reflect_B;

import java.lang.reflect.Constructor;

/*
 * 
 * ����ͨ������ȥ��ȡ�ù��췽����ʹ�ã�
 * public Person(String name, int age, String address)
 * 
 * Person p = new Person("����ϼ",27,"����");
 * System.out.println(p);
 */
public class RelfectDemo2 {
	public static void main(String[] args) throws Exception {
		//��ȡ�ֽ����ļ�����
		Class c = Class.forName("com.xiahu.Reflect_A.Person");
		
		//��ȡ�������췽��
		Constructor constructor = c.getConstructor(String.class,int.class,String.class);
		
		//ʵ�������췽��
		Object newInstance = constructor.newInstance("�Ļ�",21,"�����人");
		System.out.println(newInstance);//Person [name=�Ļ�, age=21, address=�����人]

	}

}
