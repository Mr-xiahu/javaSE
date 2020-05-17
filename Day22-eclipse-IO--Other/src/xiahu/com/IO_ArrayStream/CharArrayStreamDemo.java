package xiahu.com.IO_ArrayStream;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

/*
 * 字符数组：
 * 		CharArrayReader
 * 		CharArrayWriter
 */
public class CharArrayStreamDemo {
	public static void main(String[] args) throws IOException {
		//写数据
		CharArrayWriter caw=new CharArrayWriter();
//		char[] chs={'我','爱','你'};
		caw.write("我爱你");
		
		char[] chs=caw.toCharArray();
		
		//读数据
		CharArrayReader car=new CharArrayReader(chs);
		
		char[] chss=new char[1024];
		int len=0;
		while((len=car.read(chss))!=-1){
			System.out.println(new String(chss, 0, len));
		}
	}
}
