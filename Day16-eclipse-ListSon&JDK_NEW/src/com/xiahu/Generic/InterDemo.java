package com.xiahu.Generic;
/*
 * ������
 */
public class InterDemo {
	public static void main(String[] args) {
//		//��һ���������   ֪��������ʲô����
//		Inter<String> i = new InterImpl();
//		i.show("hello");
		
		//�ڶ������
		Inter<Integer> i=new InterImpl();
		i.show(100);
		
		Inter<String> ii=new InterImpl();
		ii.show("hello");
		
	}

}
