package com.xiahu.Work;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
 * 
 * ������
 * 		A:�������϶���
 * 		B:��Ӷ���ַ���Ԫ��(����������ͬ��)
 * 		C:�����¼���
 * 		D:�����ɼ���,��ȡ�õ�ÿһ��Ԫ��
 * 		E:�����Ԫ�ص��¼���ȥ�ң�����û��
 * 			�У���������
 * 			û�У�����ӵ��¼���
 * 		F:�����¼���
 */
public class ArrayListTest {
	public static void main(String[] args) {
		//A:�������϶���
		ArrayList array=new ArrayList();
		
		// ��Ӷ���ַ���Ԫ��(����������ͬ��)
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");
		
		//C:�����¼���
		ArrayList arrayNew=new ArrayList();
		
		//D:�����ɼ���,��ȡ�õ�ÿһ��Ԫ��
		Iterator it=array.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			if(!arrayNew.contains(s)){
				arrayNew.add(s);
			}
		}
		//F:�����¼���
		for(int x=0;x<arrayNew.size();x++){
			String ss=(String)arrayNew.get(x);
			System.out.println(ss);
		}
		
	}

}
