package com.xiahu.Map_Son;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * ����Map����
 */
public class MapTest {
	public static void main(String[] args) {
		// �������϶���
		Map<Integer, String> map = new HashMap<Integer, String>();

		// ��Ӽ���Ԫ��
		map.put(1001, "�Ļ�");
		map.put(1002, "����");
		map.put(1003, "����");
		map.put(1004, "��СC");
		
		//��������
		//��ʽһ
		Set<Integer> set=map.keySet();
		for(Integer i:set){
			String s=map.get(i);
			System.out.println(i+"---"+s);
		}
		
		System.out.println("------------");
		//��ʽ��
		Set<Map.Entry<Integer, String>> set1=map.entrySet();
		for(Map.Entry<Integer, String> me:set1){
			System.out.println(me.getKey()+"----"+me.getValue());
		}
	}

}
