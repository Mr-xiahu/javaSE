package com.xiahu.ExpectionTest;

import java.util.Scanner;

/*
 * 自定义异常测试类
 */
public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你的成绩:");
		int score=sc.nextInt();
		
		Teacher t=new Teacher();
		try {
			t.check(score);
		} catch (MyExpetion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
