package com.xiahu.Regex;

import java.util.Scanner;

/**
 * @author Administrator ������ A:����¼������ B:��������Ĺ��� 1517806580@qq.com liuyi@163.com
 *         linqingxia@126.com fengqingyang@sina.com.cn fqy@itcast.cn C:���ù��ܣ��жϼ���
 *         D:������
 */
public class Redex_MatchesTest {
	public static void main(String[] args) {
		// A:����¼���������
		Scanner sc = new Scanner(System.in);
		System.out.println("Ոݔ������������");
		String phonenumber = sc.nextLine();

		// B:��������Ĺ��� "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+"
		// String regex =
		// "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
		String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";

		// C:���ù��ܣ��жϼ���
		boolean flag = phonenumber.matches(regex);

		// D:������
		System.out.println(flag);
	}

}
