package xiahu.com.IO_ArrayStream;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

/*
 * �ַ����飺
 * 		CharArrayReader
 * 		CharArrayWriter
 */
public class CharArrayStreamDemo {
	public static void main(String[] args) throws IOException {
		//д����
		CharArrayWriter caw=new CharArrayWriter();
//		char[] chs={'��','��','��'};
		caw.write("�Ұ���");
		
		char[] chs=caw.toCharArray();
		
		//������
		CharArrayReader car=new CharArrayReader(chs);
		
		char[] chss=new char[1024];
		int len=0;
		while((len=car.read(chss))!=-1){
			System.out.println(new String(chss, 0, len));
		}
	}
}
