package com.xiahu.method;

import java.util.Scanner;

/*
 * 需求：键盘录入两个值，输出较大的那个数
 */
public class FunctionTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int x = scanner.nextInt();
		System.out.println("请输入第二个数");
		int y = scanner.nextInt();
		int max = printMax(x, y);
		System.out.println(max);
	}

	public static int printMax(int x, int y) {
		
		return (x > y ? x : y);
	}

}
