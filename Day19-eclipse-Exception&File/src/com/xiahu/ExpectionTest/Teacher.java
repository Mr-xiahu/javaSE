package com.xiahu.ExpectionTest;

public class Teacher {
	public static void check(int score) throws MyExpetion {
		if (score > 100 || score < 0) {
			throw new MyExpetion("分数必须在0-100之间");
		} else {
			System.out.println("分数没问题");
		}
	}
}
