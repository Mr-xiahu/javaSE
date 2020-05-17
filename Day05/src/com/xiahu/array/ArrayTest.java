package com.xiahu.array;

import javax.print.attribute.standard.RequestingUserName;

/*
 * 数组获取最值(获取数组中的最大值最小值)
 *	
 *	分析： 
 *		A:定义一个数组，并对数组的元素进行静态初始化。
 *		B:从数组中任意的找一个元素作为参照物(一般取第一个),默认它就是最大值。
 *		C:然后遍历其他的元素，依次获取和参照物进行比较，如果大就留下来，如果小，就离开。
 *		D:最后参照物里面保存的就是最大值。
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,5,8,3,46,92,95,364,65};
		int printMax = printMax(arr);
		int printMin = printMin(arr);
		System.out.println(printMax);
		System.out.println(printMin);
	}
	
	public static int printMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	
	public static int printMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}
