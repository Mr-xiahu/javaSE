package com.xiahu.String;

import java.util.Random;
import java.util.Scanner;

public class GressNumberGame {
	private GressNumberGame(){
		
	}
	
	//��������Ϸ��ʼ
	public static void start(){
		int num=(int)Math.random()*100+1;
		System.out.println("����������Ҫ�µ�����");
		
		while(true){
		Scanner sc=new Scanner(System.in);
		int gressNum=sc.nextInt();
		if(num>gressNum){
			System.out.println("��µ�������С��");
		}else if(num<gressNum){
			System.out.println("��µ������ִ���");
		}else{
			System.out.println("��ϲ��¶���");
			break;
		}
		
		}
		
		
	}

}
