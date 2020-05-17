package com.xiahu.F_Socket_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCPЭ��������ݣ�
 * A:�������ն˵�Socket����
 * B:�����ͻ������ӡ�����һ����Ӧ��Socket����
 * C:��ȡ����������ȡ������ʾ�ڿ���̨
 * D:�ͷ���Դ
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// A:�������ն˵�Socket����
		ServerSocket ss = new ServerSocket(10011);
		// B:�����ͻ������ӡ�����һ����Ӧ��Socket����
		Socket s = ss.accept(); // ���������ܵ����׽��ֵ����ӡ��˷��������Ӵ���֮ǰһֱ������
		// C:��ȡ����������ȡ������ʾ�ڿ���̨
		InputStream inputStream = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = inputStream.read(bys);
		String str = new String(bys, 0, len);
		String ip = s.getInetAddress().getHostAddress();

		System.out.println(ip + "---" + str);

		// �ͷ���Դ
		s.close();
	}

}
