package com.xiahu.Character;

import java.util.Scanner;

/**
 * @author Administrator
 * 
 *         ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
 * 
 *         ������ A:��������ͳ�Ʊ����� int bigCont=0; int smalCount=0; int numberCount=0;
 *         B:����¼��һ���ַ����� C:���ַ���ת��Ϊ�ַ����顣 D:�����ַ������ȡ��ÿһ���ַ� E:�жϸ��ַ��� ��д bigCount++;
 *         Сд smalCount++; ���� numberCount++; F:����������
 */
public class CharacterDemo3 {
	public static void main(String[] args) {
		// A:��������ͳ�Ʊ�����
		// * int bigCont=0;
		// * int smalCount=0;
		// * int numberCount=0;
		// * int other=0;
		// * int space=0;
		int bigCont = 0;
		int smalCount = 0;
		int numberCount = 0;
		int other = 0;

		// B:����¼��һ���ַ�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String s = sc.nextLine();

		// C:���ַ���ת��Ϊ�ַ����顣
		char[] ch = s.toCharArray();

		// ���ַ������ȡ��ÿһ���ַ�
		for (int x = 0; x < ch.length; x++) {
			char xh = ch[x];

			// E:�жϸ��ַ���
			if (Character.isLowerCase(xh)) {
				smalCount++;
			} else if (Character.isUpperCase(xh)) {
				bigCont++;
			} else if (Character.isDigit(xh)) {
				numberCount++;
			} else {
				other++;
			}
		}

		System.out.println("��д��ĸ��" + bigCont + "��");
		System.out.println("Сд��ĸ��" + smalCount + "��");
		System.out.println("�����ַ���" + numberCount + "��");
		System.out.println("�����ַ��Ă���" + other + "��");

	}

	public static void printlnString(char[] arr) {
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x]);
		}
		System.out.println();
	}

}
