package com.xiahu.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import com.xiahu.ArrayList.Student;

/*
 * ArrayList�洢�Զ�����󲢱���
 */
public class VectorTest2 {
	public static void main(String[] args) {
		// ����Vector����
		Vector v = new Vector();

		// ����ѧ������
		Student s1 = new Student("�ν�", 28);
		Student s2 = new Student("�ֳ�", 42);
		Student s3 = new Student("����", 16);
		Student s4 = new Student("���", 24);

		// ��ѧ��������뼯��
		v.add(s1);
		v.add(s2);
		v.add(s3);
		v.add(s4);

		// ��������
		// Iterator��ʽ
		Iterator it = v.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("---------");

		// for����
		for (int x = 0; x < v.size(); x++) {
			Student ss = (Student) v.get(x);
			System.out.println(ss.getName() + "---" + ss.getAge());
		}
		System.out.println("-----");
		
		
		////��Enumeration
		Enumeration en=v.elements();
		while(en.hasMoreElements()){
			Student sss=(Student)en.nextElement();
			System.out.println(sss.getName()+"---"+sss.getAge());
		}
		System.out.println("--------");
	}

}
