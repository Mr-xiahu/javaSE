package xiahu.com.IO_SequenceInputStream;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 *  ��ǰ�Ĳ�����
 * a.txt -- b.txt
 * c.txt -- d.txt
 * e.txt -- f.txt
 * 
 * ������Ҫ��
 * a.txt+b.txt+c.txt -- d.txt
 * 
 * // ���󣺰�����������ļ������ݸ��Ƶ�Copy.java��
 * CopyFileDemo.java   PrintWriteDemo.java    RandomAccessFileDemo.java
 */
public class SequenceInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		// SequenceInputStream(Enumeration e)
		// ͨ���򵥵Ļع�����֪����Enumeration��Vector�е�һ�������ķ���ֵ���͡�
		// Enumeration<E> elements()
		Vector<InputStream> v = new Vector<InputStream>();
		//
		InputStream s1 = new FileInputStream("CopyFileDemo.java");
		InputStream s2 = new FileInputStream("PrintWriteDemo.java");
		InputStream s3 = new FileInputStream("RandomAccessFileDemo.java");
		//
		v.add(s1);
		v.add(s2);
		v.add(s3);
		//
		Enumeration<InputStream> en = v.elements();
		
		SequenceInputStream sis = new SequenceInputStream(en);
		// ��װĿ�ĵ�
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("Copy3.java"));

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
