package xiahu.com.IO_Properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
 * Properties:���Լ����ࡣ��һ�����Ժ�IO������ʹ�õļ����ࡣ
 * Properties �ɱ��������л�����м��ء������б���ÿ���������Ӧֵ����һ���ַ����� 
 * 
 * ��Hashtable�����࣬˵����һ��Map���ϡ�
 */
public class PropertiesDemo {
	public static void main(String[] args) {
		// ��ΪMap���ϵ�ʹ��
		// ���������÷��Ǵ���ģ�һ��Ҫ��API�����û��<>����˵�����಻��һ��������,��ʹ�õ�ʱ��Ͳ��ܼӷ���
		// Properties<String, String> prop = new Properties<String, String>();
		Properties prop=new Properties();
		
		prop.put("0001", "�����");
		prop.put("0003", "������");
		prop.put("0002", "���ϵ�");
		
		//����
		Set<Map.Entry<Object, Object>> set=prop.entrySet();
		for(Map.Entry<Object, Object> me:set){
			System.out.println(me.getKey()+"---"+me.getValue());
		}
	}

}
