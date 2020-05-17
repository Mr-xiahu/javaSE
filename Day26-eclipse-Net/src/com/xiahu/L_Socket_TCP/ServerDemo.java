package com.xiahu.L_Socket_TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// 创建服务器端套接字
		ServerSocket ss = new ServerSocket(6666);

		// 监听
		Socket s = ss.accept();

		// 读取通道内数据
		BufferedReader br = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		String line = null;

		// 写入文件文件
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		while ((line = br.readLine()) != null) {
			// if ("over".equals(line)) {
			// break;
			// }
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// 当文件传输完成时给出反馈
		BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));
		bw2.write("文件成功上传!");
		bw2.newLine();
		bw2.flush();

		bw2.close();
		s.close();

	}

}
