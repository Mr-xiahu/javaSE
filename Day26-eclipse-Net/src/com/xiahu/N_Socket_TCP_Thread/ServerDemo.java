package com.xiahu.N_Socket_TCP_Thread;

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

		while (true) {
			Socket s = ss.accept();
			// UserThread ut=new UserThread(s);
			// Thread t=new Thread(ut);
			// t.start();
			new Thread(new UserThread(s)).start();
		}

	}

}
