package com.xiahu.Reflect_C;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 * 通过反射获取成员变量并使用
 */
public class RelfectDemo {
	public static void main(String[] args) throws Exception {
		// 获取字节码对象
		Class c = Class.forName("com.xiahu.Reflect_A.Person");

		// 获取所有成员变量
		// public Field[] getFields() 获取公共的成员变量
		Field[] fields = c.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		System.out.println("-------------------");
		// public Field[] getDeclaredFields() 获取所有成员变量
		Field[] f = c.getDeclaredFields();
		for (Field field : f) {
			System.out.println(field);
		}
		System.out.println("-------------------");

		/*
		 * Person p = new Person(); p.address = "北京"; System.out.println(p);
		 */

		// 通过无参构造方法创建对象
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();

		// 获取单个的成员变量
		// 获取name变量并对其赋值
		// public Field getField(String name)

		// NoSuchFieldException

		Field fieldName = c.getDeclaredField("name");
		// public void set(Object obj,Object value) 将指定对象变量上此 Field
		// 对象表示的字段设置为指定的新值
		// IllegalAccessException
		fieldName.setAccessible(true);
		fieldName.set(obj, "夏虎");
		System.out.println(obj);

		// 获取age对象并对其赋值
		Field fieldAge = c.getDeclaredField("age");
		fieldAge.setAccessible(true);
		fieldAge.set(obj, 20);
		System.out.println(obj);

		// 获取address变量并对其赋值
		Field fieldAddress = c.getDeclaredField("address");
		fieldAddress.setAccessible(true);
		fieldAddress.set(obj, "湖北省孝感市");
		System.out.println(obj);
	}
}
