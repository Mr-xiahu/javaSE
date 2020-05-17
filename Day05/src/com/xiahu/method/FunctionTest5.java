package com.xiahu.method;

import java.util.Scanner;

/*
 * 需求：键盘录入一个数据n(1<=n<=9)，输出对应的nn乘法表
 */
public class FunctionTest5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int x = scanner.nextInt();
		
		print99(x);
		
	}

	public static void print99(int x) {
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j+"\t");
			}
			System.out.println();

		}
	}

}
