package com.xiahu.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ���󣺴洢�Զ�����󲢱���Student(name,age)
 *
 * ������
 * 		A:����ѧ����
 * 		B:�������϶���
 * 		C:����ѧ������
 * 		D:��ѧ��������ӵ����϶�����
 * 		E:��������
 */
public class CollectionTest2 {
	public static void main(String[] args) {
		// B:�������϶���
		Collection c = new ArrayList();

		// C:����ѧ������
		CollectionStudent s1 = new CollectionStudent("�����", 18);
		CollectionStudent s2 = new CollectionStudent("����", 28);
		CollectionStudent s3 = new CollectionStudent("����", 16);
		CollectionStudent s4 = new CollectionStudent("���", 38);
		CollectionStudent s5 = new CollectionStudent("����", 48);

		// D:��ѧ��������ӵ����϶�����
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		
		// E:��������

		Iterator it = c.iterator();
		while (it.hasNext()) {
			CollectionStudent s = (CollectionStudent) it.next();

		}
	}

}
