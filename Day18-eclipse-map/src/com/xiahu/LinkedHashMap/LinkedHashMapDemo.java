package com.xiahu.LinkedHashMap;

import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Set;

/*
 * LinkedHashMap:��Map�ӿڵĹ�ϣ��������б�ʵ�֣����п�Ԥ֪�ĵ���˳��
 * �ɹ�ϣ��֤����Ψһ��
 * ������֤���̵�����(�洢��ȡ����˳��һ��)
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {

		// �������϶���
		LinkedHashMap<String, String> hm = new LinkedHashMap<>();

		// ��Ӽ���Ԫ��
		hm.put("1234", "��ѧ��");
		hm.put("2345", "���»�");
		hm.put("4567", "������");
		hm.put("6789", "������");
		
		//����
		Set<Map.Entry<String, String>> set=hm.entrySet();
		for(Map.Entry<String, String> me:set){
			System.out.println(me.getKey()+"---"+me.getValue());
		} 
	}

}
