package com.xiahu.Regex;

import java.util.Scanner;

/**
 * @author Administrator �жϹ��� String���public boolean matches(String regex)
 * 
 *         ���� �ж��ֻ������Ƿ�����Ҫ��?
 * 
 *         ������ A:����¼���ֻ����� 
 *              B:�����ֻ�����Ĺ��� 
 *                13436975980 
 *                13688886868 
 *                13866668888
 *                13456789012 
 *                13123456789 
 *                18912345678 
 *                18886867878 
 *                18638833883
 *               C:���ù��ܣ��жϼ���
 *               D:������
 * 
 */
public class Redex_MatchesDemo {
	public static void main(String[] args) {
		// A:����¼���ֻ�����
		Scanner sc = new Scanner(System.in);
		System.out.println("Ոݔ������֙C̖�a");
		String phonenumber = sc.nextLine();

		// B:�����ֻ�����Ĺ���
		String Redex = "1[38]\\d{9}";

		// C:���ù��ܣ��жϼ���
		boolean flag = phonenumber.matches(Redex);

		// D:������
		System.out.println(flag);

	}
}
