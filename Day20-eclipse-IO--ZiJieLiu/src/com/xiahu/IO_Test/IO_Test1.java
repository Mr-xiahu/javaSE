package com.xiahu.IO_Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求1：把当前目录下a.txt复制到当前项目目录下的b.txt中
 * 
 * 四种方式
 */
public class IO_Test1 {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		FileInputStream fis = new FileInputStream("a.txt");
		// 封装目的地
		FileOutputStream fos = new FileOutputStream("b.txt");

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"a.txt"));

		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("b.txt"));

		// 基本字节流一次读写一个字节：
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		// 基本字节流一次读写一个字节数组
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}

		// 高效字节流一次读写一个字节
		int by2 = 0;
		while ((by2 = bis.read()) != -1) {
			fos.write(by2);
		}

		// 高效字节流一次读写一个字节数组
		byte[] bys2 = new byte[1024];
		int len2 = 0;
		while ((len2 = bis.read()) != -1) {
			bos.write(bys2, 0, len2);
		}

		// 释放资源
		fis.close();
		fos.close();
		bos.close();
		bis.close();
	}
}
