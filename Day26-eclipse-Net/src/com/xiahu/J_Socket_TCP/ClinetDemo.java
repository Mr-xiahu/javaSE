package com.xiahu.J_Socket_TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * �ͻ��˶�ȡ�ı��ļ�,��������ʾ�ڿ���̨
 */
public class ClinetDemo {
	public static void main(String[] args) throws IOException {
		// �����ͻ����׽���
		Socket s = new Socket("192.168.226.1", 6666);

		// ��ȡ�ı��ļ�
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));

		// ���������
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