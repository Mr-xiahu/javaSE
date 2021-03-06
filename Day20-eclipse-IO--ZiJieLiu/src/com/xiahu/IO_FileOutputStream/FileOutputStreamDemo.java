package com.xiahu.IO_FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：我要往一个文本文件中输入一句话："hello,io"
 * 
 * 分析：
 * 		A:这个操作最好是采用字符流来做，但是呢，字符流是在字节流之后才出现的，所以，今天我先讲解字节流如何操作。
 * 		B:由于我是要往文件中写一句话，所以我们要采用字节输出流。
 * 
 * 通过上面的分析后我们知道要使用：OutputStream
 * 但是通过查看API，我们发现该流对象是一个抽象类，不能实例化。
 * 所以，我们要找一个具体的子类。
 * 而我们要找的子类是什么名字的呢?这个时候，很简单，我们回想一下，我们是不是要往文件中写东西。
 * 文件是哪个单词：File
 * 然后用的是字节输出流，联起来就是：FileOutputStream
 * 注意：每种基类的子类都是以父类名作为后缀名。
 * 		XxxOutputStream
 * 		XxxInputStream
 * 		XxxReader
 * 		XxxWriter
 * 查看FileOutputStream的构造方法：
 * 		FileOutputStream(File file) 
 *		FileOutputStream(String name)
 *
 * 字节输出流操作步骤：
 * 		A:创建字节输出流对象
 * 		B:写数据
 * 		C:释放资源
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		// File file=new File("a.txt");
		// file.createNewFile();

		FileOutputStream os = new FileOutputStream("a.txt");

		/*
		 * 创建字节输出流对象了做了几件事情： A:调用系统功能去创建文件 B:创建a.txt对象 C:把a.txt对象指向这个文件
		 */
		os.write("你好,IO流".getBytes());
		// 释放资源
		// 关闭此文件输出流并释放与此流有关的所有系统资源。
		os.close();
		/*
		 * 为什么一定要close()呢? A:让流对象变成垃圾，这样就可以被垃圾回收器回收了 B:通知系统去释放跟该文件相关的资源
		 */
		// java.io.IOException: Stream Closed
		//os.write("java".getBytes());
	}

}
