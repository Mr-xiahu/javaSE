package com.xiahu.J_Timer;

/*
 * 
 * ��ʱ����������������ָ����ʱ����ĳ�����飬�������ظ�����ĳ�����顣
 * ����Timer��TimerTask�������ࣺ
 * Timer:��ʱ
 * 		public Timer()
 * 		public void schedule(TimerTask task,long delay)
 * 		public void schedule(TimerTask task,long delay,long period)
 * 		public void cancel()
 * TimerTask:����
 */

import java.util.Timer;
import java.util.TimerTask;


public class TimerDemo2 {
	public static void main(String[] args) {
		// ������ʱ������
		Timer t = new Timer();
		// 3���ը�����������ը
		// public void schedule(TimerTask task,long delay,long period)
		t.schedule(new MyTask(), 3000, 2000);

	}
}

class MyTask extends TimerTask {

	private Timer t;

	public MyTask() {
	}

	public MyTask(Timer t) {
		this.t = t;
	}

	@Override
	public void run() {
		System.out.println("beng,��ը��");
		// t.cancel();
	}

}
