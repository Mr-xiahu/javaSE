package com.xiahu.Regex;

import java.util.Scanner;

/**
 * @author Administrator
 *  У��QQ����
 *      5--15λ��
 *      ����0����
 *   
 *  ������
 * 		A:����¼��һ��QQ����
 * 		B:дһ������ʵ��У��
 * 		C:���ù��ܣ���������
 */
public class RedexDemo {
	public static void main(String[] args) {
		//A:����¼��һ��QQ����
		Scanner sc=new Scanner(System.in);
		System.out.println("���������QQ����");
		String qq=sc.nextLine();
		boolean x=checkQQ(qq);
		System.out.println("���QQ������"+x);
//		checkQQ(qq);
		
	}
	
	/*
	 * дһ������ʵ��У�� 
	 *   ������ȷ�� 
	 *     ��ȷ����ֵ���ͣ�boolean 
	 *     ��ȷ�����б�String qq
	 */
	
	public static boolean checkQQ(String qq){
		boolean flag=true;
		//У�鳤��
		if(qq.length()>5&&qq.length()<15){
			//0���ܿ�ͷ
			if(!qq.startsWith("0")){
				//����������
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
//						System.out.println("������Ĳ�����ȷ��QQ���룬QQ����Ӧ��ȫ��������");
//					}else{
//						System.out.println("����ɹ�");
//					}
//					
//				}
//				
//			}else{
//				System.out.println("�������QQ�������󣬲�����0��ͷ");
//			}
//			
//		}else{
//			System.out.println("������ĺ��볤�Ȳ���");
//		}
//	}

}
