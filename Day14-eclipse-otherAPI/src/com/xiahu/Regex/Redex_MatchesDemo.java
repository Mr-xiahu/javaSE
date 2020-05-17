package com.xiahu.Regex;

import java.util.Scanner;

/**
 * @author Administrator 判断功能 String类的public boolean matches(String regex)
 * 
 *         需求： 判断手机号码是否满足要求?
 * 
 *         分析： A:键盘录入手机号码 
 *              B:定义手机号码的规则 
 *                13436975980 
 *                13688886868 
 *                13866668888
 *                13456789012 
 *                13123456789 
 *                18912345678 
 *                18886867878 
 *                18638833883
 *               C:调用功能，判断即可
 *               D:输出结果
 * 
 */
public class Redex_MatchesDemo {
	public static void main(String[] args) {
		// A:键盘录入手机号码
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入你的手機號碼");
		String phonenumber = sc.nextLine();

		// B:定义手机号码的规则
		String Redex = "1[38]\\d{9}";

		// C:调用功能，判断即可
		boolean flag = phonenumber.matches(Redex);

		// D:输出结果
		System.out.println(flag);

	}
}
