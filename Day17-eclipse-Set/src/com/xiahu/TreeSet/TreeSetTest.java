package com.xiahu.TreeSet;

import java.util.TreeSet;

/*
 * �����밴�������ĳ�������
 */
public class TreeSetTest {
	public static void main(String[] args) {
		// ��������Ԫ��
		TreeSet<Teacher> ts = new TreeSet<Teacher>();
		
		//�������϶���
		Teacher t1=new Teacher("zhugeliang", 29);
		Teacher t2=new Teacher("liuxuande", 45);
		Teacher t3=new Teacher("zhaozilong", 20);
		Teacher t4=new Teacher("caocao", 40);
		Teacher t5=new Teacher("zhugelianh", 29);
		Teacher t6=new Teacher("zhugelianh", 30);
		
		//��Ӽ���Ԫ��
		ts.add(t1);
		ts.add(t2);
		ts.add(t3);
		ts.add(t4);
		ts.add(t5);
		ts.add(t6);
		
		//����
		for(Teacher t:ts){
			System.out.println(t.getName()+"--"+t.getAge());
		}
	}

}
