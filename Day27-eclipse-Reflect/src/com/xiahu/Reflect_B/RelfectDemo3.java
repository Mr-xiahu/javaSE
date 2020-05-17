package com.xiahu.Reflect_B;

import java.lang.reflect.Constructor;

/*
 * ����ͨ�������ȡ˽�й��췽����ʹ��
 * private Person(String name){}
 * 
 * Person p = new Person("������");
 * System.out.println(p);
 */
public class RelfectDemo3 {
	public static void main(String[] args) throws Exception {
		// ��ȡ�ֽ������
		Class c = Class.forName("com.xiahu.Reflect_A.Person");

		// ��ȡ˽�й��췽������
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		// NoSuchMethodException û��������쳣
		// Constructor con = c.getConstructor(String.class);

		// public Constructor<T> getDeclaredConstructor(Class<?>...
		// parameterTypes)
		Constructor con = c.getDeclaredConstructor(String.class);

		// ��������
		con.setAccessible(true);// ֵΪtrue��ָʾ����Ķ�����ʹ��ʱӦ��ȡ��Java���Է��ʼ�顣

		// �ø�˽�й��췽����������
		// public T newInstance(Object... initargs)
		// IllegalAccessException û��Ȩ�޷������˽�й��췽������
		Object obj = con.newInstance("�Ļ�");

		System.out.println(obj);

	}

}
