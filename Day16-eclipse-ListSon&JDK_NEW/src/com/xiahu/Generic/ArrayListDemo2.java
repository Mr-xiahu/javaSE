package com.xiahu.Generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.xiahu.ArrayList.Student;

/*
 * 
 * ���󣺴洢�Զ�����󲢱�����
 * 
 * A:����ѧ����
 * B:�������϶���
 * C:����Ԫ�ض���
 * D:��Ԫ����ӵ�����
 * E:��������
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		// �������϶���
		// JDK7�������ԣ������ƶϡ�
		// ArrayList<Student> array = new ArrayList<>();
		// �����Ҳ���������ʹ�á�
		ArrayList<Student> array=new ArrayList<Student>();
		
		//����ѧ������
		Student s1=new Student("�����", 28);
		Student s2=new Student("����", 29);
		Student s3=new Student("�ܲ�", 56);
		
		//��Ӽ��϶���
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		//����
		Iterator<Student> it=array.iterator();
		while(it.hasNext()){
			Student s=it.next();
			System.out.println(s.getName()+"--"+s.getAge());
		}
		System.out.println("------------");
		
		for(int x=0;x<array.size();x++){
			Student ss=array.get(x);
			System.out.println(ss.getName()+"--"+ss.getAge());
		}
	}

}
