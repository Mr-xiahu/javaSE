package com.xiahu.Set_Son;

import java.util.HashSet;
import java.util.Set;

/*
 * ���󣺴洢�Զ�����󣬲���֤Ԫ�ص�Ψһ��
 * Ҫ�������������ĳ�Ա����ֵ����ͬ����Ϊͬһ��Ԫ�ء�
 * 
 * Ŀǰ�ǲ������ҵ�Ҫ��ģ���Ϊ����֪��HashSet�ײ���������hashCode()��equals()������
 * ������������������ѧ������û����д�����ԣ�Ĭ��ʹ�õ���Object�ࡣ
 * ���ʱ�����ǵĹ�ϣֵ�ǲ���һ���ģ������Ͳ�������жϣ�ִ������Ӳ�����
 */
public class HashSetDemo2 {
	public static void main(String[] args) {
		// �������϶���
		Set<Student> set = new HashSet<Student>();

		// ��������Ԫ��
		Student s1 = new Student("������", 50);
		Student s2 = new Student("�����", 25);
		Student s3 = new Student("���Ƴ�", 35);
		Student s4 = new Student("������", 23);
		Student s5 = new Student("�����", 30);
		Student s6 = new Student("�ƺ���", 60);
		Student s7 = new Student("�ƺ���", 60);
		
		//��Ӽ��϶���
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		set.add(s7);
		
		//��������
		for(Student s:set){
			System.out.println(s.getName()+"--"+s.getAge());
		}

	}

}
