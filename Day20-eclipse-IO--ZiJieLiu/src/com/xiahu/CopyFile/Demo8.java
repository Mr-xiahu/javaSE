package com.xiahu.CopyFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * ��Ч�ַ���һ�ζ�ȡһ���ַ�����
 */
public class Demo8 {
	public static void main(String[] args) throws Exception {
		// ��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		// ��װĿ�ĵ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));


		// ���鸴��
		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
			bw.flush();
		}
		

		bw.close();
		br.close();
	}

}
