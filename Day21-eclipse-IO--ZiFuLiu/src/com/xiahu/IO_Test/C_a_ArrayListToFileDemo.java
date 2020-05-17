package com.xiahu.IO_Test;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 
 * 需求：把ArrayList集合中的字符串数据存储到文本文件
 * 
 * 分析：
 * 		通过题目的意思我们可以知道如下的一些内容，
 * 			ArrayList集合里存储的是字符串。
 * 			遍历ArrayList集合，把数据获取到。
 * 			然后存储到文本文件中。
 * 			文本文件说明使用字符流。
 * 
 * 数据源：
 * 		ArrayList<String> -- 遍历得到每一个字符串数据
 * 目的地：
 * 		a.txt -- FileWriter -- BufferedWriter
 */
public class C_a_ArrayListToFileDemo {
	public static void main(String[] args) throws IOException {
		//创建ArrayList集合
		ArrayList<String> array=new ArrayList<String>();
		//添加集合元素
		array.add("hello");
		array.add("world");
		array.add("javaSE");
		
		//封装目的地
		BufferedWriter bw =new BufferedWriter(new FileWriter("bw.txt"));
		
		//遍历集合
		for(String s:array){
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
	}

}
