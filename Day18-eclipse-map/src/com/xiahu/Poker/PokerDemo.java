package com.xiahu.Poker;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 模拟斗地主洗牌和发牌
 * 
 * 分析：
 * 		A:创建一个牌盒
 * 		B:装牌
 * 		C:洗牌
 * 		D:发牌
 * 		E:看牌
 */
public class PokerDemo {
	public static void main(String[] args) {
		// 创建一个牌盒
		ArrayList<String> list = new ArrayList<String>();

		// 装牌
		// 黑桃A,黑桃2,...黑桃K
		// 红心A....
		// 梅花A....
		// 方块A....

		// 创建颜色
		String[] colors = { "♠", "♥", "♣", "♦" };
		// 创建数字
		String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };
		// 装牌
		for (String color : colors) {
			for (String number : numbers) {
				list.add(color.concat(number));

			}
		}

		list.add("大王");
		list.add("小王");

		// 洗牌
		Collections.shuffle(list);

		// 创建游戏玩家
		ArrayList<String> player1 = new ArrayList<String>();
		ArrayList<String> player2 = new ArrayList<String>();
		ArrayList<String> player3 = new ArrayList<String>();
		ArrayList<String> dipai = new ArrayList<String>();

		// 发牌
		for (int x = 0; x < list.size(); x++) {
			if (x >= list.size() - 3) {
				dipai.add(list.get(x));
			} else if (x % 3 == 0) {
				player1.add(list.get(x));
			} else if (x % 3 == 1) {
				player2.add(list.get(x));
			} else if (x % 3 == 2) {
				player3.add(list.get(x));
			}
		}

		// 看牌
		lookPoker("刘备", player1);
		lookPoker("关羽", player2);
		lookPoker("张飞", player3);
		lookPoker("底牌", dipai);

	}

	public static void lookPoker(String name, ArrayList<String> list) {
		System.out.print(name + "的牌是:");
		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

}
