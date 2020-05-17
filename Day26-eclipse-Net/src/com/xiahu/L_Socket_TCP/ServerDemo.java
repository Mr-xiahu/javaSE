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
			// if ("over".equals(line)) {
			// break;
			// }
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// ���ļ��������ʱ��������
		BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));
		bw2.write("�ļ��ɹ��ϴ�!");
		bw2.newLine();
		bw2.flush();

		bw2.close();
		s.close();

	}

}
