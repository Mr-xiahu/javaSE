package com.xiahu.CopyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 普通类字节流一次写入一个字节数组
 */
public class Demo2 {
	public static void main(String[] args) throws Exception {
		// 数据源
		InputStream inputStream = new FileInputStream(new File("a.txt"));
		// 目的地
		OutputStream outputStream = new FileOutputStream(new File("b.txt"));

		// 一次读取一个字节
		byte[] bys = new byte[1024];
		int length = 0;
		long start = System.currentTimeMillis();
		while ((length = inputStream.read(bys))!=-1) {
			System.out.println(new String(bys,0,length));
			outputStream.write(bys, 0, length);
		}
		long end = System.currentTimeMillis();
		System.out.println("花费时间:"+(end - start));
		inputStream.close();
		outputStream.close();
	}

}
