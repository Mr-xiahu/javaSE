package com.xiahu.IO_Test;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 
 * ���󣺰�ArrayList�����е��ַ������ݴ洢���ı��ļ�
 * 
 * ������
 * 		ͨ����Ŀ����˼���ǿ���֪�����µ�һЩ���ݣ�
 * 			ArrayList������洢�����ַ�����
 * 			����ArrayList���ϣ������ݻ�ȡ����
 * 			Ȼ��洢���ı��ļ��С�
 * 			�ı��ļ�˵��ʹ���ַ�����
 * 
 * ����Դ��
 * 		ArrayList<String> -- �����õ�ÿһ���ַ�������
 * Ŀ�ĵأ�
 * 		a.txt -- FileWriter -- BufferedWriter
 */
public class C_a_ArrayListToFileDemo {
	public static void main(String[] args) throws IOException {
		//����ArrayList����
		ArrayList<String> array=new ArrayList<String>();
		//��Ӽ���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("javaSE");
		
		//��װĿ�ĵ�
		BufferedWriter bw =new BufferedWriter(new FileWriter("bw.txt"));
		
		//��������
		for(String s:array){
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
	}

}
