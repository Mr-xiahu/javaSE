package com.xiahu.Map_Son;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵı�����
 * Map -- ���޶�
 * 
 * ˼·��
 * 		A:��ȡ���н��֤�ļ���
 * 		B:�������֤�ļ��ϣ��õ�ÿһ�����֤
 * 		C:���ݽ��֤��ȡ�ɷ������
 * 
 * ת����
 * 		A:��ȡ���м�ֵ�Զ���ļ���
 * 		B:������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
 * 		C:���ݼ�ֵ�Զ����ȡ����ֵ
 * 
 * ���������鷳�ľ��Ǽ�ֵ�Զ�����α�ʾ��?
 * �������ǿ�ʼ��һ��������
 * 		Set<Map.Entry<K,V>> entrySet()�����ص��Ǽ�ֵ�Զ���ļ���
 */
public class MapDemo4 {
	public static void main(String[] args) {
		// �������϶���
		Map<String, String> map = new HashMap<String, String>();

		// ��Ӽ���Ԫ��
		map.put("�ܽ���", "����");
		map.put("������", "��ӱ");
		map.put("������", "����");
		map.put("����", "�����P");
		
		//��ȡ���м�ֵ�Զ���ļ���
		//Set<Map.Entry<K,V>> entrySet()�����ص��Ǽ�ֵ�Զ���ļ���
		Set<Map.Entry<String, String>> set=map.entrySet();
		//������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
		for(Map.Entry<String, String> me:set){
			//���ݼ�ֵ�Զ����ȡ����ֵ
			System.out.println(me.getKey()+"---"+me.getValue());
		}
	}

}
