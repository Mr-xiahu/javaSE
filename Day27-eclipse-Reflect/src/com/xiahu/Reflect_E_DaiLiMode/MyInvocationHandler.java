package com.xiahu.Reflect_E_DaiLiMode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	private Object target;// 对象目标

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("目标检验");
		Object result = method.invoke(target, args);
		System.out.println("日志记录");

		return result;// 返回的是代理对象
	}

}
