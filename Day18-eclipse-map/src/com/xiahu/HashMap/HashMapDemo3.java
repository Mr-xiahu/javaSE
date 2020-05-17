package com.xiahu.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * HashMap<String,Student>
 * ����String	ѧ��
 * ֵ��Student ѧ������
 */
public class HashMapDemo3 {
	// �������϶���
	public static void main(String[] args) {
		// �������϶���
		HashMap<String, Student> hs = new HashMap<String, Student>();

		// ����Ԫ�ض���
		Student s1 = new Student("���»�", 30);
		Student s2 = new Student("��ѧ��", 31);
		Student s3 = new Student("������", 30);
		Student s4 = new Student("����", 19);
		Student s5 = new Student("����", 60);
		
		//��Ӽ���Ԫ��
		hs.put("9527", s1);
		hs.put("4862", s2);
		hs.put("8916", s3);
		hs.put("4986", s4);
		hs.put("3894", s5);
		
		//����
		Set<Map.Entry<String, Student>> set=hs.entrySet();
		for(Map.Entry<String, Student> me:set){
			String name=me.getValue().getName();
			int age=me.getValue().getAge();
			System.out.println(me.getKey()+"---"+name+"---"+age);
		}
	}

}
