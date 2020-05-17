package com.xiahu.Reflect_B;

import java.lang.reflect.Constructor;

/*
 * 需求：通过反射获取私有构造方法并使用
 * private Person(String name){}
 * 
 * Person p = new Person("风清扬");
 * System.out.println(p);
 */
public class RelfectDemo3 {
	public static void main(String[] args) throws Exception {
		// 获取字节码对象
		Class c = Class.forName("com.xiahu.Reflect_A.Person");

		// 获取私有构造方法对象
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		// NoSuchMethodException 没这个方法异常
		// Constructor con = c.getConstructor(String.class);

		// public Constructor<T> getDeclaredConstructor(Class<?>...
		// parameterTypes)
		Constructor con = c.getDeclaredConstructor(String.class);

		// 暴力访问
		con.setAccessible(true);// 值为true则指示反射的对象在使用时应该取消Java语言访问检查。

		// 用该私有构造方法创建对象
		// public T newInstance(Object... initargs)
		// IllegalAccessException 没有权限访问这个私有构造方法方法
		Object obj = con.newInstance("夏虎");

		System.out.println(obj);

	}

}
