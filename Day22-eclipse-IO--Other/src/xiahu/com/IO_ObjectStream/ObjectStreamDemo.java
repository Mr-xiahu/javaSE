package xiahu.com.IO_ObjectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 
 * ���л������Ѷ�������һ���ķ�ʽ�����ı��ļ������������д��䡣���� -- ������(ObjectOutputStream)
 * �����л���:���ı��ļ��е����������ݻ��������е����������ݻ�ԭ�ɶ��������� -- ����(ObjectInputStream)
 */
public class ObjectStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// // ��������Ҫ�Զ���������л��������������Զ���һ����Persion
		// ���л�������ʵ���ǰѶ���д���ı��ļ�
		// write();

		//
		read();
	}

	private static void read() throws  IOException, ClassNotFoundException {
		// ���������л�����
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"oox.txt"));
		Object obj=ois.readObject();
		
		ois.close();
		
		System.out.println(obj);

	}

	@SuppressWarnings("unused")
	private static void write() throws IOException {
		// �������л�����
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"oox.txt"));

		// ʵ�������л�����
		Persion p = new Persion("�����", 28);

		// ��Ӷ���
		oos.writeObject(p);

		// �ͷ���Դ
		oos.close();

	}

}
