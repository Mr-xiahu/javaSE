package com.xiahu.IO_CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺰�e:\\������ - Ψһ.mp3���Ƶ���ǰ��ĿĿ¼�µ�copy.mp3��
 * ����Դ:e:\\������ - Ψһ.mp3
 * Ŀ�ĵ�:copy.mp3
 */
public class CopyMp4Demo {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		FileInputStream fis=new FileInputStream("e:\\������ - Ψһ.mp3");
		//��װĿ�ĵ�
		FileOutputStream fos=new FileOutputStream("copy.mp3");
		int by=0;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
		
		//�ͷ���Դ
		fis.close();
		fos.close();
	}

}
