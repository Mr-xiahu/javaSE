package com.xiahu.Map_Son;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵı�����
 * Map -- ���޶�
 * ˼·��
 * 		A:�����е��ɷ������������
 * 		B:�����ɷ�ļ��ϣ���ȡ�õ�ÿһ���ɷ�
 * 		C:���ɷ�ȥ���Լ������ӡ�
 * 
 * ת����
 * 		A:��ȡ���еļ�
 * 		B:�������ļ��ϣ���ȡ�õ�ÿһ����
 * 		C:���ݼ�ȥ��ֵ
 */
public class MapDemo3 {
	public static void main(String[] args) {
		//�������϶���
		Map<String, String> map=new HashMap<String, String>();
		
		//��Ӽ���Ԫ��
		map.put("�ܽ���", "����");
		map.put("������", "��ӱ");
		map.put("������", "����");
		map.put("����", "�����P");
		
		//A:��ȡ���еļ�
		Set<String> set=map.keySet();
		for(String s:set){
			
			String c=map.get(s);
			System.out.println(s+"--"+c);
		}
	}

}
