package com.xiahu.G_Socket_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// �����ӿ�
		ServerSocket ss = new ServerSocket(9999);

		// ��������
		// �����ͻ������ӡ�����һ����Ӧ��Socket����
		Socket s = ss.accept();

		// ��ȡ������
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String str = new String(bys, 0, len);
		System.out.println("Server:"+str);

		// ��ȡ������
		OutputStream os = s.getOutputStream();
		os.write("�������յ�".getBytes());

		// �ͷ���Դ
		s.close();
	}

}
