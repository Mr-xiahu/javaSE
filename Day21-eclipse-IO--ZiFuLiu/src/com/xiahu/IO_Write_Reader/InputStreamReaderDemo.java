package com.xiahu.IO_Write_Reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader(InputStream is):用默认的编码读取数据
 * InputStreamReader(InputStream is,String charsetName):用指定的编码读取数据
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		// 创建对象
		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				"a.txt"));// 默认读取

		// InputStreamReader isr = new InputStreamReader(new FileInputStream(
		// "a.txt"), "UTF-8");//????? utf-8读取

		// InputStreamReader isr = new InputStreamReader(new FileInputStream(
		// "a.txt"), "GBK");//GBK读取

		// 读取数据
		// 单个字节读取
		int by = 0;
		while ((by = isr.read()) != -1) {
			System.out.print((char) by);
		}

		isr.close();

	}

}
