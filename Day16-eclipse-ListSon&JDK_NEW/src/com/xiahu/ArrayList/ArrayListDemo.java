package com.xiahu.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * List�������ص�:
 *     ArrayList:
 *         �ײ�����������,��ѯ�죬��ɾ��
 *         �̲߳���ȫ��Ч�ʸ�
 *     Vector:
 *         �ײ����������飬��ѯ�죬��ɾ��
 *         �̰߳�ȫ��Ч�ʵ�
 *     LinkedList:
 *         �ײ�������������ѯ������ɾ��
 *         �̲߳���ȫ��Ч�ʸ�
 *         
 * ArrayList��ʹ�ã�
 *     �洢�ַ��鲢����
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//����ArrayList����
		ArrayList al=new ArrayList();
		
		//��Ӽ��϶���
		al.add("hello");
		al.add("java");
		al.add("javaEE");
		
		//��������
		//Iterator��ʽ����
		Iterator it=al.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s);
		}
		
		System.out.println("--------");
		
		//��forѭ��
		
		for(int x=0;x<al.size();x++){
			String ss=(String)al.get(x);
			System.out.println(ss);
		}
	}

}
