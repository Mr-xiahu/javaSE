package com.xiahu.BufferedWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ���Ϊ�˸�Ч��д��Ҳ�ṩ�˶�Ӧ���ַ���������
 * BufferedWriter:�ַ����������
 * BufferedReader:�ַ�����������
 * 
 * BufferedWriter:�ַ����������
 * ���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ���������ַ����ĸ�Чд�롣 
 * ����ָ���������Ĵ�С�����߽���Ĭ�ϵĴ�С���ڴ��������£�Ĭ��ֵ���㹻���ˡ� 
 */
public class ButteredWriteDemo {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw=new BufferedWriter(new FileWriter("bw.txt"));
		
		bw.write("�㻹ѽ");
		
		bw.flush();
		bw.close();
		
	}

}
