package com.xiahu.CopyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 普通字符流一次读取一个字符数组
 */
public class Demo6 {
	public static void main(String[] args) throws Exception {
		// 数据源
		InputStreamReader reader = new InputStreamReader(new FileInputStream(new File("a.txt")));
		// 目的地
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(new File("b.txt")));

		// 读取数据
		char[] chs = new char[1024];
		int length = 0;
		while ((length = reader.read(chs)) != -1) {
			writer.write(chs, 0, length);
		}

		reader.close();
		writer.close();

	}

}
