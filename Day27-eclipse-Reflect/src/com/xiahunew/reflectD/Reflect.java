package com.xiahunew.reflectD;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 * 
 *  通过反射获取成员方法并使用。
 *     Method[] methods = c.getMethods(); // 获取自己的包括父亲的公共方法
 *     Method[] methods = c.getDeclaredMethods(); // 获取自己的所有的方法
 */
public class Reflect {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.xiahunew.reflectD.Person");

		// 获取自己的包括父亲的公共方法
		// Method[] methods = c.getMethods();
		// for (Method method : methods) {
		// System.out.println(method);
		// // public java.lang.String com.xiahunew.reflectD.Person.toString()
		// // public java.lang.String
		// // com.xiahunew.reflectD.Person.getString(java.lang.String,int)
		// // public void com.xiahunew.reflectD.Person.method(java.lang.String)
		// // public void com.xiahunew.reflectD.Person.show()
		// // public final void java.lang.Object.wait() throws
		// // java.lang.InterruptedException
		// // public final void java.lang.Object.wait(long,int) throws
		// // java.lang.InterruptedException
		// // public final native void java.lang.Object.wait(long) throws
		// // java.lang.InterruptedException
		// // public boolean java.lang.Object.equals(java.lang.Object)
		// // public native int java.lang.Object.hashCode()
		// // public final native java.lang.Class java.lang.Object.getClass()
		// // public final native void java.lang.Object.notify()
		// // public final native void java.lang.Object.notifyAll()
		// }
		//
		// System.out.println("------------------------------------------");
		//
		// // 获取自己的所有的方法
		// Method[] declaredMethods = c.getDeclaredMethods();
		// for (Method method : declaredMethods) {
		// System.out.println(method);
		// // public java.lang.String com.xiahunew.reflectD.Person.toString()
		// // private void com.xiahunew.reflectD.Person.function()
		// // public java.lang.String
		// // com.xiahunew.reflectD.Person.getString(java.lang.String,int)
		// // public void com.xiahunew.reflectD.Person.method(java.lang.String)
		// // public void com.xiahunew.reflectD.Person.show()
		// }

		// 使用无参构造方法产生对象
		Constructor constructor = c.getConstructor();
		Object object = constructor.newInstance();

		// 获取单个方法并使用
		Method show = c.getMethod("show");
		show.invoke(object);
		System.out.println("----------");

		Method method = c.getMethod("method", String.class);
		method.invoke(object, "hello");
		System.out.println("----------");

		Method getString = c.getMethod("getString", String.class, int.class);
		Object objString = getString.invoke(object, "hello", 100);
		System.out.println(objString);
		System.out.println("----------");

		// 私有成员方法
		Method function = c.getDeclaredMethod("function");
		function.setAccessible(true);
		function.invoke(object);
	}

}
