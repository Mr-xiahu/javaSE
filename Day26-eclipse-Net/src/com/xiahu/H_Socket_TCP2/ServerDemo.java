package com.xiahu.H_Socket_TCP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// �����������׽���
		ServerSocket serverSocket = new ServerSocket(12355);

		// �����ͻ�������
		Socket socket = serverSocket.accept();
		System.out.println("�ͻ����Ѿ�����");

		// ��װͨ�������
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}

	}
}
