package com.xiahu.Scanner;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author Administrator
 * 
 * Scanner:���ڽ��ܼ���¼���¼�
 * 
 *   public boolearn hasnextXxx();   �ж��Ƿ���ĳ�����͵�Ԫ��
 *   public Xxx nextXxx();            ��ȡ��Ԫ��
 *   
 *   
 *   public int nextin(); ��ȡһ��int���͵�ֵ
 *   public String nextLine();��ȡ�ַ������͵�ֵ
 *   
 *   
 *   �Ȼ�ȡһ����ֵ���ڻ�ȡһ���ַ�������������⡣
 * 		��Ҫԭ�򣺾����Ǹ����з��ŵ����⡣
 *    ��ν����?
 * 		A:�Ȼ�ȡһ����ֵ���ڴ���һ���µļ���¼������ȡ�ַ�����
 * 		B:�����е����ݶ��Ȱ����ַ�����ȡ��Ȼ��Ҫʲô����Ͷ�Ӧ��ת��Ϊʲô��
 *
 */
public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//��ȡ����int���͵�ֵ 
//		int a =sc.nextInt();
//		int b =sc.nextInt();
//		System.out.println("a:"+a+",b:"+b);
		
		//��ȡ����String���͵�ֵ
//		String s1=sc.nextLine();
//		String s2=sc.nextLine();
//		System.out.println("a:"+s1+",b:"+s2);
		
		//hesnextint()���÷�
		/*
		if(sc.hasNextInt()){
			int x=sc.nextInt();
			System.out.println("x:"+x);
		}else{
			System.out.println("�����������");
		}
		*/
	
	}
	

}
