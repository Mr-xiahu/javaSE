package com.xiahu.Reflect_C;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 * ͨ�������ȡ��Ա������ʹ��
 */
public class RelfectDemo {
	public static void main(String[] args) throws Exception {
		// ��ȡ�ֽ������
		Class c = Class.forName("com.xiahu.Reflect_A.Person");

		// ��ȡ���г�Ա����
		// public Field[] getFields() ��ȡ�����ĳ�Ա����
		Field[] fields = c.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		System.out.println("-------------------");
		// public Field[] getDeclaredFields() ��ȡ���г�Ա����
		Field[] f = c.getDeclaredFields();
		for (Field field : f) {
			System.out.println(field);
		}
		System.out.println("-------------------");

		/*
		 * Person p = new Person(); p.address = "����"; System.out.println(p);
		 */

		// ͨ���޲ι��췽����������
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();

		// ��ȡ�����ĳ�Ա����
		// ��ȡname���������丳ֵ
		// public Field getField(String name)

		// NoSuchFieldException

		Field fieldName = c.getDeclaredField("name");
		// public void set(Object obj,Object value) ��ָ����������ϴ� Field
		// �����ʾ���ֶ�����Ϊָ������ֵ
		// IllegalAccessException
		fieldName.setAccessible(true);
		fieldName.set(obj, "�Ļ�");
		System.out.println(obj);

		// ��ȡage���󲢶��丳ֵ
		Field fieldAge = c.getDeclaredField("age");
		fieldAge.setAccessible(true);
		fieldAge.set(obj, 20);
		System.out.println(obj);

		// ��ȡaddress���������丳ֵ
		Field fieldAddress = c.getDeclaredField("address");
		fieldAddress.setAccessible(true);
		fieldAddress.set(obj, "����ʡТ����");
		System.out.println(obj);
	}
}
