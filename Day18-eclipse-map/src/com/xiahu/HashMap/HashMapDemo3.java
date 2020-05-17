package com.xiahu.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * HashMap<String,Student>
 * 键：String	学号
 * 值：Student 学生对象
 */
public class HashMapDemo3 {
	// 创建集合对象
	public static void main(String[] args) {
		// 创建集合对象
		HashMap<String, Student> hs = new HashMap<String, Student>();

		// 创建元素对象
		Student s1 = new Student("刘德华", 30);
		Student s2 = new Student("张学友", 31);
		Student s3 = new Student("郭富城", 30);
		Student s4 = new Student("黎明", 19);
		Student s5 = new Student("成龙", 60);
		
		//添加集合元素
		hs.put("9527", s1);
		hs.put("4862", s2);
		hs.put("8916", s3);
		hs.put("4986", s4);
		hs.put("3894", s5);
		
		//遍历
		Set<Map.Entry<String, Student>> set=hs.entrySet();
		for(Map.Entry<String, Student> me:set){
			String name=me.getValue().getName();
			int age=me.getValue().getAge();
			System.out.println(me.getKey()+"---"+name+"---"+age);
		}
	}

}
