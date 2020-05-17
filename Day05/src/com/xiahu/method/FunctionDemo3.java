package com.xiahu.method;

/*
 * 需求：输出一下图形
 *    ****
 *    ****
 *    ****
 *    ****
 */
public class FunctionDemo3 {

	public static void main(String[] args) {
		int x = 4;
		int y = 4;
		print(x, y);
	}

	public static void print(int x, int y) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
