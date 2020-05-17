package com.xiahu.Vector;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector�����й��ܣ�
 * 1����ӹ���
 * 		public void addElement(Object obj)		--	add()
 * 2����ȡ����
 * 		public Object elementAt(int index)		--  get()
 * 		public Enumeration elements()			--	Iterator iterator()
 * 				boolean hasMoreElements()				hasNext()
 * 				Object nextElement()					next()
 * 
 * JDK������ԭ��
 * 		A:��ȫ
 * 		B:Ч��
 * 		C:����д
 */
public class VectorDemo {
	public static void main(String[] args) {
		//�������϶���
		Vector v=new Vector();
		
		//��ӹ���
		//public void addElement(Object obj)		--	add()
		v.addElement("hello");
		v.addElement("java");
		v.addElement("javaEE");
		
		//��������
		//public Object elementAt(int index)		--  get()
		for(int x=0;x<v.size();x++){
			String s=(String)v.elementAt(x);
			System.out.println(s);
		}
		System.out.println("---------");
		
		//public Enumeration elements()			--	Iterator iterator()
		//         boolean hasMoreElements()				hasNext()
		//         	Object nextElement()					next()
		Enumeration en=v.elements();
		while(en.hasMoreElements()){
			String ss=(String)en.nextElement();
			System.out.println(ss);
		}
	}

}
