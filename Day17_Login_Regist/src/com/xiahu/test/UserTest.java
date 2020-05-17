package com.xiahu.test;

import java.util.Scanner;

import com.xiahu.dao.UserDao;
import com.xiahu.dao.impl.UserDaoImpl;
import com.xiahu.game.GuessNumber;
import com.xiahu.pojo.User;

/**
 * 用户测试类
 * 
 * @author Administrator 新增加了两个小问题 A:多个对象共享同一个成员变量，用静态
 *         B:循环里面如果有switch，并且在switch里面有break，那么结束的不是循环，而是switch语句
 */
public class UserTest {
	public static void main(String[] args) {
		// 为了能够回到首页
		while (true) {
			// 欢迎界面，给出选择项
			System.out.println("--------------欢迎你的到来--------------");
			System.out.println("1 登录");
			System.out.println("2 注册");
			System.out.println("3 退出");
			System.out.println("请选择:");

			// 键盘录入选择，根据选择不同做不同的操作
			Scanner sc = new Scanner(System.in);
			// 键盘录入选择，根据选择做不同的操作
			String choicestring = sc.nextLine();
			// switch语句的多个地方要使用，我就定义到外面
			UserDao ud = new UserDaoImpl();
			// 经过简单的思考，我选择了switch
			switch (choicestring) {
			case "1":
				// 登录界面
				System.out.println("--------------欢迎来到登录界面--------------");
				System.out.println("请输入用户名:");
				String username = sc.nextLine();
				System.out.println("请输入密码:");
				String password = sc.nextLine();

				// 调用登录对象
				// 多态使用
				// UserDao ud=new UserDaoImpl();
				boolean flag = ud.isLogin(username, password);
				if (flag) {
					System.out.println("登录成功,可以玩游戏了");

					// // 判断是否想玩游戏
					System.out.println("你想玩游戏吗?(y/n)");
					while (true) {
						String resultString = sc.nextLine();
						if (resultString.equalsIgnoreCase("y")) {
							// 玩游戏
							GuessNumber.start();
							System.out.println("你还玩吗?y/n");
						} else {
							break;
						}
					}
					System.out.println("谢谢使用，欢迎下次再来");
					System.exit(0);

					// break; //这里写break，结束的是switch
				} else {
					System.out.println("登录失败，账号密码不正确");

				}
				break;

			case "2":
				// 注册界面
				System.out.println("--------------欢迎来到注册界面--------------");
				System.out.println("请输入用户名:");
				String newusername = sc.nextLine();
				System.out.println("请输入密码:");
				String newpassword = sc.next();

				// 把用户名跟密码封装到一个对象中
				User user = new User();
				user.setUsername(newusername);
				user.setPassword(newusername);

				// 调用注册功能
				// 多态使用
				// UserDao ud=new UserDaoImpl();
				// 具体类使用
				// UserDaoImpl udi=new UserDaoImpl();

				ud.regist(user);
				System.out.println("注册成功!");

				break;

			case "3":
			default:
				System.out.println("谢谢使用，欢迎下次再来");
				System.exit(0);
				break;
			}
		}
	}

}
