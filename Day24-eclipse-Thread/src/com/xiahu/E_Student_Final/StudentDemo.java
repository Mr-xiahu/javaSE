package com.xiahu.E_Student_Final;

/*
 * 分析：
 * 		资源类：Student	
 * 		设置学生数据:SetThread(生产者)
 * 		获取学生数据：GetThread(消费者)
 * 		测试类:StudentDemo
 * 
 *  
 * 最终版代码中：
 * 		把Student的成员变量给私有的了。
 * 		把设置和获取的操作给封装成了功能，并加了同步。
 * 		设置或者获取的线程里面只需要调用方法即可。
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();

		SetStudent set = new SetStudent(s);
		GetStudent get = new GetStudent(s);

		Thread th2 = new Thread(get);
		Thread th1 = new Thread(set);

		th1.start();
		th2.start();

	}

}
