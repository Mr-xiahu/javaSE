package xiahu.com.IO_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;


/*
 * 
 * �����������
 * 		RandomAccessFile�಻����������Object������ࡣ
 * 		�����ں���InputStream��OutputStream�Ĺ��ܡ�
 * 		֧�ֶ��ļ���������ʶ�ȡ��д�롣
 * 
 * public RandomAccessFile(String name,String mode)����һ���������ļ�·�����ڶ��������ǲ����ļ���ģʽ��
 * 		ģʽ�����֣�������õ�һ�ֽ�"rw",���ַ�ʽ��ʾ�Ҽȿ���д���ݣ�Ҳ���Զ�ȡ���� 
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws Exception {
		// д����
		write();

		// ��ȡ����
		read();
	}

	private static void read() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		// ��ȡ
		int i = raf.readInt();
		System.out.println(i);
		// // ���ļ�ָ�����ͨ�� getFilePointer������ȡ����ͨ�� seek �������á�
		System.out.println("��ǰ�ļ�ָ��λ��Ϊ:" + raf.getFilePointer());

		char ch = raf.readChar();
		System.out.println(ch);
		System.out.println("��ǰ�ļ�ָ��λ��Ϊ:" + raf.getFilePointer());

		System.out.println(raf.readUTF());
		System.out.println("��ǰ�ļ�ָ��λ��Ϊ:" + raf.getFilePointer());
		
		// �Ҳ�����ͷ��ʼ�ˣ��Ҿ�Ҫ��ȡa����ô����?
		raf.seek(4);
		ch=raf.readChar();
		System.out.println(ch);
		

	}

	private static void write() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		// д������
		raf.writeInt(100);
		raf.writeChar('a');
		raf.writeUTF("�Ұ���");

		raf.close();

	}

}
