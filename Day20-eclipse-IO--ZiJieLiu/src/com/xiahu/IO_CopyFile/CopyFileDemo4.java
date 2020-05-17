package com.xiahu.IO_CopyFile;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  需求：把e:\\林青霞.jpg内容复制到当前项目目录下的mn.jpg中
 *  数据源:e:\\林青霞.jpg
 *  
 *  目的地:mnjpg
 */
public class CopyFileDemo4 {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		FileInputStream fis = new FileInputStream("e:\\林青霞.jpg");

		// 封装目的地
		FileOutputStream fos = new FileOutputStream("mn.jpg");

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
