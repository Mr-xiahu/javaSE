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
