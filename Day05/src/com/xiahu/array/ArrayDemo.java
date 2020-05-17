package com.xiahu.array;

/*
 * 数组:存储同一种数据类型的多个元素的容器。
 *	
 *	定义格式：
 *		A:数据类型[] 数组名;
 *		B:数据类型 数组名[];
 *		
 *	举例：
 *		A:int[] a; 定义一个int类型的数组a变量
 * 		B:int a[]; 定义一个int类型的a数组变量
 *		
 *	注意：效果可以认为是一样的，都是定义一个int数组，但是念法上有些小区别。推荐使用第一种。
	
	如何对数组进行初始化呢?
		A:何谓初始化呢? 就是为数组开辟内存空间，并为每个数组元素赋予值
		B:有几种方式呢?
			a:动态初始化 只指定长度，由系统给出初始化值
			b:静态初始化 给出初始化值，由系统决定长度
			
	动态初始化的格式：
		数据类型[] 数组名 = new 数据类型[数组长度];
		
		举例：
		int[] arr = new int[3];	
		
	如何获取数组中的元素呢?
		通过:
			数组名[索引]
			索引其实就是每个元素的编号，从0开始，最大索引是数组的长度-1。
 */
public class ArrayDemo {
	public static void main(String[] args) {
		// 方式一：新建一个数组
		int[] arr = new int[5];
		// 赋值
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		// 方式二
		int[] arr2 = { 1, 2, 3, 4, 5 };
		// 方式三
		printArray(arr);
		printArray(arr2);

	}

	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		
		int[] array = {12,23,36};
		int array2[] = new int[5];
		System.out.println();
	}

}
