package com.xiahu.TreeSet;

/*
 * ���һ�����Ԫ��Ҫ���ܹ�������Ȼ���򣬾ͱ���ʵ����Ȼ����ӿ�
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
		// ��Ҫ����
		int s = this.name.length() - t.name.length();
		// return s;
		// // �����ĳ�����ͬ��������������������ͬ
		int s2 = s == 0 ? this.name.compareTo(t.name) : s;
		// return s2;
		// �����ĳ��Ⱥ�������ͬ��������������ͬ�����Ի��ü����ж�����
		int s3 = s2 == 0 ? this.age - t.age : s2;
		return s3;

	}

}
