package com.xiahu.J_Timer;

import java.util.Timer;
import java.util.TimerTask;

/*
 * * ��ʱ����������������ָ����ʱ����ĳ�����飬�������ظ�����ĳ�����顣
 * ����Timer��TimerTask�������ࣺ
 * Timer:��ʱ
 * 		public Timer()
 * 		public void schedule(TimerTask task,long delay)
 * 		public void schedule(TimerTask task,long delay,long period)
 * 		public void cancel()
 * TimerTask:����
 */
public class TimerDemo {
	public static void main(String[] args) {
		// ������ʱ������
		Timer t = new Timer();

		// 3���ִ�б�ը����
		// t.schedule(new MyTask(), 3000);
		t.schedule(new MyTimer(t), 3000);
		// ��������


	}

}

class MyTimer extends TimerTask {
	private Timer t;

	public MyTimer(Timer t) {
		this.t = t;
	}

	@Override
	public void run() {
		System.out.println("bong����ը�ˣ�����");
		// ����
		t.cancel();
	}

}
