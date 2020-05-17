package com.xiahu.IO_Test;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 
 * ����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ��ʹ����ı��ļ�
 * 
 * ������
 * 		A:����ѧ����
 * 		B:�������϶���
 * 			TreeSet<Student>
 * 		C:����¼��ѧ����Ϣ�洢������
 * 		D:�������ϣ�������д���ı��ļ�
 */
public class G_StudentDemo {
	public static void main(String[] args) throws Exception {
		// //����ѧ����
		// G_Student s1=new G_Student("�����", 99, 99, 99);
		// G_Student s2=new G_Student("������", 98, 98, 100);
		// G_Student s3=new G_Student("������", 100, 80, 90);
		// G_Student s4=new G_Student("���Ƴ�", 99, 88, 77);
		// G_Student s4=new G_Student("�����", 60, 60, 60);

		// �������϶���TreeSet<Student>
		TreeSet<G_Student> tree = new TreeSet<G_Student>(
				new Comparator<G_Student>() {

					@Override
					public int compare(G_Student s1, G_Student s2) {
						// return 0;
						int num1 = s1.getSum() - s2.getSum();
						int num2 = num1 == 0 ? s1.getChinese()
								- s2.getChinese() : num1;
						int num3 = num2 == 0 ? s1.getMath() - s2.getEnglish()
								: num2;
						int num4 = num3 == 0 ? s1.getEnglish()
								- s2.getEnglish() : num3;
						return num4;
					}
				});

		// ����¼��ѧ����Ϣ�洢������

		G_Student s = new G_Student();
		for (int x = 1; x <= 5; x++) {
			Scanner sc = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			System.out.println("�������" + x + "��ѧ��������");
			String name = sc.nextLine();
			System.out.println("�������" + x + "��ѧ�������ĳɼ�");
			int chinese = sc2.nextInt();
			System.out.println("�������" + x + "��ѧ������ѧ�ɼ�");
			int math = sc2.nextInt();
			System.out.println("�������" + x + "��ѧ����Ӣ��ɼ�");
			int english = sc2.nextInt();

			// ����ѧ����

			s.setName(name);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);
			tree.add(s);
		}

		// �������ϣ�������д���ı��ļ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("Student.txt"));
		bw.write("ѧ���ɼ���Ϣ����:");
		bw.newLine();
		bw.flush();
		bw.write("����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�");
		bw.newLine();
		bw.flush();
		for (G_Student ss : tree) {
			StringBuilder sb = new StringBuilder();
			sb.append(ss.getName()).append(",").append(ss.getChinese())
					.append(",").append(ss.getMath()).append(",")
					.append(ss.getEnglish());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}

		bw.close();
		System.out.println("ѧϰ��Ϣ�洢���");

	}

}
