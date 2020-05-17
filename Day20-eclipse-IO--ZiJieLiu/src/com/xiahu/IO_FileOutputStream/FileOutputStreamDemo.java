package com.xiahu.IO_FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ������Ҫ��һ���ı��ļ�������һ�仰��"hello,io"
 * 
 * ������
 * 		A:�����������ǲ����ַ��������������أ��ַ��������ֽ���֮��ų��ֵģ����ԣ��������Ƚ����ֽ�����β�����
 * 		B:��������Ҫ���ļ���дһ�仰����������Ҫ�����ֽ��������
 * 
 * ͨ������ķ���������֪��Ҫʹ�ã�OutputStream
 * ����ͨ���鿴API�����Ƿ��ָ���������һ�������࣬����ʵ������
 * ���ԣ�����Ҫ��һ����������ࡣ
 * ������Ҫ�ҵ�������ʲô���ֵ���?���ʱ�򣬺ܼ򵥣����ǻ���һ�£������ǲ���Ҫ���ļ���д������
 * �ļ����ĸ����ʣ�File
 * Ȼ���õ����ֽ�����������������ǣ�FileOutputStream
 * ע�⣺ÿ�ֻ�������඼���Ը�������Ϊ��׺����
 * 		XxxOutputStream
 * 		XxxInputStream
 * 		XxxReader
 * 		XxxWriter
 * �鿴FileOutputStream�Ĺ��췽����
 * 		FileOutputStream(File file) 
 *		FileOutputStream(String name)
 *
 * �ֽ�������������裺
 * 		A:�����ֽ����������
 * 		B:д����
 * 		C:�ͷ���Դ
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		// File file=new File("a.txt");
		// file.createNewFile();

		FileOutputStream os = new FileOutputStream("a.txt");

		/*
		 * �����ֽ���������������˼������飺 A:����ϵͳ����ȥ�����ļ� B:����a.txt���� C:��a.txt����ָ������ļ�
		 */
		os.write("���,IO��".getBytes());
		// �ͷ���Դ
		// �رմ��ļ���������ͷ�������йص�����ϵͳ��Դ��
		os.close();
		/*
		 * Ϊʲôһ��Ҫclose()��? A:���������������������Ϳ��Ա����������������� B:֪ͨϵͳȥ�ͷŸ����ļ���ص���Դ
		 */
		// java.io.IOException: Stream Closed
		//os.write("java".getBytes());
	}

}
