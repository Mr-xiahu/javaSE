package com.xiahu.B_DieLock;

public class DieLock extends Thread {

	private boolean flag;

	public DieLock(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		if (flag) {
			synchronized (MyLock.objA) {
				System.out.println("if ibjA");
				synchronized (MyLock.objB) {
					System.out.println("if objB");

				}
			}
		} else {
			synchronized (MyLock.objB) {
				System.out.println("else ibjB");
				synchronized (MyLock.objA) {
					System.out.println("else objA");
				}

			}
		}

	}

}
