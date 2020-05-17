package com.xiahu.IO_BufferInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import java.io.IOException;

/*
 * 注意：虽然我们有两种方式可以读取，但是，请注意，这两种方式针对同一个对象在一个代码中只能使用一个。
 */
public class BufferInputStreamDemo {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"b.txt"));

		// 读取数据
		// 单个字节读取
		// int by = 0;
		// while ((by = bis.read()) != -1) {
		// System.out.print((char) by);
		// }
		System.out.println("-------------->");

		// 数组服务数据
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}

		// 释放资源
		bis.close();

	}

}
