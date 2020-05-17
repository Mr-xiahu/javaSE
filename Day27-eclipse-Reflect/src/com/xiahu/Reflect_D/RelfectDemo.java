package com.xiahu.Reflect_D;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 * ��ȡ�޲η���ֵ����
 */
public class RelfectDemo {
	public static void main(String[] args) throws Exception {
		// ��ȡ�ֽ������
		Class c = Class.forName("com.xiahu.Reflect_A.Person");

		// ��ȡ���з���
		// public Method[] getMethods()// ��ȡ�Լ��İ������׵Ĺ�������
		Method[] methods = c.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("---------------");

		// public Method[] getDeclaredMethods()
		Method[] methodss = c.getDeclaredMethods();// ��ȡ�Լ������еķ���
		for (Method method : methodss) {
			System.out.println(method);
		}
		System.out.println("---------------");
		
		// ��ȡ���췽��
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();

		/*
		 * Person p = new Person(); p.show();
		 */

		// ��ȡ����������ʹ��
		// public void show()
		// public Method getMethod(String name,Class<?>... parameterTypes)
		// ��һ��������ʾ�ķ��������ڶ���������ʾ���Ƿ����Ĳ�����class����
		Method m1 = c.getMethod("show");
		// obj.m1(); // ����
		// public Object invoke(Object obj,Object... args)
		// ����ֵ��Object����,��һ��������ʾ������˭���ڶ�������ʾ���ø÷�����ʵ�ʲ���
		m1.invoke(obj);// ����obj�����m1����

		System.out.println("----------------");

		// public void method(String s) {
		Method m2 = c.getMethod("method", String.class);
		m2.setAccessible(true);
		m2.invoke(obj, "hello");
		System.out.println("----------------");

		// public String getString(String s, int i) {
		Method m3 = c.getDeclaredMethod("getString", String.class, int.class);
		m3.setAccessible(true);
		Object getString = m3.invoke(obj, "ȥ���ү��", 34);
		System.out.println(getString);
		System.out.println("----------------");

		// private void function()
		Method m4 = c.getDeclaredMethod("function");
		m4.setAccessible(true);
		m4.invoke(obj);

	}
}
