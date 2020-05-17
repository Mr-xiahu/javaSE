package com.xiahu.TreeSet;

import java.util.TreeSet;

/*
 * TreeSet存储自定义对象并保证排序和唯一。
 * 
 * A:你没有告诉我们怎么排序
 * 		自然排序，按照年龄从小到大排序
 * B:元素什么情况算唯一你也没告诉我
 * 		成员变量值都相同即为同一个元素
 * 
 */
public class TreeSetDemo2 {
	public static void main(String[] args) {
		// 创建几个元素
		TreeSet<Student> ts = new TreeSet<Student>();

		// 创建学生对象
		Student s1 = new Student("诸葛亮", 28);
		Student s2 = new Student("刘玄德", 40);
		Student s3 = new Student("关云长", 35);
		Student s4 = new Student("张翼德", 30);
		Student s5 = new Student("关云长", 35);
		Student s6 = new Student("关云长", 40);

		// 添加到集合
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);

		// 遍历
		for (Student s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}

	}

}
