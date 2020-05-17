package com.xiahu.LinkedList;

import java.util.LinkedList;

/*
 * LinkedList�����й��ܣ�
 * 		A:��ӹ���
 * 			public void addFirst(Object e)
 * 			public void addLast(Object e)
 * 		B:��ȡ����
 * 			public Object getFirst()
 * 			public Obejct getLast()
 * 		C:ɾ������
 * 			public Object removeFirst()
 * 			public Object removeLast()
 */
public class LinkListDemo {
	public static void main(String[] args) {
		//�������϶���
		LinkedList link=new LinkedList();
		
		//��Ӽ���Ԫ��
		link.add("hello");
		link.add("java");
		link.add("javaEE");
				
		//�������
		System.out.println(link);
		System.out.println("---------");
		
		//public void addFirst(Object e)
		link.addFirst("�Ļ�");
		System.out.println(link);
		System.out.println("---------");
		
		//public void addLast(Object e)
		link.addLast("���޼�");
		System.out.println(link);
		System.out.println("---------");
		
		//public Object getFirst()
		Object obj1=link.getFirst();
		System.out.println(obj1);
		System.out.println("---------");
		
		//public Obejct getLast()
		Object obj2=link.getLast();
		System.out.println(obj2);
		System.out.println("---------");
		
		//public Object removeFirst()
		Object obj3=link.removeFirst();
		System.out.println(obj3);
		System.out.println("---------");
		
		//public Object removeLast()
		Object obj4=link.removeLast();
		System.out.println(obj4);
		System.out.println("---------");
		
		// �������
		System.out.println(link);
		System.out.println("---------");
		
	}

}
