package com.xiahunew.reflectC;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 *   获取成员变量并且使用
 *    Field[] fields = c.getFields(); 获取公共的成员变量
 *	  Field[] fields = c.getDeclaredFields();获取所有成员变量
 *    public void set(Object obj,Object value);将指定对象变量上此 Field 对象表示的字段设置为指定的新值。
 */
public class Reflect {
	public static void main(String[] args) throws Exception {
		Class<?> c = Class.forName("com.xiahunew.reflectC.Person");

		// // Field[] fields = c.getFields(); 获取公共的成员变量
		// Field[] fields = c.getFields();
		// for (Field field : fields) {
		// System.out.println(field);
		// // public java.lang.String com.xiahunew.reflectC.Person.address
		// }
		// System.out.println("-----------");
		//
		// // Field[] fields = c.getDeclaredFields();获取所有成员变量
		// Field[] declaredFields = c.getDeclaredFields();
		// for (Field field : declaredFields) {
		// System.out.println(field);
		// // private java.lang.String com.xiahunew.reflectC.Person.name
		// // int com.xiahunew.reflectC.Person.age
		// // public java.lang.String com.xiahunew.reflectC.Person.address
		//
		// }

		// 通过无参构造方法创建对象
		Constructor<?> constructor = c.getConstructor();
		Object object = constructor.newInstance();

		// 公共的成员变量
		// 获取address并对其赋值
		Field address = c.getField("address");

		// public void set(Object obj,Object value)
		// 将指定对象变量上此 Field 对象表示的字段设置为指定的新值。
		address.set(object, "湖北省孝感市孝南区");
		System.out.println(object);

		// 私有的成员变量
		Field name = c.getDeclaredField("name");
		// IllegalAccessException
		name.setAccessible(true);
		name.set(object, "夏虎");
		System.out.println(object);

	}

}
