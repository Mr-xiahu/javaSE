package xiahu.com.IO_PrintStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 
 * 需求：DataStreamDemo.java复制到Copy.java中
 * 数据源：
 * 		DataStreamDemo.java -- 读取数据 -- FileReader -- BufferedReader
 * 目的地：
 * 		Copy.java -- 写出数据 -- FileWriter -- BufferedWriter -- PrintWriter
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		BufferedReader br = new BufferedReader(new FileReader(
				"PrintWriteDemo.java"));

		// 封装目的地
		PrintWriter pw = new PrintWriter(new FileWriter("copy.java"),true);
		
		//复制数据
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
 * 打印流
 * 字节流打印流	PrintStream
 * 字符打印流	PrintWriter
 * 
 * 打印流的特点：
 * 		A:只有写数据的，没有读取数据。只能操作目的地，不能操作数据源。
 * 		B:可以操作任意类型的数据。
 * 		C:如果启动了自动刷新，能够自动刷新。
 * 		D:该流是可以直接操作文本文件的。
 * 			哪些流对象是可以直接操作文本文件的呢?
 * 			FileInputStream
 * 			FileOutputStream
 * 			FileReader
 * 			FileWriter
 * 			PrintStream
 * 			PrintWriter
 * 			看API,查流对象的构造方法，如果同时有File类型和String类型的参数，一般来说就是可以直接操作文件的。
 * 
 * 			流：
 * 				基本流：就是能够直接读写文件的
 * 				高级流：在基本流基础上提供了一些其他的功能
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
 * 随机访问流：
 * 		RandomAccessFile类不属于流，是Object类的子类。
 * 		但它融合了InputStream和OutputStream的功能。
 * 		支持对文件的随机访问读取和写入。
 * 
 * public RandomAccessFile(String name,String mode)：第一个参数是文件路径，第二个参数是操作文件的模式。
 * 		模式有四种，我们最常用的一种叫"rw",这种方式表示我既可以写数据，也可以读取数据 
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws Exception {
		// 写数据
		write();

		// 读取数据
		read();
	}

	private static void read() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		// 读取
		int i = raf.readInt();
		System.out.println(i);
		// // 该文件指针可以通过 getFilePointer方法读取，并通过 seek 方法设置。
		System.out.println("当前文件指针位置为:" + raf.getFilePointer());

		char ch = raf.readChar();
		System.out.println(ch);
		System.out.println("当前文件指针位置为:" + raf.getFilePointer());

		System.out.println(raf.readUTF());
		System.out.println("当前文件指针位置为:" + raf.getFilePointer());
		
		// 我不想重头开始了，我就要读取a，怎么办呢?
		raf.seek(4);
		ch=raf.readChar();
		System.out.println(ch);
		

	}

	private static void write() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		// 写入数据
		raf.writeInt(100);
		raf.writeChar('a');
		raf.writeUTF("我爱你");

		raf.close();

	}

}
