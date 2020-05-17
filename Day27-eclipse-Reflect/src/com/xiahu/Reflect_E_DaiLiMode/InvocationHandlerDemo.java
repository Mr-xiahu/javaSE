package com.xiahu.Reflect_E_DaiLiMode;

import java.lang.reflect.Proxy;

public class InvocationHandlerDemo {
	public static void main(String[] args) {
		StudentDao sd = new StudentDaoImp();
		sd.add();
		sd.delete();
		sd.update();
		sd.select();
		System.out.println("-----------");

		// 我们要创建一个动态代理对象
		// Proxy类中有一个方法可以创建动态代理对象
		// public static Object newProxyInstance(ClassLoader loader,Class<?>[]
		// interfaces,InvocationHandler h)
		// 我准备对ud对象做一个代理对象
		MyInvocationHandler handler = new MyInvocationHandler(sd);
		StudentDao dao = (StudentDao) Proxy.newProxyInstance(sd.getClass().getClassLoader(),
				sd.getClass().getInterfaces(), handler);

		dao.add();
		dao.delete();
		dao.update();
		dao.select();
		System.out.println("---------------");

		TeacherDao td = new TeacherDaoImpl();
		td.Login();
		td.Regix();
		System.out.println("---------------");

		MyInvocationHandler handler2 = new MyInvocationHandler(td);
		TeacherDao teacher = (TeacherDao) Proxy.newProxyInstance(td.getClass().getClassLoader(),
				td.getClass().getInterfaces(), handler2);
		teacher.Login();
		teacher.Regix();
		System.out.println("---------------");
	}

}
