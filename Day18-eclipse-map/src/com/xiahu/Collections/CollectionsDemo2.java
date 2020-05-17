package com.xiahu.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Collections�������ArrayList�洢������װ���Ԫ�����򣬴洢�Զ������ɲ�����������?
 */
public class CollectionsDemo2 {
	public static void main(String[] args) {
		// ��������
		List<Student> list = new ArrayList<Student>();

		// ����Ԫ�ض���
		Student s1 = new Student("�����", 20);
		Student s2 = new Student("����Ӣ", 18);
		Student s3 = new Student("������", 18);
		Student s4 = new Student("������", 25);
		Student s5 = new Student("�����", 20);

		// ����Ԫ�ض���
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		// ��Ȼ ����
		// Collections.sort(list);
		// �Ƚ�������
		// ���ͬʱ����Ȼ����ͱȽ��������ԱȽ�������Ϊ��
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				// return 0;
				int num = s1.getAge() - s2.getAge();
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName())
						: num;
				return num2;
			}
		});

		for (Student s : list) {
			System.out.println(s.getName() + "--" + s.getAge());
		}

	}
}