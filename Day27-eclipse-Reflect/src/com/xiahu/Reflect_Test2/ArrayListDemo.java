package com.xiahu.Reflect_Test2;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * 我给你ArrayList<Integer>的一个对象，我想在这个集合中添加一个字符串数据，如何实现呢？
 */
public class ArrayListDemo {
	public static void main(String[] args) throws Exception, Exception {
		ArrayList<Integer> array = new ArrayList<Integer>();

		// array.add("hello"); 这是不能实现的

		Class c = array.getClass();// 获取ArrayList的集合对象
		Method m = c.getDeclaredMethod("add", Object.class);

		m.invoke(array, "hello");
		m.invoke(array, "world");
		m.invoke(array, "JAVA");
		
		System.out.println(array);

	}

}
