package com.xiahu.IO_BufferOutputStream;

import java.io.BufferedOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ͨ����������ķ�ʽȷʵ����ǰһ�ζ�ȡһ���ֽڵķ�ʽ��ܶ࣬���ԣ�������һ�����������Ƿǳ��õġ�
 * ��Ȼ�������Ļ�����ô��java��ʼ����Ƶ�ʱ����Ҳ���ǵ���������⣬��ר���ṩ�˴����������ֽ��ࡣ
 * �����౻��Ϊ����������(��Ч��)
 * д���ݣ�BufferedOutputStream
 * �����ݣ�BufferedInputStream
 * 
 * ���췽������ָ���������Ĵ�С����������һ���ò��ϣ���ΪĬ�ϻ�������С���㹻�ˡ�
 * 
 * Ϊʲô������һ��������ļ������ļ�·�������Ǵ���һ��OutputStream������?
 * ԭ��ܼ򵥣��ֽڻ������������ṩ��������Ϊ��Ч����Ƶġ������أ������Ķ�д�������ÿ�������������ʵ�֡�
 */
public class BufferOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("b.txt"));

		// д������
		bos.write("hello".getBytes());

		bos.close();
	}

}
