package xiahu.com.IO_System_In;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 
 */
public class SystemOutDemo {
	public static void main(String[] args) throws IOException {
		// ��ȡ��׼������
		// // PrintStream ps = System.out;
		// // OutputStream os = ps;
		// OutputStream os = System.out; // ��̬
		// // ���ܲ��ܰ��ող�ʹ�ñ�׼�������ķ�ʽһ�����������������̨��?
		// OutputStreamWriter osw = new OutputStreamWriter(os);
		// BufferedWriter bw = new BufferedWriter(osw);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				System.out));

		bw.write("hello");
		bw.newLine();
		// bw.flush();
		bw.write("world");
		bw.newLine();
		// bw.flush();
		bw.write("java");
		bw.newLine();
		bw.flush();

		bw.close();
	}

}
