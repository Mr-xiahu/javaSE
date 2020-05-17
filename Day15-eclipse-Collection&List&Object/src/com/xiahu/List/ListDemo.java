package com.xiahu.List;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

/*
 * ĞèÇó£ºList¼¯ºÏ´æ´¢×Ö·û´®²¢±éÀú¡£
 */
public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Öî¸ğÁÁ");
		list.add("ÕÔ×ÓÁú");
		list.add("¹ş¹ş¹ş");

		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}

}
