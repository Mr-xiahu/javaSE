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
 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低存入文本文件
 * 
 * 分析：
 * 		A:创建学生类
 * 		B:创建集合对象
 * 			TreeSet<Student>
 * 		C:键盘录入学生信息存储到集合
 * 		D:遍历集合，把数据写到文本文件
 */
public class G_StudentDemo {
	public static void main(String[] args) throws Exception {
		// //创建学生类
		// G_Student s1=new G_Student("诸葛亮", 99, 99, 99);
		// G_Student s2=new G_Student("赵子龙", 98, 98, 100);
		// G_Student s3=new G_Student("刘玄德", 100, 80, 90);
		// G_Student s4=new G_Student("关云长", 99, 88, 77);
		// G_Student s4=new G_Student("张翼德", 60, 60, 60);

		// 创建集合对象TreeSet<Student>
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

		// 键盘录入学生信息存储到集合

		G_Student s = new G_Student();
		for (int x = 1; x <= 5; x++) {
			Scanner sc = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			System.out.println("请输入第" + x + "个学生的姓名");
			String name = sc.nextLine();
			System.out.println("请输入第" + x + "个学生的语文成绩");
			int chinese = sc2.nextInt();
			System.out.println("请输入第" + x + "个学生的数学成绩");
			int math = sc2.nextInt();
			System.out.println("请输入第" + x + "个学生的英语成绩");
			int english = sc2.nextInt();

			// 创建学生类

			s.setName(name);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);
			tree.add(s);
		}

		// 遍历集合，把数据写到文本文件
		BufferedWriter bw = new BufferedWriter(new FileWriter("Student.txt"));
		bw.write("学生成绩信息如下:");
		bw.newLine();
		bw.flush();
		bw.write("姓名,语文成绩,数学成绩,英语成绩");
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
		System.out.println("学习信息存储完毕");

	}

}
