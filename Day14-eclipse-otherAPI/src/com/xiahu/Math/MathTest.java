package com.xiahu.Math;

import java.util.Scanner;

/**
 * @author Administrator
 * 
 */
public class MathTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入开始的数字");
		int start = sc.nextInt();
		System.out.println("请输入结束的数字");
		int end = sc.nextInt();
		for (int x = 0; x < 10; x++) {
			int s = getRandom(start, end);
			System.out.println("该数字为" + s);
		}

	}

	public static int getRandom(int start, int end) {
		int number = ((int) (Math.random() * (end - start) + 1) + start);
		while (number >= start && number <= end) {
			break;
		}
		return number;
	}

}
