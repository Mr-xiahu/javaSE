package com.xiahu.CopyFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * ��Ч�ַ���һ�ζ�ȡһ���ַ�
 */
public class Demo7 {
	public static void main(String[] args) throws Exception {
		// ��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		// ��װĿ�ĵ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

		int ch = 0;
		while ((ch = br.read()) != -1) {
			bw.write((char) ch);
		}
		bw.flush();

		bw.close();
	}

}
