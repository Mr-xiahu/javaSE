package com.xiahu.Test;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * 
 *  ArrayList����Ƕ��HashMap���ϲ�������
 ����
 ����ArrayList���ϵ�Ԫ����HashMap����3����
 ÿһ��HashMap���ϵļ���ֵ�����ַ�����
 Ԫ�����Ѿ���ɣ��������
 �����
 ���---С��
 ����---����

 ����---����
 ���---С��Ů

 �����---��ӯӯ
 ��ƽ֮---����ɺ
 */
public class ArraylistIncludeHashMapDemo {
	public static void main(String[] args) {
		ArrayList<HashMap<String, String>> array=new ArrayList<HashMap<String,String>>();
		
		//����HashMap����
		HashMap<String, String> hm=new HashMap<String, String>();
		
		hm.put("���", "С��");
		hm.put("����", "����");
		hm.put("����", "����");
		hm.put("���", "С��Ů");
		hm.put("�����", "��ӯӯ");
		hm.put("��ƽ֮", "����ɺ");
		
		//
		array.add(hm);
		for(HashMap<String, String> s:array){
			System.out.println(s);
		}
	}

}
