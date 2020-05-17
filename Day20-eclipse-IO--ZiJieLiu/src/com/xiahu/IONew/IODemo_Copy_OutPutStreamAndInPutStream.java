package com.xiahu.IONew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 复制文本
 */
public class IODemo_Copy_OutPutStreamAndInPutStream {
	public static void main(String[] args) throws Exception {
		FileInputStream fileInputStream = new FileInputStream(new File(
				"E:/学习资料/视频/已完成/A_javaSE基础1-27天/day20IO流/code/day20_IO/src/cn/itcast_02/FileInputStreamDemo.java"));

		FileOutputStream fileOutputStream = new FileOutputStream(new File("E:/javaWorkSpace/upload/FileDemo.txt"));

		// 读取子节
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fileInputStream.read(bys)) != -1) {
			fileOutputStream.write(bys, 0, len);
		}
		
		fileInputStream.close();
		fileOutputStream.close();

	}

}
