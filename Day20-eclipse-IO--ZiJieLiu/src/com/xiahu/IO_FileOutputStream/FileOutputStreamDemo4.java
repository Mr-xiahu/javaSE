package com.xiahu.IO_FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �����쳣������ֽ����������
 */
public class FileOutputStreamDemo4 {
	public static void main(String[] args) {
		// �ֿ����쳣����
		// FileOutputStream fos = null;
		// try {
		// fos = new FileOutputStream("b.txt");
		// } catch (FileNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// try {
		// fos.write("java".getBytes());
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// try {
		// fos.close();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// һ�����쳣����
		// FileOutputStream fos=null;
		// try {
		// fos = new FileOutputStream("b.txt");
		// fos.write("java".getBytes());
		// fos.close();
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }catch(IOException e){
		// e.printStackTrace();
		// }

		// �Ľ���
		FileOutputStream fos = null;
		try {
			// fos = new FileOutputStream("z:\\fos4.txt");
			fos = new FileOutputStream("b.txt");
			fos.write("java".getBytes());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// ���fos����null������Ҫclose()
			if (fos != null) {
				// Ϊ�˱�֤close()һ����ִ�У��ͷŵ�������
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
