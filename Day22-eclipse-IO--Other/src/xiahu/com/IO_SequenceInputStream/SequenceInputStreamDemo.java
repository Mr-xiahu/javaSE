package xiahu.com.IO_SequenceInputStream;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

/*
 * 
 * 以前的操作：
 * a.txt -- b.txt
 * c.txt -- d.txt
 * 
 * 现在想要：
 * a.txt+b.txt -- c.txt
 * 
 * // SequenceInputStream(InputStream s1, InputStream s2)
 // 需求：把RandomAccessFile.java和PrintWriteDemo.java的内容复制到Copy.java中
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		InputStream is1 = new FileInputStream("RandomAccessFileDemo.java");
		InputStream is2 = new FileInputStream("PrintWriteDemo.java");
		// 封装数据源
		SequenceInputStream sis = new SequenceInputStream(is1, is2);
		// 封装目的地
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("Copy2.java"));

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
