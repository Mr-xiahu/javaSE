package com.xiahu.Math;

import java.util.Scanner;

/**
 * @author Administrator
 * 
 */
public class MathTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뿪ʼ������");
		int start = sc.nextInt();
		System.out.println("���������������");
		int end = sc.nextInt();
		for (int x = 0; x < 10; x++) {
			int s = getRandom(start, end);
			System.out.println("������Ϊ" + s);
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
