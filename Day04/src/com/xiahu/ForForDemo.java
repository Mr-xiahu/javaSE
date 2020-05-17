package com.xiahu;

/*
 * 	*
 * 	* *
 * 	* * *
 * 	* * * *
 * 	* * * * *
 * 	* * * * * *
 *	* * * * * * *
 * 	* * * * * * * * 
 * 
 */
public class ForForDemo {
	public static void main(String[] args) {
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 九九乘法表
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}

	}
}
