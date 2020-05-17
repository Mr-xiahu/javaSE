package xiahu.com.IO_Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * 
 * ����ļ��ϱ�����Properties���ϣ�
 * public void load(Reader reader):���ļ��е����ݶ�ȡ��������
 * public void store(Writer writer,String comments):�Ѽ����е����ݴ洢���ļ�
 * 
 * ��������Ϸ��
 * 		���ȱ���ͼ��ء�
 * 		����ȺӢ��������־���ɽ�������...
 * 
 * 		����=1
 * 		���컭�=1
 */
public class PropertiesDemo3 {
	public static void main(String[] args) throws IOException {
		myStore();

		myLoad();
	}

	private static void myStore() throws IOException {
		Properties prop=new Properties();
		
		prop.setProperty("����", "40");
		prop.setProperty("����", "45");
		prop.setProperty("����", "10");
		
		//public void store(Writer writer,String comments):�Ѽ����е����ݴ洢���ļ�
		Writer w=new FileWriter("b.txt");
		
		prop.store(w, "hello");
		
		w.close();
		
	}

	private static void myLoad() throws IOException {
		Properties prop = new Properties();
		// public void load(Reader reader):���ļ��е����ݶ�ȡ��������
		// ע�⣺����ļ������ݱ����Ǽ�ֵ����ʽ
		Reader r = new FileReader("a.txt");
		prop.load(r);
		r.close();
		
		System.out.println(prop);

	}

}
