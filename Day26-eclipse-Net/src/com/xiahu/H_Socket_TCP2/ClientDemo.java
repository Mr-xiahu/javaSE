package com.xiahu.H_Socket_TCP2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * �ͻ��˼���¼��,����������ڿ���̨
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// �����ͻ����׽���
		Socket socket = new Socket("192.168.145.1", 12355);

		// ����¼���¼�
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// ��װͨ���ڵ�����
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			// д���¼�
			writer.write(line);
			writer.newLine();
			writer.flush();
		}

		writer.close();
		bufferedReader.close();

	}
}
