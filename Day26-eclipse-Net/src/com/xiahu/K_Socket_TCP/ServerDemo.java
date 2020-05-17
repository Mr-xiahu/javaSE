package com.xiahu.K_Socket_TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
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
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		s.close();

	}

}
