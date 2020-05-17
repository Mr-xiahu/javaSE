package com.xiahu.array;


/*
 * 需求：数组元素查找(查找指定元素第一次在数组中出现的索引)
	
	分析：
		A:定义一个数组，并静态初始化。
		B:写一个功能实现
			遍历数组，依次获取数组中的每一个元素，和已知的数据进行比较
			如果相等，就返回当前的索引值。
 */
public class ArrayTest4 {
	
	public static void main(String[] args) {
		int[] arr = {123,256,49,956,76,92,67,46,32};
		System.out.println(getIndex(arr, 256));
		System.out.println(getIndex(arr, 32));
		System.out.println(getIndex(arr, 1000));
		
	}
	
	public static int getIndex(int[] arr,int value) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==value) {
				index = i;
			}
		}
		return index;
	}
	
	
	

}
