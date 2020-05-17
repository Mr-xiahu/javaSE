package com.xiahu.Test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台
 * 
 * 分析：
 * 		A:定义学生类
 * 		B:创建一个TreeSet集合
 * 		C:总分从高到底如何实现呢?		
 * 		D:键盘录入5个学生信息
 * 		E:遍历TreeSet集合
 */
public class TreeSetTest {

	// private static String name;
	// private static int chinese;
	// private static int math;
	// private static int english;

	public static void main(String[] args) {
		// B:创建一个TreeSet集合
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// return 0;
				// 总分由高到低排序
				int num = s2.getSum() - s1.getSum();

				// 总分相同时不一定语文相同
				int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
				// 语文相同不一定数学相同
				int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
				// 语文相同不一定英语相同
				int num4 = num3 == 0 ? s1.getEnglish() - s2.getEnglish() : num3;
				// 全部相同姓名不一定相同
				int num5 = num4 == 0 ? s1.getName().compareTo(s2.getName())
						: num4;
				return num5;

			}

		});

		// D:键盘录入5个学生信息
		for (int x = 1; x <= 5; x++) {
			Scanner sc = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			System.out.println("请输入第" + x + "个人的姓名");
			String name = sc.nextLine();
			System.out.println("请输入第" + x + "个人的语文成绩");
			int chinese = sc2.nextInt();
			System.out.println("请输入第" + x + "个人的数学成绩");
			int math = sc2.nextInt();
			System.out.println("请输入第" + x + "个人的英语成绩");
			int english = sc2.nextInt();
			
			// 把数据封装到对象中
			Student s = new Student();

			s.setName(name);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);
			
			// 添加对象到集合中
			ts.add(s);

		}

		

		
		
		System.out.println("学生信息录入完毕");

		System.out.println("学习信息从高到低排序如下：");
		System.out.println("姓名\t语文成绩\t数学成绩\t英语成绩");

		// 遍历
		for (Student ss : ts) {
			System.out.println(ss.getName() + "\t" + ss.getChinese() + "\t"
					+ ss.getMath() + "\t" + ss.getEnglish());
		}

	}

}
