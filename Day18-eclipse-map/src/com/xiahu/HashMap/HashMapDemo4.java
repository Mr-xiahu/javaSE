package com.xiahu.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * HashMap<Student,String>
 * 键：Student
 * 		要求：如果两个对象的成员变量值都相同，则为同一个对象。
 * 值：String
 */
public class HashMapDemo4 {
	public static void main(String[] args) {
		HashMap<Student, String> hm=new HashMap<Student, String>();
		
		//创建元素对象
		Student s1 = new Student("刘德华", 30);
		Student s2 = new Student("张学友", 31);
		Student s3 = new Student("郭富城", 30);
		Student s4 = new Student("黎明", 19);
		Student s5 = new Student("成龙", 60);
		Student s6 = new Student("成龙", 60);
		
		//添加集合元素
		hm.put(s1, "9999");
		hm.put(s2, "8888");
		hm.put(s3, "7777");
		hm.put(s4, "6666");
		hm.put(s5, "0000");
		hm.put(s6, "1111");
		
		//遍历
		Set<Map.Entry<Student, String>> set=hm.entrySet();
		for(Map.Entry<Student, String> me:set){
			String name=me.getKey().getName();
			int age=me.getKey().getAge();
			System.out.println(name+"---"+age+"---"+me.getValue());
		}
		
	}

}
