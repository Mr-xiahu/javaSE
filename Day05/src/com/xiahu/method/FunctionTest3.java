package com.xiahu.method;

import java.util.Scanner;

/*
 * 需求：键盘录入三个数据，返回三个数中的最大值
 */
public class FunctionTest3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int x = scanner.nextInt();
		System.out.println("请输入第二个数");
		int y = scanner.nextInt();
		System.out.println("请输入第三个数");
		int z = scanner.nextInt();
		int max = printMax(x, y, z);
		System.out.println(max);
	}

	public static int printMax(int x, int y, int z) {

		int temp = (x > y ? x : y);
		int max = (temp > z ? temp : z);
		return max;
	}

}
