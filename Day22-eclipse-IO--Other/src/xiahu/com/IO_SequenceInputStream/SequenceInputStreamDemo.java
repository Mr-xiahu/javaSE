package xiahu.com.IO_SequenceInputStream;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

/*
 * 
 * ��ǰ�Ĳ�����
 * a.txt -- b.txt
 * c.txt -- d.txt
 * 
 * ������Ҫ��
 * a.txt+b.txt -- c.txt
 * 
 * // SequenceInputStream(InputStream s1, InputStream s2)
 // ���󣺰�RandomAccessFile.java��PrintWriteDemo.java�����ݸ��Ƶ�Copy.java��
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		InputStream is1 = new FileInputStream("RandomAccessFileDemo.java");
		InputStream is2 = new FileInputStream("PrintWriteDemo.java");
		// ��װ����Դ
		SequenceInputStream sis = new SequenceInputStream(is1, is2);
		// ��װĿ�ĵ�
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("Copy2.java"));

		// ��������
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = sis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		sis.close();
	}

}
