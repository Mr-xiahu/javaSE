package com.xiahu.IO_Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;


/*
 * ��������һ���ı��ļ��д洢�˼������ƣ�����дһ������ʵ�������ȡһ���˵����֡�
 * 
 * ������
 * 		A:���ı��ļ��е����ݴ洢��������
 * 		B:�������һ������
 * 		C:���ݸ�������ȡһ��ֵ
 */
public class C_c_GetName {
	public static void main(String[] args) throws IOException {
		// ����Map����
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// ��ȡ�ı��е�����
		BufferedReader br = new BufferedReader(new FileReader("br.txt"));
		String line = null;
		int index = 0;
		while ((line = br.readLine()) != null) {
			map.put(index, line);
			index++;
		}

		br.close();

		// //����map����
		// Set<Map.Entry<Integer, String>> set=map.entrySet();
		// for(Map.Entry<Integer, String> mm:set){
		// Integer id=mm.getKey();
		// String name=mm.getValue();
		// System.out.println(id+"---"+name);
		// }

		// �������һ������
		Random r = new Random();
		int num = r.nextInt(map.size());

		// ���ݸ�������ȡһ��ֵ
		String name = map.get(num);
		System.out.println("���������ǣ�" + name);
	}

}
