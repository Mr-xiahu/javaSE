package xiahu.com.IO_PrintStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 1:���Բ����������͵����ݡ�
 * 		print()
 * 		println()
 * 2:�����Զ�ˢ��
 * 		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"), true);
 * 		����Ӧ�õ���println()�ķ����ſ���
 * 		���ʱ�򲻽����Զ�ˢ���ˣ���ʵ�������ݵĻ��С�
 * 
 * 		println()
 *		��ʵ�ȼ����ڣ�
 *		bw.write();
 *		bw.newLine();		
 *		bw.flush();
 */
public class PrintWriteDemo2 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter(new FileOutputStream("pw2.txt"),true);
		
		pw.println("hello");
		pw.println("world");
		
		
	}

}
