package com.xiahu.CopyFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 高效类字节流一次写入一个字节数组
 */
public class Demo4 {
	public static void main(String[] args) throws Exception {
		// 数据源
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("a.txt")));
		// 目的地
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("b.txt")));

		// 读取数据
		byte[] bys = new byte[1024];
		int length = 0;
		while ((length = bufferedInputStream.read(bys)) != -1) {
			bufferedOutputStream.write(bys, 0, length);
			
		}
		bufferedOutputStream.flush();
		// 关闭流
		bufferedInputStream.close();
		bufferedOutputStream.close();

	}

}
