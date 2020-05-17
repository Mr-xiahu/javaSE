package com.xiahu.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 *  boolean addAll(Collection c):���һ�����ϵ�Ԫ��
 *  boolean removeAll(Collection c):�Ƴ�һ�����ϵ�Ԫ��(��һ����������)
 *  boolean containsAll(Collection c)���жϼ������Ƿ����ָ���ļ���Ԫ��(��һ����������)
 *  boolean retainAll(Collection c):�������϶��е�Ԫ��?˼��Ԫ��ȥ���ˣ����ص�boolean����ʲô��˼��?
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		//��������1
		Collection c1=new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		
		//��������2
		Collection c2=new ArrayList();
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");
		
		// ��������3
		Collection c3 = new ArrayList();
		c3.add("abc4");
		c3.add("abc5");
		c3.add("abc6");
		
		//boolean addAll(Collection c):���һ�����ϵ�Ԫ��
		c1.addAll(c2);
//		System.out.println(c1);
		
		//boolean removeAll(Collection c):�Ƴ�һ�����ϵ�Ԫ��(��һ����������)
		//ֻҪ��һ��Ԫ�ر��Ƴ��ˣ��ͷ���true��
		c1.removeAll(c2);
//		System.out.println(c1);
		
		// boolean containsAll(Collection c)���жϼ������Ƿ����ָ���ļ���Ԫ��(��һ����������)
		//ֻ�а������е�Ԫ�أ��Žа���
		System.out.println(c1.containsAll(c3));
		System.out.println(c1.containsAll(c2));
		
		//boolean retainAll(Collection c):�������϶��е�Ԫ��?˼��Ԫ��ȥ���ˣ����ص�boolean����ʲô��˼��?
		// ��������������A��B��
		// A��B�����������յĽ��������A�У�B���䡣
		// ����ֵ��ʾ����A�Ƿ������ı䡣
		System.out.println(c1.retainAll(c3));
		System.out.println(c1);
		System.out.println(c3);
	}

}
