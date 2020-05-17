package com.xiahu.method;

import java.util.Scanner;

/*
 * 需求：键盘录入行数和列数，输出对应的星形
 */
public class FunctionTest4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int x = scanner.nextInt();
		System.out.println("请输入第二个数");
		int y = scanner.nextInt();
		printXing(x, y);

	}

	public static void printXing(int x, int y) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
               System.out.print("*");
			}
			System.out.println();
		}

	}

}
