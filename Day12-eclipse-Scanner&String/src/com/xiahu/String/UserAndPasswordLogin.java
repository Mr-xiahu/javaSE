package com.xiahu.String;

import java.util.Scanner;

public class UserAndPasswordLogin {

	/**
	 * @param args
	 * 模拟登陆用户
	 */
	public static void main(String[] args) {
		//定义原本的用户名跟密码
		String username="admin";
		String passwoed="admin";
		
		//你有三次登陆的机会   用for循環表示
		for(int x=0;x<3;x++){
			
		
		//定义键盘录入事件
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入用户名");
		String name=sc.nextLine();
		System.out.println("请输入密码");
		String pwd=sc.nextLine();
		
		//判断登陆是否成功
		if(name.equals(username)&&pwd.equals(passwoed)){
			System.out.println("恭喜你登陆成功");
			System.out.println("我们现在开始玩猜字游戏");
			GressNumberGame.start();
			break;
		}else{
			if((2-x)==0){
				System.out.println("你的账号被冻结,请于管理员联系");
			}else{
			System.out.println("登陆失败，你还有"+(2-x)+"次机会");
			}
		}
		}

	}

}
