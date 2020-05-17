package com.xiahu.L_Socket_TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * �ͻ��˶�ȡ�ļ�,��������д���ļ�
 * 
 * ��������������˼·���뷴����Ϣ�����ȴû��Ӧ��Ϊʲô��?
 * ��ȡ�ı��ļ��ǿ�����null��Ϊ������Ϣ�ģ������أ�ͨ�����ǲ�������������Ϣ�ġ�
 * ���ԣ������������Ͳ�֪��������ˡ����㻹����������㷴�������ԣ����໥�ȴ��ˡ�
 * 
 * ��ν����?
 * A:�ڶ�дһ�����ݣ����߷���������ȡ����������˵���Ҿͽ�������Ҳ�����ɡ�
 * 		���������Խ�����⣬���ǲ��á�
 * B:Socket�����ṩ��һ�ֽ������
 * 		public void shutdownOutput()
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// �����ͻ����׽���
		Socket s = new Socket("192.168.226.1", 6666);

		// ��ȡ�ļ�
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));

		// ͨ����д���ļ�
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// �Զ���һ���������
		// bw.write("over");
		// bw.newLine();
		// bw.flush();

		// Socket�ṩ��һ����ֹ������֪ͨ�����������ˣ���û�����ݹ�����
		s.shutdownOutput();

		// ���շ������˵ķ���
		BufferedReader br2 = new BufferedReader(new InputStreamReader(
				s.getInputStream()));

		String message = br2.readLine();
		System.out.println(message);

		s.close();
	}

}
