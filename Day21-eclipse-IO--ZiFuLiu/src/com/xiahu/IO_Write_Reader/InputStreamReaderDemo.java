package com.xiahu.IO_Write_Reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader(InputStream is):��Ĭ�ϵı����ȡ����
 * InputStreamReader(InputStream is,String charsetName):��ָ���ı����ȡ����
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		// ��������
		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				"a.txt"));// Ĭ�϶�ȡ

		// InputStreamReader isr = new InputStreamReader(new FileInputStream(
		// "a.txt"), "UTF-8");//????? utf-8��ȡ

		// InputStreamReader isr = new InputStreamReader(new FileInputStream(
		// "a.txt"), "GBK");//GBK��ȡ

		// ��ȡ����
		// �����ֽڶ�ȡ
		int by = 0;
		while ((by = isr.read()) != -1) {
			System.out.print((char) by);
		}

		isr.close();

	}

}
