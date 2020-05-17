package com.xiahu.IONew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 读取数据
 */
public class IODemo_FileIntPutStream {
	public static void main(String[] args) throws Exception {
		FileInputStream fileInputStream = new FileInputStream(new File(
				"E:/学习资料/视频/已完成/A_javaSE基础1-27天/day20IO流/code/day20_IO/src/cn/itcast_02/FileInputStreamDemo.java"));

		// 一次读取一个子节
		int bys = 0;
//		while ((bys = fileInputStream.read()) != -1) {
//			System.out.print((char) bys);
//		}

		// 一次读取一个子节数组
		byte[] byt = new byte[1024];
		int len = 0;
		while ((len = fileInputStream.read(byt)) != -1) {
			System.out.print(new String(byt, 0, len));
		}
		
		fileInputStream.close();
	}

}
