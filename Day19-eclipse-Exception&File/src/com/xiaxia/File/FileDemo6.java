package com.xiaxia.File;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/*
 * File文件对象
 *    File:文件和目录(文件夹)路径名的抽象表示形式
 * 获取功能：
 *   public String getAbsolutePath()：获取绝对路径
 *   public String getPath():获取相对路径
 *   public String getName():获取名称
 *   public long length():获取长度。字节数
 *   public long lastModified():获取最后一次的修改时间，毫秒值
 */
public class FileDemo6 {
	public static void main(String[] args) {
		// File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
		File file = new File("E:/work/upload", "莫脑壳1.gif");
		String absolutePath = file.getAbsolutePath();
		System.out.println("绝对路径:"+absolutePath);
		String path = file.getPath();
		System.out.println("相对路径:"+path);
		String name = file.getName();
		System.out.println("文件名称:"+name);
		long length = file.length();
		System.out.println("长度:"+length);
		long lastModified = file.lastModified();
		SimpleDateFormat simpleDateFormat  = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String format = simpleDateFormat.format(lastModified);
		System.out.println("最后一次修改的时间:"+format);
		


	}

}
