package com.xiahu.System;

import java.util.Arrays;

/**
 * @author Administrator
 *      public static void gc()������������������ 
 *		public static void exit(int status)��ֹ��ǰ�������е� Java ���������������״̬�룻���ݹ������� 0 ��״̬���ʾ�쳣��ֹ�� 
 *		public static long currentTimeMillis()�����Ժ���Ϊ��λ�ĵ�ǰʱ��
 *		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 *               ��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
 */                
public class SystemDemo2 {
	public static void main(String[] args) {
		// ��������
		int[] arr = { 32, 65, 48, 79, 10 };
		int[] arr2 = { 2, 5, 3, 8, 9, 7 };

		// ���ҿ�����������˼
		System.arraycopy(arr, 1, arr2, 2, 2);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}

}
