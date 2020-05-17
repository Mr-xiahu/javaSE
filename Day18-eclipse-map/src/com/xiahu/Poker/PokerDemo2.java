package com.xiahu.Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeSet;

/*
 * 思路：
 * 		A:创建一个HashMap集合
 * 		B:创建一个ArrayList集合
 * 		C:创建花色数组和点数数组
 * 		D:从0开始往HashMap里面存储编号，并存储对应的牌
 *        同时往ArrayList里面存储编号即可。
 *      E:洗牌(洗的是编号)
 *      F:发牌(发的也是编号，为了保证编号是排序的，就创建TreeSet集合接收)
 *      G:看牌(遍历TreeSet集合，获取编号，到HashMap集合找对应的牌)
 */
public class PokerDemo2 {
	public static void main(String[] args) {
		// 创建一个HashMap集合
		HashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

		// B:创建一个ArrayList集合
		ArrayList<Integer> array = new ArrayList<Integer>();

		// 创建花色数组和点数数组
		// 创建颜色
		String[] colors = { "♦", "♣", "♥", "♠" };
		// 创建数字
		String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
				"K", "A", "2" };

		// 从0开始往HashMap里面存储编号，并存储对应的牌
		int index = 0;

		for (String number : numbers) {
			for (String color : colors) {
				String poker = color.concat(number);
				hm.put(index, poker);
				array.add(index);
				index++;
			}
		}
		hm.put(index, "小王");
		array.add(index);
		index++;
		hm.put(index, "大王");
		
		array.add(index);

		// 洗牌(洗的是编号)
		Collections.shuffle(array);

		// 发牌(发的也是编号，为了保证编号是排序的，就创建TreeSet集合接收)
		TreeSet<Integer> player1 = new TreeSet<Integer>();
		TreeSet<Integer> player2 = new TreeSet<Integer>();
		TreeSet<Integer> player3 = new TreeSet<Integer>();
		TreeSet<Integer> dipai = new TreeSet<Integer>();

		for (int x = 0; x < array.size(); x++) {
			if (x >= array.size() - 3) {
				dipai.add(array.get(x));
			} else if (x % 3 == 0) {
				player1.add(array.get(x));
			} else if (x % 3 == 1) {
				player2.add(array.get(x));
			} else if (x % 3 == 2) {
				player3.add(array.get(x));
			}
		}

		// 看牌(遍历TreeSet集合，获取编号，到HashMap集合找对应的牌)
		lookPoker("张三", player1, hm);
		lookPoker("李四", player2, hm);
		lookPoker("王五", player3, hm);
		lookPoker("底牌", dipai, hm);

	}

	public static void lookPoker(String name, TreeSet<Integer> player,
			HashMap<Integer, String> hm) {
		System.out.print(name + "的牌是:");
		for (Integer ts : player) {
			String value = hm.get(ts);
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
