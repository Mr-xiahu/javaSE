package com.xiahu.Reflect_B;

import java.lang.reflect.Constructor;

/*
 * ͨ�������ȡ���췽����ʹ�á�
 * 		public Constructor[] getConstructors():���й������췽��
 *		public Constructor[] getDeclaredConstructors():���й��췽��
 *      public T newInstance(Object... initargs)
 *      �����ʾ�Ĺ��췽���������ù��췽�������������ʵ��������ָ���ĳ�ʼ��������ʼ����ʵ����
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		// ��ȡ�ֽ����ļ�����
		Class c = Class.forName("com.xiahu.Reflect_A.Person");

		// public Constructor[] getConstructors():���й������췽��
		Constructor[] constructors = c.getConstructors();
		// �������й������췽��
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		System.out.println("----------------");

		// ��ȡ�������췽��
		Constructor constructor = c.getConstructor();
		System.out.println(constructor);
		System.out.println("----------------");

		// public T newInstance(Object... initargs)
		// ʹ�ô� Constructor �����ʾ�Ĺ��췽���������ù��췽�������������ʵ��������ָ���ĳ�ʼ��������ʼ����ʵ����
		Object object = constructor.newInstance();
		System.out.println(object);//Person [name=null, age=0, address=null
	}

}
