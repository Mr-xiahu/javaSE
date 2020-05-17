package com.xiahu.ArraysYa;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author Administrator
 * 
 *         Arrays:���������в����Ĺ����ࡣ����˵����Ͳ��ҡ� 1:public static String toString(int[]
 *         a) ������ת���ַ���
 * 
 *         2:public static void sort(int[] a) �������������
 * 
 *         3:public static int binarySearch(int[] a,int key) ���ֲ���
 */
public class ArraysDemo {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 24, 69, 80, 57, 13 };

		// public static String toString(int[] a) ������ת���ַ���
		System.out.println("����ǰ��" + Arrays.toString(arr));

		// public static void sort(int[] a) �������������
		Arrays.sort(arr);
		System.out.println("�����" + Arrays.toString(arr));

		// [13, 24, 57, 69, 80]
		// public static int binarySearch(int[] a,int key) ���ֲ���
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 57));
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 577));
	}

	@Test
	public void test1() throws Exception {
		// ��ʽ1
		int i = 100;
		Integer ii = new Integer(i);
		System.out.println("ii:" + ii);//100

		// ��ʽ2
		String s = "100";
		// NumberFormatException
		// String s = "abc";
		Integer iii = new Integer(s);
		System.out.println("iii:" + iii);//100
	}

}
