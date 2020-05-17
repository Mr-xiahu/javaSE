package xiahu.com.IO_Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 * 
 * ����һ���ı��ļ�(user.txt)����֪�������Ǽ�ֵ����ʽ�ģ����ǲ�֪��������ʲô��
 * ��дһ�������ж��Ƿ��С�lisi�������ļ����ڣ�����о͸ı���ʵΪ��100��
 * 
 * ������
 * 		A:���ļ��е����ݼ��ص�������
 * 		B:�������ϣ���ȡ�õ�ÿһ����
 * 		C:�жϼ��Ƿ���Ϊ"lisi"�ģ�����о��޸���ֵΪ"100"
 * 		D:�Ѽ����е��������´洢���ļ���
 */
public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		// ��������
		Properties prop = new Properties();

		// ���ļ��е����ݼ��ص�������
		Reader r = new FileReader("user.txt");
		prop.load(r);
		r.close();

		// �������ϣ���ȡ�õ�ÿһ����
		Set<String> set = prop.stringPropertyNames();
		for (String key : set) {

			if (key.equals("lisi")) {
				prop.setProperty(key, "100");
				break;
			}
		}

		// �Ѽ����е��������´洢���ļ���
		Writer w = new FileWriter("user.txt");
		prop.store(w, "hello");
		w.close();
	}

}
