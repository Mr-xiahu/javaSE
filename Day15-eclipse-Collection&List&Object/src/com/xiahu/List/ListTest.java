package com.xiahu.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List���ϵ��ص�:
 *      ����ģ����ظ���
 */
public class ListTest {
	public static void main(String[] args) {
		//����List���϶���
		List list=new ArrayList();
		list.add("java");
		list.add("love");
		list.add("javaEE");
		list.add("love");
		list.add("javaEE");
		
		//��������
		Iterator it=list.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s);
		}
	}

}
