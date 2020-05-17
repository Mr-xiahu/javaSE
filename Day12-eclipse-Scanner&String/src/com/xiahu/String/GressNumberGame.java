package com.xiahu.String;

import java.util.Random;
import java.util.Scanner;

public class GressNumberGame {
	private GressNumberGame(){
		
	}
	
	//猜数字游戏开始
	public static void start(){
		int num=(int)Math.random()*100+1;
		System.out.println("请输入你想要猜的数字");
		
		while(true){
		Scanner sc=new Scanner(System.in);
		int gressNum=sc.nextInt();
		if(num>gressNum){
			System.out.println("你猜到的数字小了");
		}else if(num<gressNum){
			System.out.println("你猜到的数字大了");
		}else{
			System.out.println("恭喜你猜对了");
			break;
		}
		
		}
		
		
	}

}
