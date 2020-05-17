package com.xiahu.TreeSet2;

import java.util.Comparator;
import java.util.TreeSet;
/*
 *  TreeSet���ϱ�֤Ԫ�������Ψһ�Ե�ԭ��
 *  Ψһ�ԣ��Ǹ��ݱȽϵķ����Ƿ���0��������
 *  ����
 * 		A:��Ȼ����(Ԫ�ؾ߱��Ƚ���)
 * 			��Ԫ����������ʵ����Ȼ����ӿ� Comparable
 * 		B:�Ƚ�������(���Ͼ߱��Ƚ���)
 * 			�ü��ϵĹ��췽������һ���Ƚ����ӿڵ�������� Comparator
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		// �������϶���
//		TreeSet<Student> ts = new TreeSet<Student>();//��Ȼ����
		// public TreeSet(Comparator comparator) //�Ƚ�������
		TreeSet<Student> ts=new TreeSet<Student>(new MyComparator());
		

		// ���Ԫ�ض���
		Student s1 = new Student("�����1", 28);
		Student s2 = new Student("������12", 40);
		Student s3 = new Student("���Ƴ�4654", 35);
		Student s4 = new Student("�����134654231", 30);
		Student s5 = new Student("���Ƴ�22235", 35);
		Student s6 = new Student("���Ƴ�1", 40);

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
