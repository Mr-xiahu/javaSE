package com.xiahu.I_Socket_TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * �ͻ��˼���¼��,������д���ı��ļ�
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// �����ͻ����׽���
		Socket s = new Socket("192.168.226.1", 6666);

		// ����¼���¼�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		// ��װ�ܵ��ڵ���
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));

		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// �ͷ���Դ
		s.close();
	}

}
