package com.xiahu.N_Socket_TCP_Thread;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UserThread implements Runnable {
	private Socket s;

	public UserThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {

			// 接收通道数据
			BufferedInputStream bis = new BufferedInputStream(
					s.getInputStream());
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

			// 释放资源
			bw.close();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
