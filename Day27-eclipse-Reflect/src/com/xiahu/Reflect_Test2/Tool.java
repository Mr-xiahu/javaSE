package com.xiahu.Reflect_Test2;

import java.lang.reflect.Field;

public class Tool {
	public void setProperty(Object obj, String propertyName, Object value)
			throws Exception {
		// ���ݶ����ȡ�ֽ������
		Class c = obj.getClass();

		// ��ȡ�ö����propertyName��Ա����
		Field field = c.getDeclaredField(propertyName);
		// ȡ�����ʼ��
		field.setAccessible(true);
		// ������ĳ�Ա������ֵΪָ����ֵ
		field.set(obj, value);
	}

}
