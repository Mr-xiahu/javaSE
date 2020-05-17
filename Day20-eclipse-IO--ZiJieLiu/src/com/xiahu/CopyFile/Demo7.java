package com.xiahu.CopyFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 高效字符流一次读取一个字符
 */
public class Demo7 {
	public static void main(String[] args) throws Exception {
		// 封装数据源
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		// 封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

		int ch = 0;
		while ((ch = br.read()) != -1) {
			bw.write((char) ch);
		}
		bw.flush();

		bw.close();
	}

}
