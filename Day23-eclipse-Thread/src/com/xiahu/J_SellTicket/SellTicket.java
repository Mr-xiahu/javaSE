package com.xiahu.J_SellTicket;

public class SellTicket implements Runnable {
	// ����100��Ʊ
	private static int tickets = 100;

	// ����������
	private Object obj = new Object();

	private Demo d = new Demo();

	private int i = 0;

	// //ͬ���������obj����
	// @Override
	// public void run() {
	// while (true) {
	// synchronized (obj) {
	// // if (tickets > 0) {
	// try {
	// Thread.sleep(100);
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// System.out.println(Thread.currentThread().getName()
	// + "���ڳ��۵�" + (tickets--) + "��Ʊ");
	// }
	//
	// }
	// }
	//
	// }

	// ////ͬ��������������������
	// @Override
	// public void run() {
	// while (true) {
	// synchronized (d) {
	// if (tickets > 0) {
	// try {
	// Thread.sleep(100);
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// System.out.println(Thread.currentThread().getName()
	// + "���ڳ��۵�" + (tickets--) + "��Ʊ");
	// }
	//
	// }
	// }
	//
	// }

	@Override
	public void run() {
		while (true) {
			if (i % 2 == 0) {
				synchronized (SellTicket.class) {
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()
								+ "���ڳ��۵�" + (tickets--) + "��Ʊ");
					}

				}
			} else {
				// synchronized (d) {
				// if (tickets > 0) {
				// try {
				// Thread.sleep(100);
				// } catch (InterruptedException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				// System.out.println(Thread.currentThread().getName()
				// + "���ڳ��۵�" + (tickets--) + "��Ʊ");
				// }
				//
				// }
				SellTicket();

			}
			i++;

		}

	}

	// //���һ������һ��ȥ�Ϳ����˴��뱻ͬ���ˣ���ô�Ҿ������ܲ��ܰ����ͬ�����ڷ�������?
	private static synchronized void SellTicket() {
		if (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "���ڳ��۵�"
					+ (tickets--) + "��Ʊ");

		}

	}

}

class Demo {

}
