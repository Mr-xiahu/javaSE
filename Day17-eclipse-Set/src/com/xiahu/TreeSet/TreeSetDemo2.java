package com.xiahu.TreeSet;

import java.util.TreeSet;

/*
 * TreeSet�洢�Զ�����󲢱�֤�����Ψһ��
 * 
 * A:��û�и���������ô����
 * 		��Ȼ���򣬰��������С��������
 * B:Ԫ��ʲô�����Ψһ��Ҳû������
 * 		��Ա����ֵ����ͬ��Ϊͬһ��Ԫ��
 * 
 */
public class TreeSetDemo2 {
	public static void main(String[] args) {
		// ��������Ԫ��
		TreeSet<Student> ts = new TreeSet<Student>();

		// ����ѧ������
		Student s1 = new Student("�����", 28);
		Student s2 = new Student("������", 40);
		Student s3 = new Student("���Ƴ�", 35);
		Student s4 = new Student("�����", 30);
		Student s5 = new Student("���Ƴ�", 35);
		Student s6 = new Student("���Ƴ�", 40);

		// ��ӵ�����
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);

		// ����
		for (Student s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}

	}

}
