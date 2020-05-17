package com.xiahu.Reflect_D;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 * 获取无参返回值对象
 */
public class RelfectDemo {
	public static void main(String[] args) throws Exception {
		// 获取字节码对象
		Class c = Class.forName("com.xiahu.Reflect_A.Person");

		// 获取所有方法
		// public Method[] getMethods()// 获取自己的包括父亲的公共方法
		Method[] methods = c.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("---------------");

		// public Method[] getDeclaredMethods()
		Method[] methodss = c.getDeclaredMethods();// 获取自己的所有的方法
		for (Method method : methodss) {
			System.out.println(method);
		}
		System.out.println("---------------");
		
		// 获取构造方法
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();

		/*
		 * Person p = new Person(); p.show();
		 */

		// 获取单个方法并使用
		// public void show()
		// public Method getMethod(String name,Class<?>... parameterTypes)
		// 第一个参数表示的方法名，第二个参数表示的是方法的参数的class类型
		Method m1 = c.getMethod("show");
		// obj.m1(); // 错误
		// public Object invoke(Object obj,Object... args)
		// 返回值是Object接收,第一个参数表示对象是谁，第二参数表示调用该方法的实际参数
		m1.invoke(obj);// 调用obj对象的m1方法

		System.out.println("----------------");

		// public void method(String s) {
		Method m2 = c.getMethod("method", String.class);
		m2.setAccessible(true);
		m2.invoke(obj, "hello");
		System.out.println("----------------");

		// public String getString(String s, int i) {
		Method m3 = c.getDeclaredMethod("getString", String.class, int.class);
		m3.setAccessible(true);
		Object getString = m3.invoke(obj, "去你大爷的", 34);
		System.out.println(getString);
		System.out.println("----------------");

		// private void function()
		Method m4 = c.getDeclaredMethod("function");
		m4.setAccessible(true);
		m4.invoke(obj);

	}
}
