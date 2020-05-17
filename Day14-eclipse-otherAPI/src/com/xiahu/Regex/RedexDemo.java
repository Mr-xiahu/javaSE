package com.xiahu.Regex;

import java.util.Scanner;

/**
 * @author Administrator
 *  校验QQ号码
 *      5--15位数
 *      不能0开口
 *   
 *  分析：
 * 		A:键盘录入一个QQ号码
 * 		B:写一个功能实现校验
 * 		C:调用功能，输出结果。
 */
public class RedexDemo {
	public static void main(String[] args) {
		//A:键盘录入一个QQ号码
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你的QQ号码");
		String qq=sc.nextLine();
		boolean x=checkQQ(qq);
		System.out.println("你的QQ号码是"+x);
//		checkQQ(qq);
		
	}
	
	/*
	 * 写一个功能实现校验 
	 *   两个明确： 
	 *     明确返回值类型：boolean 
	 *     明确参数列表：String qq
	 */
	
	public static boolean checkQQ(String qq){
		boolean flag=true;
		//校验长度
		if(qq.length()>5&&qq.length()<15){
			//0不能开头
			if(!qq.startsWith("0")){
				//必须是数字
				char[] chs=qq.toCharArray();
				for(int x=0;x<chs.length;x++){
					char xh=chs[x];
					if(!Character.isDigit(xh)){
						flag=false;
						break;
					}
				}
				
			}else{
				flag=false;
			}
			
		}else{
			flag=false;
		}

		return flag;
	}
	
//	public static void checkQQ(String qq){
//		if(qq.length()<5&&qq.length()>15){
//			if(qq.startsWith("0")){
//				char[] chs=qq.toCharArray();
//				for(int x=0;x<chs.length;x++){
//					char xh=chs[x];
//					if(!Character.isDigit(xh)){
//						System.out.println("你输入的不是正确的QQ号码，QQ号码应该全部是数字");
//					}else{
//						System.out.println("输入成功");
//					}
//					
//				}
//				
//			}else{
//				System.out.println("你输入的QQ号码有误，不能是0开头");
//			}
//			
//		}else{
//			System.out.println("你输入的号码长度不够");
//		}
//	}

}
