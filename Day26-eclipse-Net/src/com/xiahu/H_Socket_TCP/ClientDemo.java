package com.xiahu.H_Socket_TCP;

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
		Socket s = new Socket("192.168.226.1", 8888);

		// ����̨¼������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ��ͨ���ڵ��ֽ������ַ�����װһ��
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();

		}

		// �ͷ���Դ
		s.close();

	}
}
