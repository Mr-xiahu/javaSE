package xiahu.com.IO_Properties;

import java.util.Properties;
import java.util.Set;

/*
 * ���⹦�ܣ�
 * public Object setProperty(String key,String value)�����Ԫ��
 * public String getProperty(String key):��ȡԪ��
 * public Set<String> stringPropertyNames():��ȡ���еļ��ļ���
 */
public class PropertiesDemo2 {
	public static void main(String[] args) {
		//�������϶���
		Properties prop=new Properties();
		
		//public Object setProperty(String key,String value)�����Ԫ��
		prop.setProperty("�����", "30");
		prop.setProperty("������", "40");
		prop.setProperty("������", "20");
		
		
		//public Set<String> stringPropertyNames():��ȡ���еļ��ļ���
		Set<String> set=prop.stringPropertyNames();
		for(String s:set){
			String value=prop.getProperty(s);
			System.out.println(s+"---"+value);
			
		}
		
	}

}
