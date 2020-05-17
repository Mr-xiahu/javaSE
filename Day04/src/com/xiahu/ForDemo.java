package com.xiahu;

import java.util.Scanner;


public class ForDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请随便输入一个数");
		int x = scanner.nextInt();
		System.out.println("个位数为:" + x % 10);
		System.out.println("十位数为:" + x / 10 % 10);
		System.out.println("百位数为:" + x / 100 % 10);
		System.out.println("千位数为:" + x / 1000 % 10);
	}

}
