package com.xiahu.array;

import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;

/*
 * 数组查表法(根据键盘录入索引,查找对应星期)
		意思是：String[] strArray = {"星期一","星期二",...};
 */
public class ArrayTest2 {

	public static void main(String[] args) {
		String[] str = {"星期一","星期二","星期三","星期四","星期五","星期六","星期天"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入今天的号码");
		int nextInt = scanner.nextInt();
		System.out.println("今天是:"+str[nextInt]);
	}
	
	

}
