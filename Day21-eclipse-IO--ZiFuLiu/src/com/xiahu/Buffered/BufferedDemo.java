package com.xiahu.Buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ������������ⷽ����
 * BufferedWriter:
 * 		public void newLine():����ϵͳ���������з�
 * BufferedReader:
 * 		public String readLine()��һ�ζ�ȡһ������
 * 		�����������ݵ��ַ������������κ�����ֹ��������ѵ�����ĩβ���򷵻� null
 */
public class BufferedDemo {
	public static void main(String[] args) throws IOException {
		write();
		read();
		
		

	}

	public static void read() throws IOException {
		//�����ַ�����������
		BufferedReader br=new BufferedReader(new FileReader("a.txt"));
		//��ȡ����
		//public String readLine()��һ�ζ�ȡһ������
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		
	}

	public static void write() throws IOException {
		// �����ַ����������
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));

		// д������
		for (int x = 0; x < 10; x++) {
			bw.write("hello"+x);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
	}

}
