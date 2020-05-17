package com.xiahu.game;

import java.util.Scanner;



/**
 * 这是猜数字小游戏
 * 
 * @author 夏小Fu
 * @version v1.1
 * 
 */
public class GuessNumber {
	private GuessNumber() {
	}

	public static void start() {
		// 产生一个随机数
		int number = (int) (Math.random() * 100) + 1;

		// 定义一个统计变量
		int count = 0;

		while (true) {
			// 键盘录入数据
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入数据(1-100):");
			int guseenum = sc.nextInt();
			count++;

			// 判断
			if (guseenum > number) {
				System.out.println("你猜的数字" + guseenum + "太大了");
			} else if (guseenum > number) {
				System.out.println("你猜的数字" + guseenum + "太小了");
			} else {
				System.out.println("恭喜你猜对了！" + count + "次就猜中了");
				break;
			}

		}
	}

}
