package com.xiahu.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * ����
 *����HashMap���ϵ�Ԫ����ArrayList����3����
 *ÿһ��ArrayList���ϵ�ֵ���ַ�����
 *Ԫ�����Ѿ���ɣ��������
 *�����
 *		 ��������
 *		 	����
 *		 	���
 *		 Ц������
 *		 	�����
 *		 	��ƽ֮
 *		 �������
 *		 	����
 *		 	���  
 */
public class HashMapIncludeArraylistDemo {
	public static void main(String[] args) {
		// ��������Ԫ��
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		// ����ArrayList����
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		ArrayList<String> array3 = new ArrayList<String>();

		// array1��Ӽ���Ԫ��
		array1.add("����");
		array1.add("���");

		// array2��Ӽ���Ԫ��
		array2.add("�����");
		array2.add("��ƽ֮");

		// array1��Ӽ���Ԫ��
		array3.add("����");
		array3.add("���");
		
		//HashMap���Ԫ�ض����Ǹ�
		hm.put("��������", array1);
		hm.put("Ц������", array2);
		hm.put("�������", array3);
		
		//����
		Set<Map.Entry<String, ArrayList<String>>> set=hm.entrySet();
		for(Map.Entry<String, ArrayList<String>> me:set){
			String ss=me.getKey();
			System.out.println(ss);
			ArrayList<String> array=me.getValue();
			for(String s:array){
				System.out.println("\t"+s);
			}
		}

	}

}
