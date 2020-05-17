package com.xiahu.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader
 * ���ַ��������ж�ȡ�ı�����������ַ����Ӷ�ʵ���ַ���������еĸ�Ч��ȡ�� 
 * ����ָ���������Ĵ�С�����߿�ʹ��Ĭ�ϵĴ�С�����������£�Ĭ��ֵ���㹻���ˡ� 
 * 
 * BufferedReader(Reader in)
 */
public class ButteredReaderDemo {
	public static void main(String[] args) throws IOException {
		// �����ֽڻ�����������
		BufferedReader br = new BufferedReader(new FileReader("bw.txt"));

		// ��ȡ����
		// һ���ֽ�һ���ֽڵĶ�
		// int ch = 0;
		// while ((ch = br.read()) != -1) {
		// System.out.print((char) ch);
		// }

		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}

		br.close();
	}

}
