package com.xiahu.JDK5News;

import java.util.Arrays;
import java.util.List;

/*
 * public static <T> List<T> asList(T... a):������ת�ɼ���
 * 
 * ע�����
 * 		��Ȼ���԰�����ת�ɼ��ϣ����Ǽ��ϵĳ��Ȳ��ܸı䡣
 */
public class ArrayDemo {
	public static void main(String[] args) {
		String[] stu = { "hello", "world", "java" };
		// List<String> list = Arrays.asList(strArray);

		List<String> list = Arrays.asList("hello", "world", "java");
		// UnsupportedOperationException
		// list.add("javaee");
		// UnsupportedOperationException
		// list.remove(1);
		list.set(1, "javaee");

		for(String s:list){
			System.out.println(s);
		}
	}

}
