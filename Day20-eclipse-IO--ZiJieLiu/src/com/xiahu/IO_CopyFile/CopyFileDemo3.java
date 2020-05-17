package com.xiahu.IO_CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：把c:\\a.txt内容复制到d:\\b.txt中
 */
public class CopyFileDemo3 {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		FileInputStream fis = new FileInputStream("C:\\a.txt");
		// 封装目的地
		FileOutputStream fos = new FileOutputStream("D:\\b.txt");

		// 复制数据
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}
	}

}
