package com.xiahu;

import java.util.Scanner;

/*
 * 模拟单项选择题。
	分析：
		A:出一个选择题，然后供你选择。
		B:键盘录入选择的数据。
		C:根据选择来给出你选择的结论。
 */
public class SwitchTest {
	public static void main(String[] args) {
		System.out.println("下面的几个人你最爱谁?");
		System.out.println("65 林青霞");
		System.out.println("66 张曼玉");
		System.out.println("67 刘德华");
		System.out.println("68 王力宏");
		Scanner sc = new Scanner(System.in);
		int inNmu = sc.nextInt();
		char charNum = (char) inNmu;
		switch (charNum) {
		case 'A':
			System.out.println("你选择的是正确的");
			break;

		case 'B':
			System.out.println("你选择的是错误的");
			break;
		case 'C':
			System.out.println("你选择的是错误的");
			break;
		case 'D':
			System.out.println("你选择的是错误的");
			break;

		default:
			System.out.println("对不起，没有该选项");
			break;
		}

	}

}
