package com.xiahu.Reflect_Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * 
 * ͨ�������ļ��������еķ���
 * 
 * ���䣺
 * 		��Ҫ�������ļ����ʹ�á�
 * 		��class.txt���档
 * 		������֪������������
 * 			className
 * 			methodName
 */
public class TestDemo {
	public static void main(String[] args) throws Exception {
		// ����ǰ������
		// Student s = new Student();
		// s.love();
		// Teacher t = new Teacher();
		// t.love();
		// Worker w = new Worker();
		// w.love();

		// ����������
		// ���ؼ�ֵ������
		Properties prop = new Properties();
		FileReader fr = new FileReader("Class.txt");
		prop.load(fr);
		fr.close();

		// ��ȡ����
		String className = prop.getProperty("className");
		String methodName = prop.getProperty("methodName");

		// ����
		Class c = Class.forName(className);

		// ��ȡ���췽��
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();

		// ��ȡ�䷽��������
		Method m = c.getDeclaredMethod(methodName);
		m.setAccessible(true);
		m.invoke(obj);

	}

}
