package com.xiahu.ExpectionTest;

import java.util.Scanner;

/*
 * �Զ����쳣������
 */
public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������ĳɼ�:");
		int score=sc.nextInt();
		
		Teacher t=new Teacher();
		try {
			t.check(score);
		} catch (MyExpetion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
