package com.xiahu.Map_Son;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapTest2 {
	private static final int String = 0;

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		
		map.put("�޼���ʥ", "�״�ʦ");
		map.put("äɮ", "Leeson");
		map.put("������ʦ", "�ֿ�˹");
		map.put("��������֮��", "����");
		map.put("��������֮��", "����");
		
		Set<Map.Entry<String, String>> set=map.entrySet();
		for(Map.Entry<String, String> me:set){
			System.out.println(me.getKey()+"-------"+me.getValue());
		}
	}

}
