package com.xiahu.J_Socket_TCP;

import java.io.BufferedReader;
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

		//
		BufferedReader br = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		s.close();
		ss.close();
	}

}
