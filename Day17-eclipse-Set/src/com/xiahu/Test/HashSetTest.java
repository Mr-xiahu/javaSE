package com.xiahu.Test;

import java.util.HashSet;
import java.util.Random;

/*
 * ��дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ���
 * 
 * ������
 * 		A:�������������
 * 		B:����һ��HashSet����
 * 		C:�жϼ��ϵĳ����ǲ���С��10
 * 			�ǣ��ʹ���һ����������
 * 			�񣺲�������
 * 		D:����HashSet����
 */
public class HashSetTest {
	public static void main(String[] args) {
		// A:�������������
		Random r = new Random();

		// B:����һ��HashSet����
		HashSet<Integer> hs = new HashSet<Integer>();

		// C:�жϼ��ϵĳ����ǲ���С��10
		while (hs.size() < 10) {
			int num = r.nextInt(20) + 1;
			hs.add(num);
		}

		for (Integer i : hs) {
			System.out.println(i);
		}
	}

}
