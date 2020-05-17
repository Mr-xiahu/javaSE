package com.xiahu.array2;

/*
 * 二维数组:元素为一维数组的数组
 *    格式1：
 *		数据类型[][] 数组名 = new 数据类型[m][n];
 */
public class Array2Demo {
	public static void main(String[] args) {
		// 初始化二维数组
		int[][] arr = new int[3][4];
		// 赋值
		arr[0][0] = 110;
		arr[0][1] = 111;
		arr[0][2] = 112;
		arr[0][3] = 113;
		arr[1][0] = 10;
		arr[1][1] = 11;
		arr[1][2] = 12;
		arr[1][3] = 13;
		arr[2][0] = 20;
		arr[2][1] = 21;
		arr[2][2] = 22;
		arr[2][3] = 23;
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[0][3]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[1][3]);
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
		System.out.println(arr[2][3]);


	}

}
