package com.xiahu.IO_File_WriteAndReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 * �������ǳ����Ĳ�������ʹ�ñ���Ĭ�ϱ��룬���ԣ�����ָ�����롣
 * ��ת�����������е㳤�����ԣ�Java���ṩ�������๩����ʹ�á�
 * OutputStreamWriter = FileOutputStream + �����(GBK)
 * FileWriter = FileOutputStream + �����(GBK)
 * 
 * InputStreamReader = FileInputStream + �����(GBK)
 * FileReader = FileInputStream + �����(GBK)
 * 
 * 
 * ���󣺰�c:\\a.txt�����ݸ��Ƶ�D:\\b.txt��
 *  ����Դ:c:\\a.txt
 *  Ŀ�ĵ�:D:\\b.txt
 */
public class FileWriteAndReaderDemo {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		FileReader fr = new FileReader("c:\\a.txt");
		// ��װĿ�ĵ�
		FileWriter fw = new FileWriter("d:\\b.txt");

		// ��������
		// ��������
		// int ch=0;
		// while((ch=fr.read())!=-1){
		// fw.write(ch);
		// }
		//
		

		// ���鸴��
		char[] chs = new char[1024];
		int len = 0;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
		}
		
		fw.flush();
		fw.close();
		fr.close();
	}

}
