package com.xiahu.CopyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 普通字符流一次读取一个字符
 */
public class Demo5 {
	public static void main(String[] args) throws Exception {
		// 数据源
		InputStreamReader reader = new InputStreamReader(new FileInputStream(new File("a.txt")));
		// 目的地
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(new File("b.txt")));

		// 读取数据
		int bys = 0;
		while ((bys = reader.read()) != -1) {
			writer.write(bys);
		}
		
		reader.close();
		writer.close();

	}

}
