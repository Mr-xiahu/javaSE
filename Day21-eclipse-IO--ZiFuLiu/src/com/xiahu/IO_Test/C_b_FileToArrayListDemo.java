package com.xiahu.IO_Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 
 * ���󣺴��ı��ļ��ж�ȡ����(ÿһ��Ϊһ���ַ�������)�������У�����������
 * 
 * ������
 * 		ͨ����Ŀ����˼���ǿ���֪�����µ�һЩ���ݣ�
 * 			����Դ��һ���ı��ļ���
 * 			Ŀ�ĵ���һ�����ϡ�
 * 			����Ԫ�����ַ�����
 * 
 * ����Դ��
 * 		b.txt -- FileReader -- BufferedReader
 * Ŀ�ĵأ�
 * 		ArrayList<String>
 */
public class C_b_FileToArrayListDemo {
	public static void main(String[] args) throws IOException {
		//�������϶���
		ArrayList<String> array=new ArrayList<String>();
		
		//��װ����Դ
		BufferedReader br=new BufferedReader(new FileReader("bw.txt"));
		
		String line = null;
		while ((line = br.readLine()) != null) {
			array.add(line);
		}
		
		br.close();
		
		//��������
		for(String s:array){
			System.out.println(s);
		}
	}

}
