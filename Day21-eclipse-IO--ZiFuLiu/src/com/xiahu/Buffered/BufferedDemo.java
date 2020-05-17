package com.xiahu.Buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符缓冲流的特殊方法：
 * BufferedWriter:
 * 		public void newLine():根据系统来决定换行符
 * BufferedReader:
 * 		public String readLine()：一次读取一行数据
 * 		包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null
 */
public class BufferedDemo {
	public static void main(String[] args) throws IOException {
		write();
		read();
		
		

	}

	public static void read() throws IOException {
		//创建字符缓冲输入流
		BufferedReader br=new BufferedReader(new FileReader("a.txt"));
		//读取数据
		//public String readLine()：一次读取一行数据
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		
	}

	public static void write() throws IOException {
		// 创建字符缓冲输出流
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));

		// 写入数据
		for (int x = 0; x < 10; x++) {
			bw.write("hello"+x);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
	}

}
