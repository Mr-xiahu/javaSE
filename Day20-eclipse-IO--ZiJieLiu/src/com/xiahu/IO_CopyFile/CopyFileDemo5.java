package com.xiahu.IO_CopyFile;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  需求：把e:\\王力宏 - 唯一.mp3复制到当前项目目录下的copy.mp3中
 */
public class CopyFileDemo5 {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		FileInputStream fis = new FileInputStream("e:\\王力宏 - 唯一.mp3");

		// 封装目的地
		FileOutputStream fos = new FileOutputStream("copy.mp3");

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);

		}

		// 释放资源
		fos.close();
		fis.close();
	}

}
