package com.xiahu.IO_Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 * 
 * ��֪s.txt�ļ�����������һ���ַ�������hcexfgijkamdnoqrzstuvwybpl��
 * ���д�����ȡ�������ݣ������������д��ss.txt�С�
 * 
 * ������
 * 		A:��s.txt����ļ���������
 * 		B:��ȡ���ļ������ݣ��洢��һ���ַ�����
 * 		C:���ַ���ת��Ϊ�ַ�����
 * 		D:���ַ������������
 * 		E:���������ַ�����ת��Ϊ�ַ���
 * 		F:���ַ����ٴ�д��ss.txt��
 */
public class H_StringdDemo {
	public static void main(String[] args) throws IOException {
		// ��ȡ���ļ������ݣ��洢��һ���ַ�����
		BufferedReader br = new BufferedReader(new FileReader("ss.txt"));

		// ��ȡ���ļ������ݣ��洢��һ���ַ�����
		String line = br.readLine();
		br.close();

		// ���ַ���ת��Ϊ�ַ�����
		char[] chs = line.toCharArray();

		// ���ַ������������
		Arrays.sort(chs);

		// ���������ַ�����ת��Ϊ�ַ���
		String ss = new String(chs);

		BufferedWriter bw = new BufferedWriter(new FileWriter("ss.txt"));
		bw.write(ss);
		bw.newLine();
		bw.flush();
		bw.close();

	}

}
