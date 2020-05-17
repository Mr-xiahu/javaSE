package com.xiahu.Regex;

import java.util.Scanner;

/**
 * @author Administrator 分析： A:键盘录入邮箱 B:定义邮箱的规则 1517806580@qq.com liuyi@163.com
 *         linqingxia@126.com fengqingyang@sina.com.cn fqy@itcast.cn C:调用功能，判断即可
 *         D:输出结果
 */
public class Redex_MatchesTest {
	public static void main(String[] args) {
		// A:键盘录入邮箱号码
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入你的邮箱号码");
		String phonenumber = sc.nextLine();

		// B:定义邮箱的规则 "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+"
		// String regex =
		// "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
		String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";

		// C:调用功能，判断即可
		boolean flag = phonenumber.matches(regex);

		// D:输出结果
		System.out.println(flag);
	}

}
