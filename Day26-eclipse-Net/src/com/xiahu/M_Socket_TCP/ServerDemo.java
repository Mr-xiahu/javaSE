package com.xiahu.M_Socket_TCP;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * �ϴ�ͼƬ
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// �����������׽���
		ServerSocket ss = new ServerSocket(12345);

		// ����
		Socket s = ss.accept();

		// ����ͨ������
		BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
		byte[] bys = new byte[1024];
		int len = 0;

		// д������
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("copy.jpg"));

		while ((len = bis.read()) != -1) {
			bos.write(bys, 0, len);
			bos.flush();
		}

		// ��������
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));
		bw.write("ͼƬ�ɹ��ϴ�");
		bw.flush();

		//�ͷ���Դ
		bw.close();
		s.close();

	}

}
