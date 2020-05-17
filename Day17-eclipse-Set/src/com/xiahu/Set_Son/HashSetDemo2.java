package com.xiahu.Set_Son;

import java.util.HashSet;
import java.util.Set;

/*
 * 需求：存储自定义对象，并保证元素的唯一性
 * 要求：如果两个对象的成员变量值都相同，则为同一个元素。
 * 
 * 目前是不符合我的要求的：因为我们知道HashSet底层依赖的是hashCode()和equals()方法。
 * 而这两个方法我们在学生类中没有重写，所以，默认使用的是Object类。
 * 这个时候，他们的哈希值是不会一样的，根本就不会继续判断，执行了添加操作。
 */
public class HashSetDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		Set<Student> set = new HashSet<Student>();

		// 创建集合元素
		Student s1 = new Student("刘玄德", 50);
		Student s2 = new Student("诸葛亮", 25);
		Student s3 = new Student("关云长", 35);
		Student s4 = new Student("赵子龙", 23);
		Student s5 = new Student("张翼德", 30);
		Student s6 = new Student("黄汉升", 60);
		Student s7 = new Student("黄汉升", 60);
		
		//添加集合对象
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		set.add(s7);
		
		//遍历集合
		for(Student s:set){
			System.out.println(s.getName()+"--"+s.getAge());
		}

	}

}
