package com.xiahu.Collection;

import java.util.ArrayList;
import java.util.Collection;



/*
 * ��ϰ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б�����
 * 
 * ������
 * A:����ѧ����
 * B:�������϶���
 * C:����ѧ������
 * D:��ѧ����ӵ�����
 * E:�Ѽ���ת������
 * F:��������
 * 
 */
public class CollectionTest {
	public static void main(String[] args) {
		// B:�������϶���
		Collection c = new ArrayList();

		// C:����ѧ������
		CollectionStudent s1 = new CollectionStudent("��������", 15);
		CollectionStudent s2 = new CollectionStudent("��ӯӯ", 26);
		CollectionStudent s3 = new CollectionStudent("����", 37);
		CollectionStudent s4 = new CollectionStudent("������", 48);
		CollectionStudent s5 = new CollectionStudent("�����", 59);

		// D:��ѧ����ӵ�����
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		for (Object object : c) {
			System.out.println(c.toString());
		}

		// E:�Ѽ���ת������
		Object[] obj = c.toArray();

		// F:��������
		for (int x = 0; x < obj.length; x++) {
			CollectionStudent s = (CollectionStudent) obj[x];
			System.out.println(s.getName() + "--" + s.getName());
//			System.out.println(obj[x].toString());
		}
	

	}

}
