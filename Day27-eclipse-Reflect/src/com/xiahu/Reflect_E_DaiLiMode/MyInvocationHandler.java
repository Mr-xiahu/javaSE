package com.xiahu.Reflect_E_DaiLiMode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	private Object target;// ����Ŀ��

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("Ŀ�����");
		Object result = method.invoke(target, args);
		System.out.println("��־��¼");

		return result;// ���ص��Ǵ������
	}

}
