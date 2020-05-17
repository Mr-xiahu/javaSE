package com.xiahu.IO_Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制图片
 * 
 * 分析：
 * 		复制数据，如果我们知道用记事本打开并能够读懂，就用字符流，否则用字节流。
 * 		通过该原理，我们知道我们应该采用字节流。
 * 		而字节流有4种方式，所以做这个题目我们有4种方式。推荐掌握第4种。
 * 
 * 数据源：
 * 		c:\\a.jpg -- FileInputStream -- BufferedInputStream
 * 目的地：
 * 		d:\\b.jpg -- FileOutputStream -- BufferedOutputStream
 */
public class B_CopyImageDemo {
	public static void main(String[] args) throws IOException {
		// 用字符串封装数据源，目的地
		String srcAddress = "c:\\a.jpg";
		String mudiAddress = "d:\\b.jpg";
		// method1(srcAddress, mudiAddress);
		// method2(srcAddress, mudiAddress);
		 method2(srcAddress, mudiAddress);
		// method4(srcAddress, mudiAddress);

	}

	// 基本字节流单个字节复制
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

	// 基本字节流字节数组复制
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

	// 字节缓冲流单个字节复制
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

	// 字节缓冲流字节数组复制
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
