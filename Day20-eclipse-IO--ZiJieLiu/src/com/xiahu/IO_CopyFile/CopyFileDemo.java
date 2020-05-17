package com.xiahu.IO_CopyFile;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * �����ı��ļ���
 * 
 * ����Դ����������
 * a.txt	--	��ȡ����	--	FileInputStream	
 * 
 * Ŀ�ĵأ�������ȥ
 * b.txt	--	д����		--	FileOutputStream
 * 
 * java.io.FileNotFoundException: a.txt (ϵͳ�Ҳ���ָ�����ļ���)
 * 
 * ��һ�θ�������û�г����κ����⣬Ϊʲô��?
 * ��һ�����ǳ��������ԭ����������ÿ�λ�ȡ��һ���ֽ����ݣ��ͰѸ��ֽ�����ת��Ϊ���ַ����ݣ�Ȼ�����������̨��
 * ����һ����?ȷʵͨ��IO����ȡ���ݣ�д���ı��ļ������ȡһ���ֽڣ��Ҿ�д��һ���ֽڣ���û�����κε�ת����
 * �����Լ���ת����
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		// ����Դ
		InputStream inStream = new FileInputStream(new File("a.txt"));

		// Ŀ�ĵ�
		OutputStream outStrean = new FileOutputStream(new File("b.txt"));

		// ��ȡ����Դ�е�����
		byte[] bys = new byte[1024];
		int length = 0;
		while ((length = inStream.read(bys)) != -1) {
			outStrean.write(bys, 0, length);
		}
		
		//�ر���
		inStream.close();
		outStrean.close();
	}

}
