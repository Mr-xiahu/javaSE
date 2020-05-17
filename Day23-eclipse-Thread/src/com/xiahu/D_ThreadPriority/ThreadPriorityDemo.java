package com.xiahu.D_ThreadPriority;

/*
 * 我们的线程没有设置优先级,肯定有默认优先级。
 * 那么，默认优先级是多少呢?
 * 如何获取线程对象的优先级?
 * 		public final int getPriority():返回线程对象的优先级
 * 如何设置线程对象的优先级呢?
 * 		public final void setPriority(int newPriority)：更改线程的优先级。
 * 
 * public static final int MAX_PRIORITY   获取最大优先级
 * public static final int MIN_PRIORITY   获取最小优先级
 *
 * 
 * 注意：
 * 		线程默认优先级是5。
 * 		线程优先级的范围是：1-10。
 * 		线程优先级高仅仅表示线程获取的 CPU时间片的几率高，但是要在次数比较多，或者多次运行的时候才能看到比较好的效果。
 * 		
 * IllegalArgumentException:非法参数异常。
 * 抛出的异常表明向方法传递了一个不合法或不正确的参数。 
 */
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		// 创建线程对象
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();

		// 设置线程对象名称
		tp1.setName("赵子龙");
		tp2.setName("刘秀");
		tp3.setName("孙权");

		// 获取线程优先级
		// 默认优先级为5
		// System.out.println(tp1.getPriority());//5
		// System.out.println(tp2.getPriority());//5
		// System.out.println(tp3.getPriority());//5

		// 查看最大优先级跟最小优先级
		// System.out.println(tp1.MAX_PRIORITY);//10
		// System.out.println(tp1.MIN_PRIORITY);//1

		// 设置线程优先级
		tp1.setPriority(10);
		tp2.setPriority(1);

		// 启动线程
		tp1.start();
		tp2.start();
		tp3.start();
	}

}
