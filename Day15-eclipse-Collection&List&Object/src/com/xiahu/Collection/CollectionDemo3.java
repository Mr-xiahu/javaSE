package com.xiahu.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 
 * ���ϵı�������ʵ�������λ�ȡ�����е�ÿһ��Ԫ�ء�
 * 
 * Object[] toArray():�Ѽ���ת�����飬����ʵ�ּ��ϵı���
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		//��������
		Collection c=new ArrayList();
		c.add("hello");
		c.add("world");
		
		//�Ѽ���ת������
		Object[] obj=c.toArray();
		
		//��������
		for(int x=0;x<obj.length;x++){
			System.out.println(obj[x]);
			System.out.println(obj[x].toString().length());
			// ��֪��Ԫ�����ַ��������ڻ�ȡ��Ԫ�صĵ�ͬʱ������֪��Ԫ�صĳ��ȡ�
			// System.out.println(objs[x] + "---" + objs[x].length());
			// �����ʵ�ֲ��ˣ�ԭ����Object��û��length()����
			// ����Ҫ��ʹ���ַ����ķ������ͱ����Ԫ�ػ�ԭ���ַ���
			// ����ת��
			String s = (String) obj[x];
			System.out.println(s + "---" + s.length());
		}
	}

}
