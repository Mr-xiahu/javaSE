package com.xiahu.H_Socket_TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// �����������׽���
		ServerSocket ss = new ServerSocket(8888);

		// �����ͻ�������
		Socket s = ss.accept();

		// ��װͨ�����ݵ���
		BufferedReader br = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		// br.close();
		s.close();

	}
}
