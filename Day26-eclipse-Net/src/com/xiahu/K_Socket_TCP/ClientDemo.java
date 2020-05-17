package com.xiahu.K_Socket_TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * �ͻ��˶�ȡ�ļ�,��������д���ļ�
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// �����ͻ����׽���
		Socket s = new Socket("192.168.226.1", 6666);

		// ��ȡ�ļ�
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));

		// ͨ����д���ļ�
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		s.close();
	}

}
