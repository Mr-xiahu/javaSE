package com.xiahunew.reflectC;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 *   ��ȡ��Ա��������ʹ��
 *    Field[] fields = c.getFields(); ��ȡ�����ĳ�Ա����
 *	  Field[] fields = c.getDeclaredFields();��ȡ���г�Ա����
 *    public void set(Object obj,Object value);��ָ����������ϴ� Field �����ʾ���ֶ�����Ϊָ������ֵ��
 */
public class Reflect {
	public static void main(String[] args) throws Exception {
		Class<?> c = Class.forName("com.xiahunew.reflectC.Person");

		// // Field[] fields = c.getFields(); ��ȡ�����ĳ�Ա����
		// Field[] fields = c.getFields();
		// for (Field field : fields) {
		// System.out.println(field);
		// // public java.lang.String com.xiahunew.reflectC.Person.address
		// }
		// System.out.println("-----------");
		//
		// // Field[] fields = c.getDeclaredFields();��ȡ���г�Ա����
		// Field[] declaredFields = c.getDeclaredFields();
		// for (Field field : declaredFields) {
		// System.out.println(field);
		// // private java.lang.String com.xiahunew.reflectC.Person.name
		// // int com.xiahunew.reflectC.Person.age
		// // public java.lang.String com.xiahunew.reflectC.Person.address
		//
		// }

		// ͨ���޲ι��췽����������
		Constructor<?> constructor = c.getConstructor();
		Object object = constructor.newInstance();

		// �����ĳ�Ա����
		// ��ȡaddress�����丳ֵ
		Field address = c.getField("address");

		// public void set(Object obj,Object value)
		// ��ָ����������ϴ� Field �����ʾ���ֶ�����Ϊָ������ֵ��
		address.set(object, "����ʡТ����Т����");
		System.out.println(object);

		// ˽�еĳ�Ա����
		Field name = c.getDeclaredField("name");
		// IllegalAccessException
		name.setAccessible(true);
		name.set(object, "�Ļ�");
		System.out.println(object);

	}

}
