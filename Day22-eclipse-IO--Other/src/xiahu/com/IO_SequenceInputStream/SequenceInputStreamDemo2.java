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
 *  以前的操作：
 * a.txt -- b.txt
 * c.txt -- d.txt
 * e.txt -- f.txt
 * 
 * 现在想要：
 * a.txt+b.txt+c.txt -- d.txt
 * 
 * // 需求：把下面的三个文件的内容复制到Copy.java中
 * CopyFileDemo.java   PrintWriteDemo.java    RandomAccessFileDemo.java
 */
public class SequenceInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		// SequenceInputStream(Enumeration e)
		// 通过简单的回顾我们知道了Enumeration是Vector中的一个方法的返回值类型。
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
		// 封装目的地
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("Copy3.java"));

		// 复制数据
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = sis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		sis.close();

	}

}
