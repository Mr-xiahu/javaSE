package com.xiahu.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * �洢�ַ��鲢����
 */
public class LinkListTest {
	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		
		// ��Ӽ���Ԫ��
		link.add("hello");
		link.add("java");
		link.add("javaEE");
		
		//��������
		//Iterator
		Iterator it=link.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s);
		}
		System.out.println("-----");
		
		//for
		for(int x=0;x<link.size();x++){
			String s=(String)link.get(x);
			System.out.println(s);
		}
	}

}
