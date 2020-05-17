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
		// �������������׽���
		ServerSocket ss = new ServerSocket(6666);

		// ����
		Socket s = ss.accept();

		// ��ȡͨ��������
		BufferedReader br = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		String line = null;

		// д���ļ��ļ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		s.close();

	}

}
