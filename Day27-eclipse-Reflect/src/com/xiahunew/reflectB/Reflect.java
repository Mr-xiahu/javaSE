package com.xiahunew.reflectB;

import java.lang.reflect.Constructor;

/*
 * 
 *  通过反射获取构造方法并使用。
 *      // public Constructor[] getConstructors():所有公共构造方法
 *		// public Constructor[] getDeclaredConstructors():所有构造方法
 *      // public T newInstance(Object... initargs)对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
 */
public class Reflect {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.xiahunew.reflectB.Person");

		/*
		 * // public Constructor[] getConstructors():所有公共构造方法 Constructor[]
		 * constructors = c.getConstructors(); // 遍历查看一下 for (Constructor
		 * constructor : constructors) { System.out.println(constructor); //
		 * public //
		 * com.xiahunew.reflectB.Person(java.lang.String,int,java.lang.String)
		 * // public com.xiahunew.reflectB.Person() }
		 * System.out.println("------------------------");
		 * 
		 * // public Constructor[] getDeclaredConstructors():所有构造方法
		 * Constructor[] declaredConstructors = c.getDeclaredConstructors(); for
		 * (Constructor constructor : declaredConstructors) {
		 * System.out.println(constructor); }
		 */

		// 获取公共构造方法
		// 无参数构造
		Constructor con = c.getConstructor();

		// 带参构造
		Constructor con2 = c.getConstructor(String.class, int.class, String.class);

		// 初始化参数初始化实例
		Object newInstance = con.newInstance();
		System.out.println(newInstance);
		Object newInstance2 = con2.newInstance("张三", 32, "湖北省武汉市");
		System.out.println(newInstance2);
		System.out.println("-------------------");

		// 获取私有构造方法
		Constructor declaredConstructor = c.getDeclaredConstructor(String.class);
		
		
		// 用该私有构造方法创建对象
		// IllegalAccessException:非法的访问异常。
		// 暴力访问
		declaredConstructor.setAccessible(true);// 值为true则指示反射的对象在使用时应该取消Java语言访问检查。
		
		
		Object newInstance3 = declaredConstructor.newInstance("夏虎");
		System.out.println(newInstance3);
	}

}
