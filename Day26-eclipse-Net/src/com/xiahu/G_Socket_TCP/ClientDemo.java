package com.xiahu.G_Socket_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// �����ӿ�
		Socket s = new Socket("192.168.226.1", 9999);

		// ���������
		OutputStream os = s.getOutputStream();
		os.write("��Է���û��ѽ".getBytes());

		// ����������
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String str = new String(bys, 0, len);
		System.out.println("Client:" + str);

		// �ͷ���Դ
		s.close();
	}

}
