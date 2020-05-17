package com.xiahu.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * HashMap:�ǻ��ڹ�ϣ���Map�ӿ�ʵ�֡�
 * ��ϣ���������������֤����Ψһ�Եġ�
 * 
 * HashMap<String,String>
 * ����String
 * ֵ��String
 */
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String,String>();
		
		//��Ӽ���Ԫ��
		hm.put("10001", "�����");
		hm.put("10002", "������");
		hm.put("10003", "������");
		hm.put("10004", "�ƺ���");
		hm.put("10005", "��");
		hm.put("10005", "����");
		
		//����
		Set<Map.Entry<String, String>> set=hm.entrySet();
		for(Map.Entry<String, String> me:set){
			System.out.println(me.getKey()+"---"+me.getValue());
		}

	}
}
