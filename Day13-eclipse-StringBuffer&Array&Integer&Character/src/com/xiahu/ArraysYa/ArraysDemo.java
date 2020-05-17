package com.xiahu.ArraysYa;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author Administrator
 * 
 *         Arrays:针对数组进行操作的工具类。比如说排序和查找。 1:public static String toString(int[]
 *         a) 把数组转成字符串
 * 
 *         2:public static void sort(int[] a) 对数组进行排序
 * 
 *         3:public static int binarySearch(int[] a,int key) 二分查找
 */
public class ArraysDemo {
	public static void main(String[] args) {
		// 定义一个数组
		int[] arr = { 24, 69, 80, 57, 13 };

		// public static String toString(int[] a) 把数组转成字符串
		System.out.println("排序前：" + Arrays.toString(arr));

		// public static void sort(int[] a) 对数组进行排序
		Arrays.sort(arr);
		System.out.println("排序后：" + Arrays.toString(arr));

		// [13, 24, 57, 69, 80]
		// public static int binarySearch(int[] a,int key) 二分查找
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 57));
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 577));
	}

	@Test
	public void test1() throws Exception {
		// 方式1
		int i = 100;
		Integer ii = new Integer(i);
		System.out.println("ii:" + ii);//100

		// 方式2
		String s = "100";
		// NumberFormatException
		// String s = "abc";
		Integer iii = new Integer(s);
		System.out.println("iii:" + iii);//100
	}

}
