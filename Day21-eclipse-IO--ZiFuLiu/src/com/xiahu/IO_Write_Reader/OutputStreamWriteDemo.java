package com.xiahu.IO_Write_Reader;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 转换流
 * OutputStreamWriter(OutputStream out):根据默认编码把字节流的数据转换为字符流
 * OutputStreamWriter(OutputStream out,String charsetName):根据指定编码把字节流数据转换为字符流
 * 把字节流转换为字符流。
 * 字符流 = 字节流 +编码表。
 */
public class OutputStreamWriteDemo {
	public static void main(String[] args) throws IOException {
		// OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
		// "a.txt"));// 默认是GBK编码
//		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("a.txt"),"UTF-8");//指定UTF-8
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("a.txt"),"GBK");//指定GBK
		
		//写入数据
		osw.write("我爱你");
		
		//释放资源
		osw.close();
	}

}
