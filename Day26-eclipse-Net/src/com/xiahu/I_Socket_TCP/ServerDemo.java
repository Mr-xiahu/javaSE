package com.xiahu.I_Socket_TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// �����������׽���
		ServerSocket ss = new ServerSocket(6666);

		// ����
		Socket s = ss.accept();

		// ����������
		BufferedReader br = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		String line = null;

		// ���������ֽ���
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		s.close();

	}

}
