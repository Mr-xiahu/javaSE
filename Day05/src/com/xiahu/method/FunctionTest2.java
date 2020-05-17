package com.xiahu.method;

import java.util.Scanner;

/*
 * 需求：键盘录入两个值，判断是否相同
 */
public class FunctionTest2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int x = scanner.nextInt();
		System.out.println("请输入第二个数");
		int y = scanner.nextInt();
		boolean max = isEquls(x, y);
		String string = String.valueOf(max);
		if (string.equals(true)) {
		}else {
			System.out.println("两数不同");
			
		}
	}

	public static boolean isEquls(int x, int y) {
		return x == y;

	}

}
