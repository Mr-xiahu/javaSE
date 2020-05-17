package com.xiahu.Test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * ����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨
 * 
 * ������
 * 		A:����ѧ����
 * 		B:����һ��TreeSet����
 * 		C:�ִܷӸߵ������ʵ����?		
 * 		D:����¼��5��ѧ����Ϣ
 * 		E:����TreeSet����
 */
public class TreeSetTest {

	// private static String name;
	// private static int chinese;
	// private static int math;
	// private static int english;

	public static void main(String[] args) {
		// B:����һ��TreeSet����
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// return 0;
				// �ܷ��ɸߵ�������
				int num = s2.getSum() - s1.getSum();

				// �ܷ���ͬʱ��һ��������ͬ
				int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
				// ������ͬ��һ����ѧ��ͬ
				int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
				// ������ͬ��һ��Ӣ����ͬ
				int num4 = num3 == 0 ? s1.getEnglish() - s2.getEnglish() : num3;
				// ȫ����ͬ������һ����ͬ
				int num5 = num4 == 0 ? s1.getName().compareTo(s2.getName())
						: num4;
				return num5;

			}

		});

		// D:����¼��5��ѧ����Ϣ
		for (int x = 1; x <= 5; x++) {
			Scanner sc = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			System.out.println("�������" + x + "���˵�����");
			String name = sc.nextLine();
			System.out.println("�������" + x + "���˵����ĳɼ�");
			int chinese = sc2.nextInt();
			System.out.println("�������" + x + "���˵���ѧ�ɼ�");
			int math = sc2.nextInt();
			System.out.println("�������" + x + "���˵�Ӣ��ɼ�");
			int english = sc2.nextInt();
			
			// �����ݷ�װ��������
			Student s = new Student();

			s.setName(name);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);
			
			// ��Ӷ��󵽼�����
			ts.add(s);

		}

		

		
		
		System.out.println("ѧ����Ϣ¼�����");

		System.out.println("ѧϰ��Ϣ�Ӹߵ����������£�");
		System.out.println("����\t���ĳɼ�\t��ѧ�ɼ�\tӢ��ɼ�");

		// ����
		for (Student ss : ts) {
			System.out.println(ss.getName() + "\t" + ss.getChinese() + "\t"
					+ ss.getMath() + "\t" + ss.getEnglish());
		}

	}

}
