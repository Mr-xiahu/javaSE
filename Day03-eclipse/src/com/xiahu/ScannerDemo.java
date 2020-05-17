package com.xiahu;

import java.util.Scanner;

/*
 * 键盘录入两个数据，并对这两个数据求和，输出其结果
 * 键盘录入两个数据，获取这两个数据中的最大值
 * 键盘录入三个数据，获取这三个数据中的最大值
 * 键盘录入两个数据，比较这两个数据是否相等
 *
 */
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int fristNum = sc.nextInt();
		System.out.println("请输入第二个数");
		int secondNum = sc.nextInt();
		int sum = fristNum + secondNum;
		System.out.println("两数之和为:" + sum);
		if (fristNum > secondNum) {
			System.out.println("最大值为:" + fristNum);
		} else {
			System.out.println("最大值为:" + secondNum);
		}
		boolean flag = fristNum == secondNum ? true : false;
		System.out.println("是否相等呢:" + flag);
	}

}
