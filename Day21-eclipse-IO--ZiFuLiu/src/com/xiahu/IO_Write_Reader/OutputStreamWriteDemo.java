package com.xiahu.IO_Write_Reader;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * ת����
 * OutputStreamWriter(OutputStream out):����Ĭ�ϱ�����ֽ���������ת��Ϊ�ַ���
 * OutputStreamWriter(OutputStream out,String charsetName):����ָ��������ֽ�������ת��Ϊ�ַ���
 * ���ֽ���ת��Ϊ�ַ�����
 * �ַ��� = �ֽ��� +�����
 */
public class OutputStreamWriteDemo {
	public static void main(String[] args) throws IOException {
		// OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
		// "a.txt"));// Ĭ����GBK����
//		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("a.txt"),"UTF-8");//ָ��UTF-8
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("a.txt"),"GBK");//ָ��GBK
		
		//д������
		osw.write("�Ұ���");
		
		//�ͷ���Դ
		osw.close();
	}

}
