package com.xiahu.TreeSet2;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// s1=this
		// s2=s
		// return 0;
		// 姓名的长度
		int num = s1.getName().length() - s2.getName().length();
		// 姓名的长度一样，内容是否一样
		int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
		// 年龄是否一样
		int num3 = num2 == 0 ? s2.getAge()-s1.getAge() : num2;
		return num3;
	}
}
