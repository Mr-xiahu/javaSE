package com.xiahu.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 * �洢�ַ��鲢����
 */
public class VectorTest {
	public static void main(String[] args) {
		//����Vector����
		Vector v=new Vector();
		
		//��Ӽ��϶���
		v.addElement("hello");
		v.addElement("java");
		v.addElement("javaEE");
		
		//��������
		// Iterator��ʽ����
		Iterator it = v.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

		System.out.println("--------");
		
		//��Enumeration
		Enumeration en=v.elements();
		while(en.hasMoreElements()){
			String ss=(String)en.nextElement();
			System.out.println(ss);
		}
		System.out.println("--------");
		

		// ��forѭ��

		for (int x = 0; x < v.size(); x++) {
			String ss = (String) v.elementAt(x);
			System.out.println(ss);
		}
	}

}
