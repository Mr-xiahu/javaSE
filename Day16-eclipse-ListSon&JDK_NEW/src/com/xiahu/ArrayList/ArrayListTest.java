package com.xiahu.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList�洢�Զ�����󲢱���
 */
public class ArrayListTest {
	public static void main(String[] args) {
		//����ArrayList����
		ArrayList al=new ArrayList();
		
		// ����ѧ������
		Student s1=new Student("�ν�", 28);
		Student s2=new Student("�ֳ�", 42);
		Student s3=new Student("����", 16);
		Student s4=new Student("���", 24);
		
		//��ѧ��������뼯��
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		//��������
		//Iterator��ʽ
		Iterator it=al.iterator();
		while(it.hasNext()){
			Student s=(Student)it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		System.out.println("---------");
		
		//for����
		for(int x=0;x<al.size();x++){
			Student ss=(Student)al.get(x);
			System.out.println(ss.getName()+"---"+ss.getAge());
		}
	}

}
