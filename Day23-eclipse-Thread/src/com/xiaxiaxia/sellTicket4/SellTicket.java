package com.xiaxiaxia.sellTicket4;

/*
 * 
 */
public class SellTicket implements Runnable {

	// ����100��Ʊ
	private static int tickets = 1000;

	private Demo demo = new Demo();

	// ����ͬһ����
	private Object obj = new Object();

	private int x = 0;

	// ʹ��obj��Ϊ������
	// @Override
	// public void run() {
	// while (true) {
	// // t1,t2,t3�����ߵ�����
	// // ����t1����CPU��ִ��Ȩ��t1��Ҫ����
	// // ����t2����CPU��ִ��Ȩ��t2��Ҫ����,�������ǹ��ŵģ�����ȥ�����Ծ͵��š�
	// // ��(��,��)
	// synchronized (obj) { // ��������Ĵ��뽫���ǻᱻ���ϵģ�����t1�����󣬾����ˡ�(��)
	// if (tickets > 0) {
	// try {
	// Thread.sleep(100); // t1��˯����
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" +
	// (tickets--) + "��Ʊ ");
	// // ����1���ڳ��۵�100��Ʊ
	// }
	// } // t1�ͳ����ɣ�Ȼ��Ϳ��š�(��)
	// }
	// }

	// ʹ�������������
	// @Override
	// public void run() {
	// while (true) {
	//
	// synchronized (demo) {
	// if (tickets > 0) {
	// try {
	// Thread.sleep(10); // t1��˯����
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" +
	// (tickets--) + "��Ʊ ");
	// }
	// }
	// }
	//
	// }

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				synchronized (SellTicket.class) {
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ ");
					}
				}
			} else {
				sellTicket();
			}
			x++;
		}
	}

	private static synchronized void sellTicket() {
		if (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ ");
		}
	}
}

class Demo {
}
