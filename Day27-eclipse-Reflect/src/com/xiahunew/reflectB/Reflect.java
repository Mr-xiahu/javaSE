package com.xiahunew.reflectB;

import java.lang.reflect.Constructor;

/*
 * 
 *  ͨ�������ȡ���췽����ʹ�á�
 *      // public Constructor[] getConstructors():���й������췽��
 *		// public Constructor[] getDeclaredConstructors():���й��췽��
 *      // public T newInstance(Object... initargs)�����ʾ�Ĺ��췽���������ù��췽�������������ʵ��������ָ���ĳ�ʼ��������ʼ����ʵ����
 */
public class Reflect {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.xiahunew.reflectB.Person");

		/*
		 * // public Constructor[] getConstructors():���й������췽�� Constructor[]
		 * constructors = c.getConstructors(); // �����鿴һ�� for (Constructor
		 * constructor : constructors) { System.out.println(constructor); //
		 * public //
		 * com.xiahunew.reflectB.Person(java.lang.String,int,java.lang.String)
		 * // public com.xiahunew.reflectB.Person() }
		 * System.out.println("------------------------");
		 * 
		 * // public Constructor[] getDeclaredConstructors():���й��췽��
		 * Constructor[] declaredConstructors = c.getDeclaredConstructors(); for
		 * (Constructor constructor : declaredConstructors) {
		 * System.out.println(constructor); }
		 */

		// ��ȡ�������췽��
		// �޲�������
		Constructor con = c.getConstructor();

		// ���ι���
		Constructor con2 = c.getConstructor(String.class, int.class, String.class);

		// ��ʼ��������ʼ��ʵ��
		Object newInstance = con.newInstance();
		System.out.println(newInstance);
		Object newInstance2 = con2.newInstance("����", 32, "����ʡ�人��");
		System.out.println(newInstance2);
		System.out.println("-------------------");

		// ��ȡ˽�й��췽��
		Constructor declaredConstructor = c.getDeclaredConstructor(String.class);
		
		
		// �ø�˽�й��췽����������
		// IllegalAccessException:�Ƿ��ķ����쳣��
		// ��������
		declaredConstructor.setAccessible(true);// ֵΪtrue��ָʾ����Ķ�����ʹ��ʱӦ��ȡ��Java���Է��ʼ�顣
		
		
		Object newInstance3 = declaredConstructor.newInstance("�Ļ�");
		System.out.println(newInstance3);
	}

}
