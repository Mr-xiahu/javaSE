package com.xiahu.Work;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * ����LinkedListģ��ջ���ݽṹ�ļ��ϣ�������
 *��Ŀ����˼�ǣ�
 *		���Լ��Ķ���һ�������࣬������������ڲ�����ʹ��LinkedListģ�⡣
 */
public class LinkedListTest {
	public static void main(String[] args) {
		//�������϶���
		LinkedList ll=new LinkedList();
		
		//��Ӽ��϶���
		ll.addFirst("hello");
		ll.addFirst("java");
		ll.addFirst("javaEE");
		
		//����
		Iterator it=ll.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s);
		}
		
	}

}
