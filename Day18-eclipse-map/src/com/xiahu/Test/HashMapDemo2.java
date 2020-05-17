package com.xiahu.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Ϊ�˸�����Ҫ��
 * 		��ε����ݾͿ�����ѧ������
 * 
 * ���ǲ���
 * 		bj	����У��
 * 			jc	������
 * 					����ϼ		27
 * 					������		30
 * 			jy	��ҵ��	
 * 					����֥		28
 * 					����		29
 * 		sh	�Ϻ�У��
 * 			jc	������
 * 					������		20
 * 					Ϭ����		22
 * 			jy	��ҵ��	
 * 					�����		21
 * 					����		23
 * 		gz	����У��
 * 			jc	������
 * 					������		30
 * 					���		32
 * 			jy	��ҵ��	
 * 					����		31
 * 					����		33
 * 		xa	����У��
 * 			jc	������
 * 					������		27
 * 					����		30
 * 			jy	��ҵ��	
 * 					�����		28
 * 					��־��		29
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		// �������ǲ���HashMap
		HashMap<String, HashMap<String, ArrayList<Student>>> czbkmap = new HashMap<String, HashMap<String, ArrayList<Student>>>();

		// ������У��������
		HashMap<String, ArrayList<Student>> bjxq = new HashMap<String, ArrayList<Student>>();

		// ����У��
		ArrayList<Student> jc = new ArrayList<Student>();
		Student s1 = new Student("�����", 28);
		Student s2 = new Student("����Ӣ", 25);
		// ���������ѧ��
		jc.add(s1);
		jc.add(s2);
		// ����У����ҵ��
		ArrayList<Student> jy = new ArrayList<Student>();
		Student s3 = new Student("�ܲ�", 40);
		Student s4 = new Student("����", 30);
		// ��ҵ�����ѧ��
		jy.add(s3);
		jy.add(s4);

		bjxq.put("jc", jc);
		bjxq.put("jy", jy);

		// �Ϻ�У��
		HashMap<String, ArrayList<Student>> shxq = new HashMap<String, ArrayList<Student>>();
		// �Ϻ�У��������
		ArrayList<Student> shjc = new ArrayList<Student>();
		Student s5 = new Student("�ֳ�", 28);
		Student s6 = new Student("�ν�", 25);
		// ���������ѧ��
		jc.add(s5);
		jc.add(s6);
		// �Ϻ�У����ҵ��
		ArrayList<Student> shjy = new ArrayList<Student>();
		Student s7 = new Student("��ٴ", 40);
		Student s8 = new Student("�λ���", 30);
		// ��ҵ�����ѧ��
		jy.add(s7);
		jy.add(s8);

		shxq.put("jc", shjc);
		shxq.put("jy", shjy);

		// ���ǲ������У��
		czbkmap.put("����", bjxq);
		czbkmap.put("�Ϻ�", shxq);

		// ����
		Set<Map.Entry<String, HashMap<String, ArrayList<Student>>>> set = czbkmap
				.entrySet();
		for (Map.Entry<String, HashMap<String, ArrayList<Student>>> me : set) {
			String city = me.getKey();
			System.out.println(city);
			HashMap<String, ArrayList<Student>> hm = me.getValue();
			Set<Map.Entry<String, ArrayList<Student>>> set1 = hm.entrySet();
			for (Map.Entry<String, ArrayList<Student>> me1 : set1) {
				String kc = me1.getKey();
				System.out.println("\t" + kc);
				ArrayList<Student> ss = me1.getValue();
				for (Student s : ss) {
					System.out.println("\t" + s.getName()+"---"+s.getAge());
				}
			}
		}

	}

}
