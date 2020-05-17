package com.xiahu.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ��ϰ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б������õ�����������
 * 
 * ����1:����whileѭ��д����������ܲ�����forѭ����?
 * ����2:��Ҫ���ʹ��it.next()��������Ϊÿ��ʹ�ö��Ƿ���һ������
 */
public class CollectionIteratorTest {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();

		// C:����ѧ������
		CollectionStudent s1 = new CollectionStudent("��������", 15);
		CollectionStudent s2 = new CollectionStudent("��ӯӯ", 26);
		CollectionStudent s3 = new CollectionStudent("����", 37);
		CollectionStudent s4 = new CollectionStudent("������", 48);
		CollectionStudent s5 = new CollectionStudent("�����", 59);

		// ��ѧ��������ӵ�����
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		// ����������
		Iterator it = c.iterator();

		// ��ʼ����
		while (it.hasNext()) {
			CollectionStudent s = (CollectionStudent) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
			// NoSuchElementException ��Ҫ���ʹ��it.next()����
			// System.out.println(((Student) it.next()).getName() + "---"
			// + ((Student) it.next()).getAge());
		}
		// System.out.println("----------------------------------");


	}

}
