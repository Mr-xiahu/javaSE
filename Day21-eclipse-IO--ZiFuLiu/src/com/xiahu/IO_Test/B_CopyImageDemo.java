package com.xiahu.IO_Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����ͼƬ
 * 
 * ������
 * 		�������ݣ��������֪���ü��±��򿪲��ܹ������������ַ������������ֽ�����
 * 		ͨ����ԭ������֪������Ӧ�ò����ֽ�����
 * 		���ֽ�����4�ַ�ʽ�������������Ŀ������4�ַ�ʽ���Ƽ����յ�4�֡�
 * 
 * ����Դ��
 * 		c:\\a.jpg -- FileInputStream -- BufferedInputStream
 * Ŀ�ĵأ�
 * 		d:\\b.jpg -- FileOutputStream -- BufferedOutputStream
 */
public class B_CopyImageDemo {
	public static void main(String[] args) throws IOException {
		// ���ַ�����װ����Դ��Ŀ�ĵ�
		String srcAddress = "c:\\a.jpg";
		String mudiAddress = "d:\\b.jpg";
		// method1(srcAddress, mudiAddress);
		// method2(srcAddress, mudiAddress);
		 method2(srcAddress, mudiAddress);
		// method4(srcAddress, mudiAddress);

	}

	// �����ֽ��������ֽڸ���
	public static void method1(String srcAddress, String mudiAddress)
			throws IOException {
		FileInputStream fis = new FileInputStream(srcAddress);
		FileOutputStream fos = new FileOutputStream(mudiAddress);
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		fos.close();
		fis.close();

	}

	// �����ֽ����ֽ����鸴��
	public static void method2(String srcAddress, String mudiAddress)
			throws IOException {
		FileInputStream fis = new FileInputStream(srcAddress);
		FileOutputStream fos = new FileOutputStream(mudiAddress);
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}

		fos.close();
		fis.close();
	}

	// �ֽڻ����������ֽڸ���
	public static void method3(String srcAddress, String mudiAddress)
			throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				srcAddress));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(mudiAddress));

		int by = 0;
		while ((by = bis.read()) != -1) {
			bos.write(by);
		}
		bos.close();
		bis.close();

	}

	// �ֽڻ������ֽ����鸴��
	public static void method4(String srcAddress, String mudiAddress)
			throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				srcAddress));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(mudiAddress));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bis.close();
		bos.close();
	}

}
