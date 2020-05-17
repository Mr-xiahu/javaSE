package xiahu.com.IO_PrintStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 
 * ����DataStreamDemo.java���Ƶ�Copy.java��
 * ����Դ��
 * 		DataStreamDemo.java -- ��ȡ���� -- FileReader -- BufferedReader
 * Ŀ�ĵأ�
 * 		Copy.java -- д������ -- FileWriter -- BufferedWriter -- PrintWriter
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader(
				"PrintWriteDemo.java"));

		// ��װĿ�ĵ�
		PrintWriter pw = new PrintWriter(new FileWriter("copy.java"),true);
		
		//��������
	    String line=null;
	    while((line=br.readLine())!=null){
	    	pw.println(line);
	    }
	    
	    pw.close();
	    br.close();
	}

}
package xiahu.com.IO_PrintStream;

import java.io.IOException;
import java.io.PrintWriter;

/*
 * 
 * ��ӡ��
 * �ֽ�����ӡ��	PrintStream
 * �ַ���ӡ��	PrintWriter
 * 
 * ��ӡ�����ص㣺
 * 		A:ֻ��д���ݵģ�û�ж�ȡ���ݡ�ֻ�ܲ���Ŀ�ĵأ����ܲ�������Դ��
 * 		B:���Բ����������͵����ݡ�
 * 		C:����������Զ�ˢ�£��ܹ��Զ�ˢ�¡�
 * 		D:�����ǿ���ֱ�Ӳ����ı��ļ��ġ�
 * 			��Щ�������ǿ���ֱ�Ӳ����ı��ļ�����?
 * 			FileInputStream
 * 			FileOutputStream
 * 			FileReader
 * 			FileWriter
 * 			PrintStream
 * 			PrintWriter
 * 			��API,��������Ĺ��췽�������ͬʱ��File���ͺ�String���͵Ĳ�����һ����˵���ǿ���ֱ�Ӳ����ļ��ġ�
 * 
 * 			����
 * 				�������������ܹ�ֱ�Ӷ�д�ļ���
 * 				�߼������ڻ������������ṩ��һЩ�����Ĺ���
 */
public class PrintWriteDemo {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("pw.txt");
		
		pw.write("hello");
		pw.write("world");
		
		pw.close();
	}

}
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
