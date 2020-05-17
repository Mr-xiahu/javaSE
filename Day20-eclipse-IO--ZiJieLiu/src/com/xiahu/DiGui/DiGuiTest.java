package com.xiahu.DiGui;

/*
 * ��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ��������ʵڶ�ʮ���µ����Ӷ���Ϊ���٣�
 * ����������Ҫ��취�ҹ���
 * 			���Ӷ���
 * ��һ���£� 	1
 * �ڶ����£�	1
 * �������£�	2
 * ���ĸ��£�	3	
 * ������£�	5
 * �������£�	8
 * ...
 * 
 * �ɴ˿ɼ����Ӷ���������ǣ�
 * 		1,1,2,3,5,8...
 * ����
 * 		A:�ӵ����ʼ��ÿһ����ǰ����֮��
 * 		B:����˵��ǰ��������֪��
 * 
 * ���ʵ�����������?
 * 		A:����ʵ��
 * 		B:�����ı仯ʵ��
 * 		C:�ݹ�ʵ��
 * 
 * �������ڵ������µ����Ӷ�����a,b
 * ��һ�����ڵ����ݣ�a=1,b=1
 * �ڶ������ڵ����ݣ�a=1,b=2
 * ���������ڵ����ݣ�a=2,b=3
 * ���ĸ����ڵ����ݣ�a=3,b=5
 * �����ˣ���һ�ε�a����ǰ��b����һ������ǰ��a+b	
 */
public class DiGuiTest {
	public static void main(String[] args) {
		// ��������
		int[] arr = new int[20];
		arr[0] = 1;
		arr[1] = 1;
		for (int x = 2; x < arr.length; x++) {
			arr[x] = arr[x - 2] + arr[x - 1];
		}
		System.out.println(arr[19]);
		System.out.println("----------");

		int a = 1;
		int b = 1;
		for (int x = 0; x < 18; x++) {
			// ������ʱ��������a
			int temp = a;
			a = b;
			b = temp + b;
		}
		System.out.println(b);
		System.out.println("----------");
		System.out.println(busiRubbsh(20));
	}

	public static int busiRubbsh(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return busiRubbsh(n - 1) + busiRubbsh(n - 2);
		}
	}

}
