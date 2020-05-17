package com.xiahu.M_Socket_TCP;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 上传图片
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// 创建服务器套接字
		ServerSocket ss = new ServerSocket(12345);

		// 监听
		Socket s = ss.accept();

		// 接收通道数据
		BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
		byte[] bys = new byte[1024];
		int len = 0;

		// 写入数据
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("copy.jpg"));

		while ((len = bis.read()) != -1) {
			bos.write(bys, 0, len);
			bos.flush();
		}

		// 给出反馈
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));
		bw.write("图片成功上传");
		bw.flush();

		//释放资源
		bw.close();
		s.close();

	}

}
