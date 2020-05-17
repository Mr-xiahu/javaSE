package com.xiahu.OutputStreamWrite;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter的方法：
 * public void write(int c):写一个字符
 * public void write(char[] cbuf):写一个字符数组
 * public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
 * public void write(String str):写一个字符串
 * public void write(String str,int off,int len):写一个字符串的一部分
 * 
 * 面试题：close()和flush()的区别?
 * A:close()关闭流对象，但是先刷新一次缓冲区。关闭之后，流对象不可以继续再使用了。
 * B:flush()仅仅刷新缓冲区,刷新之后，流对象还可以继续使用。
 */
public class OutputStreamWriteDemo {
	public static void main(String[] args) throws IOException {
		// 创建对象
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"a.txt"));

		// 写入数据
		// public void write(int c):写一个字符
		// osw.write('a');

		// public void write(char[] cbuf):写一个字符数组
		// char[] chs = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };*/
		// osw.write(chs);

		// public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
		// osw.write(chs, 0, 3);

		// public void write(String str):写一个字符串
		// osw.write("我爱你");

		// public void write(String str,int off,int len):写一个字符串的一部分
		String s = "太阳当空照,花儿对我笑";
		osw.write(s, 0, 10);

		// void flush() 
		osw.flush();//刷新缓冲区
		
		//释放资源
		osw.close();
	}

}
