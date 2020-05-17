package com.xiahu.array2;

/*
 * 需求：二维数组遍历
 *   外循环控制的是二维数组的长度，其实就是一维数组的个数。
 *   内循环控制的是一维数组的长度。
 */
public class Array2Test {
	public static void main(String[] args) {
		// 初始化一个二位数组
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 遍历二维数组
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = 0; j < arr[i].length; j++) {
		// System.out.print(arr[i][j] + "");
		// }
		// System.out.println();
		// }
		printArray(arr);

	}

	// 用方法改进
	public static void printArray(int[][] arr) {
		// 遍历二维数组
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "");
			}
			System.out.println();
		}
	}
}
