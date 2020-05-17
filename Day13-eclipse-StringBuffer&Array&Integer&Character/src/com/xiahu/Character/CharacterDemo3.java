package com.xiahu.Character;

import java.util.Scanner;

/**
 * @author Administrator
 * 
 *         统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 * 
 *         分析： A:定义三个统计变量。 int bigCont=0; int smalCount=0; int numberCount=0;
 *         B:键盘录入一个字符串。 C:把字符串转换为字符数组。 D:遍历字符数组获取到每一个字符 E:判断该字符是 大写 bigCount++;
 *         小写 smalCount++; 数字 numberCount++; F:输出结果即可
 */
public class CharacterDemo3 {
	public static void main(String[] args) {
		// A:定义三个统计变量。
		// * int bigCont=0;
		// * int smalCount=0;
		// * int numberCount=0;
		// * int other=0;
		// * int space=0;
		int bigCont = 0;
		int smalCount = 0;
		int numberCount = 0;
		int other = 0;

		// B:键盘录入一个字符串。
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一行字符串");
		String s = sc.nextLine();

		// C:把字符串转换为字符数组。
		char[] ch = s.toCharArray();

		// 历字符数组获取到每一个字符
		for (int x = 0; x < ch.length; x++) {
			char xh = ch[x];

			// E:判断该字符是
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

		System.out.println("大写字母：" + bigCont + "个");
		System.out.println("小写字母：" + smalCount + "个");
		System.out.println("数字字符：" + numberCount + "个");
		System.out.println("其他字符的個數" + other + "個");

	}

	public static void printlnString(char[] arr) {
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x]);
		}
		System.out.println();
	}

}
