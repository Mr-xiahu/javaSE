package com.xiahu.Reflect_Test2;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * �Ҹ���ArrayList<Integer>��һ������������������������һ���ַ������ݣ����ʵ���أ�
 */
public class ArrayListDemo {
	public static void main(String[] args) throws Exception, Exception {
		ArrayList<Integer> array = new ArrayList<Integer>();

		// array.add("hello"); ���ǲ���ʵ�ֵ�

		Class c = array.getClass();// ��ȡArrayList�ļ��϶���
		Method m = c.getDeclaredMethod("add", Object.class);

		m.invoke(array, "hello");
		m.invoke(array, "world");
		m.invoke(array, "JAVA");
		
		System.out.println(array);

	}

}
