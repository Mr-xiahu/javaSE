package com.xiahu.IO_CopyFile;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  ���󣺰�e:\\����ϼ.jpg���ݸ��Ƶ���ǰ��ĿĿ¼�µ�mn.jpg��
 *  ����Դ:e:\\����ϼ.jpg
 *  
 *  Ŀ�ĵ�:mn.jpg
 */
public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		//��װ����Դ 
		FileInputStream fis=new FileInputStream("E:\\����ϼ.jpg");
		//��װĿ�ĵ�
		FileOutputStream fos=new FileOutputStream("mn.jpg");
		
		int by=0;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
	}

}