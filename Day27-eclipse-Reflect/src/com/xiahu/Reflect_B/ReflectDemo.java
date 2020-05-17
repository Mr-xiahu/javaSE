package com.xiahu.Reflect_B;

import java.lang.reflect.Constructor;

/*
 * 通过反射获取构造方法并使用。
 * 		public Constructor[] getConstructors():所有公共构造方法
 *		public Constructor[] getDeclaredConstructors():所有构造方法
 *      public T newInstance(Object... initargs)
 *      对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class c = Class.forName("com.xiahu.Reflect_A.Person");

		// public Constructor[] getConstructors():所有公共构造方法
		Constructor[] constructors = c.getConstructors();
		// 遍历所有公共构造方法
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		System.out.println("----------------");

		// 获取单个构造方法
		Constructor constructor = c.getConstructor();
		System.out.println(constructor);
		System.out.println("----------------");

		// public T newInstance(Object... initargs)
		// 使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
		Object object = constructor.newInstance();
		System.out.println(object);//Person [name=null, age=0, address=null
	}

}
