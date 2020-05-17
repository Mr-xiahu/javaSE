package com.xiahu.System;

import java.util.Arrays;

/**
 * @author Administrator
 *      public static void gc()：运行垃圾回收器。 
 *		public static void exit(int status)终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非 0 的状态码表示异常终止。 
 *		public static long currentTimeMillis()返回以毫秒为单位的当前时间
 *		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 *               从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
 */                
public class SystemDemo2 {
	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 32, 65, 48, 79, 10 };
		int[] arr2 = { 2, 5, 3, 8, 9, 7 };

		// 请大家看这个代码的意思
		System.arraycopy(arr, 1, arr2, 2, 2);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}

}
