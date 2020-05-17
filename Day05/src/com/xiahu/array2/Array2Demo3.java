package com.xiahu.array2;

/*
 * 格式3：
 *	基本格式：
 *	  数据类型[][] 数组名 = new 数据类型[][]{{元素1,元素2...},{元素1,元素2...},{元素1,元素2...}};
 *	简化版格式：
 *	 数据类型[][] 数组名 = {{元素1,元素2...},{元素1,元素2...},{元素1,元素2...}};
 */
public class Array2Demo3 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{2,6,8},{15,63}};
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);


	}

}
