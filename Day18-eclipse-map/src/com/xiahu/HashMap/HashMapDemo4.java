package com.xiahu.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * HashMap<Student,String>
 * ����Student
 * 		Ҫ�������������ĳ�Ա����ֵ����ͬ����Ϊͬһ������
 * ֵ��String
 */
public class HashMapDemo4 {
	public static void main(String[] args) {
		HashMap<Student, String> hm=new HashMap<Student, String>();
		
		//����Ԫ�ض���
		Student s1 = new Student("���»�", 30);
		Student s2 = new Student("��ѧ��", 31);
		Student s3 = new Student("������", 30);
		Student s4 = new Student("����", 19);
		Student s5 = new Student("����", 60);
		Student s6 = new Student("����", 60);
		
		//��Ӽ���Ԫ��
		hm.put(s1, "9999");
		hm.put(s2, "8888");
		hm.put(s3, "7777");
		hm.put(s4, "6666");
		hm.put(s5, "0000");
		hm.put(s6, "1111");
		
		//����
		Set<Map.Entry<Student, String>> set=hm.entrySet();
		for(Map.Entry<Student, String> me:set){
			String name=me.getKey().getName();
			int age=me.getKey().getAge();
			System.out.println(name+"---"+age+"---"+me.getValue());
		}
		
	}

}
