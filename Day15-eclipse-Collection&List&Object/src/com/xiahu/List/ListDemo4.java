package com.xiahu.List;

import java.util.ArrayList;
import java.util.List;

import com.xiahu.Collection.CollectionStudent;

/*
 * �洢�Զ�����󲢱���,����ͨforѭ����(size()��get()���)
 */
public class ListDemo4 {
	public static void main(String[] args) {
		// ����List����
		List list = new ArrayList();

		// ����ѧ������
		CollectionStudent s1 = new CollectionStudent("�����", 18);
		CollectionStudent s2 = new CollectionStudent("����", 28);
		CollectionStudent s3 = new CollectionStudent("����", 16);
		CollectionStudent s4 = new CollectionStudent("���", 38);
		CollectionStudent s5 = new CollectionStudent("����", 48);

		// ��Ӽ��϶���
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		// ����ͨforѭ����(size()��get(
		for (int x = 0; x < list.size(); x++) {
			CollectionStudent s = (CollectionStudent) list.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}

	}

}
