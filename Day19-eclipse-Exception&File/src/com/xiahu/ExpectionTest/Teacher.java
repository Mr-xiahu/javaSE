package com.xiahu.ExpectionTest;

public class Teacher {
	public static void check(int score) throws MyExpetion {
		if (score > 100 || score < 0) {
			throw new MyExpetion("����������0-100֮��");
		} else {
			System.out.println("����û����");
		}
	}
}
