package com.xiahu.N_Socket_TCP_Thread;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UserThread implements Runnable {
	private Socket s;

	public UserThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {

			// ����ͨ������
			BufferedInputStream bis = new BufferedInputStream(
					s.getInputStream());
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

			// �ͷ���Դ
			bw.close();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
