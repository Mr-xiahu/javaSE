package com.xiahu.JDK5News;

import java.util.ArrayList;
import java.util.List;

import com.xiahu.ArrayList.Student;

/*
 * ����ArrayList�洢�Զ�����󲢱�����Ҫ����뷺�ͣ�������ǿfor������
 * A:������
 * B:��ͨfor
 * C:��ǿfor
 * 
 * LinkedList,Vector,Colleciton,List�ȴ洢�һ�����?�������ˣ�����Ҫ��������ϰ��
 * 
 * ��ǿfor���������������
 */
public class ForTest {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		
		Student s1=new Student("�ƺ���", 59);
		Student s2=new Student("���ϵ�", 46);
		Student s3=new Student("�����", 34);
		Student s4=new Student("������", 22);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		for(Student s:list){
			System.out.println(s.getName()+"--"+s.getAge());
		}
	}

}
