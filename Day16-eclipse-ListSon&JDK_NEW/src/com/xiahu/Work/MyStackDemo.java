package com.xiahu.Work;

public class MyStackDemo {
	public static void main(String[] args) {
		//�������϶���
		MyStack ms=new MyStack();
		
		//���Ԫ��
		ms.add("�Ļ�");
		ms.add("LOVE");
		ms.add("�����");
		
		//���
//		System.out.println(ms.get());
//		System.out.println(ms.get());
//		System.out.println(ms.get());
		while(!ms.isEmply()){
			System.out.println(ms.get());
		}
	}

}
