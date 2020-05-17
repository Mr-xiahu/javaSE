package com.xiahu.Scanner;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author Administrator
 * 
 * Scanner:用于接受键盘录入事件
 * 
 *   public boolearn hasnextXxx();   判断是否是某种类型的元素
 *   public Xxx nextXxx();            获取该元素
 *   
 *   
 *   public int nextin(); 获取一个int类型的值
 *   public String nextLine();获取字符串类型的值
 *   
 *   
 *   先获取一个数值，在获取一个字符串，会出现问题。
 * 		主要原因：就是那个换行符号的问题。
 *    如何解决呢?
 * 		A:先获取一个数值后，在创建一个新的键盘录入对象获取字符串。
 * 		B:把所有的数据都先按照字符串获取，然后要什么，你就对应的转换为什么。
 *
 */
public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//获取两个int类型的值 
//		int a =sc.nextInt();
//		int b =sc.nextInt();
//		System.out.println("a:"+a+",b:"+b);
		
		//获取两个String类型的值
//		String s1=sc.nextLine();
//		String s2=sc.nextLine();
//		System.out.println("a:"+s1+",b:"+s2);
		
		//hesnextint()的用法
		/*
		if(sc.hasNextInt()){
			int x=sc.nextInt();
			System.out.println("x:"+x);
		}else{
			System.out.println("你输入的有误");
		}
		*/
	
	}
	

}
