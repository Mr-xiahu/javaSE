package com.xiahu.IONew;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * �ӽڻ����������ļ�
 */
public class IODemo_BufferedInputStrem {
	public static void main(String[] args) throws Exception {
		// ����Դ
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("a.txt")));
		// Ŀ�ĵ�
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("b.txt")));

		// ��ȡ����
		byte[] bys = new byte[1024];
		int len = 0;
		while((len=bufferedInputStream.read(bys))!=-1){
			bufferedOutputStream.write(bys, 0, len);
			bufferedOutputStream.flush();
		}
		bufferedInputStream.close();
		bufferedOutputStream.close();
		
	}

}
