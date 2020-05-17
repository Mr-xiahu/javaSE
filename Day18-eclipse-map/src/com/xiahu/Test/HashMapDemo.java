package com.xiahu.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *  HashMapǶ��HashMap
 * 
 * ���ǲ���
 * 		jc	������
 * 				����¥		20
 * 				��Ծ		22
 * 		jy	��ҵ��
 * 				���		21
 * 				��ʯ��		23
 */
public class HashMapDemo {
	public static void main(String[] args) {
		// �������ǲ���HashMap
		HashMap<String, Map<String, Integer>> czbomap = new HashMap<String, Map<String, Integer>>();

		// ����������HashMap
		HashMap<String, Integer> jc = new HashMap<String, Integer>();

		// ��ӻ�����Ԫ�ض���
		jc.put("����¥", 20);
		jc.put("��Ծ", 22);

		// ������ҵ��HashMap
		HashMap<String, Integer> jy = new HashMap<String, Integer>();

		// ��ӻ�����Ԫ�ض���
		jy.put("���", 21);
		jy.put("��ʯ��", 23);
		
		//���ǲ���HashMap��Ӽ��϶���
		czbomap.put("jc", jc);
		czbomap.put("jy", jy);
		
		//����
		Set<Map.Entry<String, Map<String, Integer>>> set= czbomap.entrySet();
		for(Map.Entry<String, Map<String, Integer>> me:set){
			String key=me.getKey();
			HashMap<String, Integer> hs=(HashMap<String, Integer>) me.getValue();
			Set<Map.Entry<String, Integer>> set1=hs.entrySet();
			for(Map.Entry<String, Integer> me1:set1){
				String name=me1.getKey();
				Integer age=me1.getValue();
				System.out.println("�༶:"+key+"\t����:"+name+"     ����:"+age);
			}
			
		}
	}

}
