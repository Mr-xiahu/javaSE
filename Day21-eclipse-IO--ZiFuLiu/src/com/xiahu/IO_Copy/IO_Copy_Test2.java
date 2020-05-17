package com.xiahu.IO_Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 需求：把c:\\a.txt的内容复制到D:\\b.txt中
 *  数据源:c:\\a.txt
 *  目的地:D:\\b.txt
 */
public class IO_Copy_Test2 {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				"c:\\a.txt"));
		// 封装目的地
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"d:\\b.txt"));

		// 复制数据
		// 单个 字符复制
		// int ch = 0;
		// while ((ch = isr.read()) != -1) {
		// osw.write(ch);
		// }

		// 数组复制
		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			osw.write(chs, 0, len);
		}

		osw.flush();
		osw.close();
		isr.close();

	}

}
