package com.xiahu.Regex;

import java.util.Scanner;

/**
 * @author Administrator
 * 
 *         �ָ�� String���public String[] split(String regex) ���ݸ���������ʽ��ƥ���ִ��ַ�����
 * 
 *         ������ �ٺ��������ͼ�Ե,�䰮��,QQ �������� �Ա�Ů ��Χ��"18-24"
 * 
 *         age>=18 && age<=24
 * 
 */
public class Redex_SplitDemo {
	public static void main(String[] args) {
		// ����һ�����䷶Χ
		String ages = "18-24";

		// �������
		String regex = "-";

		// ���÷���public String[] split(String regex)
		String[] strArrays = ages.split(regex);

		// //����
		// for(int x=0;x<strArrays.length;x++){
		// System.out.println(strArrays[x]);
		// }

		// ��εõ�int���͵�
		int statrAge = Integer.parseInt(strArrays[0]);
		int endAge = Integer.parseInt(strArrays[1]);

		// ����¼������
		Scanner sc = new Scanner(System.in);
		System.out.println("�������������");
		int age = sc.nextInt();

		// �ж�
		if (age >= statrAge && age <= endAge) {
			System.out.println("����������ҵ�");

		}else{
			System.out.println("�������ҵ�Ҫ��");
		}
	}

}
