package com.xiahu.Buffered_Copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 * 需求：把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中
 * 
 * 数据源：
 * 		a.txt -- 读取数据 -- 字符转换流 -- InputStreamReader -- FileReader -- BufferedReader
 * 目的地：
 * 		b.txt -- 写出数据 -- 字符转换流 -- OutputStreamWriter -- FileWriter -- BufferedWriter
 */
public class Buffered_Copy_Test2 {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		BufferedReader br = new BufferedReader(new FileReader("c:\\a.txt"));
		// 封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\b.txt"));

		// 复制数据
		// 单个复制
		// int ch = 0;
		// while ((ch = br.read()) != -1) {
		// bw.write((char) ch);
		// }

		// 数组复制
		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
		}
		bw.flush();

		bw.close();
	}

}
