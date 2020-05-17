package com.xiahu.TreeSet;

/*
 * 如果一个类的元素要想能够进行自然排序，就必须实现自然排序接口
 */
public class Teacher implements Comparable<Teacher> {
	private String name;
	private int age;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Teacher t) {

		// return 0;
		// 主要条件
		int s = this.name.length() - t.name.length();
		// return s;
		// // 姓名的长度相同，不代表姓名的内容相同
		int s2 = s == 0 ? this.name.compareTo(t.name) : s;
		// return s2;
		// 姓名的长度和内容相同，不代表年龄相同，所以还得继续判断年龄
		int s3 = s2 == 0 ? this.age - t.age : s2;
		return s3;

	}

}
