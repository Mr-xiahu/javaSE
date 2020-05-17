package com.xiahu.F_Socket_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * TCPЭ�鷢�����ݣ�
 * A:�������Ͷ˵�Socket����
 * 		��һ������ɹ�����˵�������Ѿ������ɹ��ˡ�
 * B:��ȡ�������д����
 * C:�ͷ���Դ
 * 
 * ���ӱ��ܾ���TCPЭ��һ��Ҫ�ȿ���������
 * java.net.ConnectException: Connection refused: connect
 */
public class ClinetDemo {
	public static void main(String[] args) throws IOException {
		// A:�������Ͷ˵�Socket����
		Socket socket = new Socket("192.168.25.1", 10011);

		// B:��ȡ�������д����
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("TCP��������".getBytes());
		// C:�ͷ���Դ
		socket.close();

	}

}
