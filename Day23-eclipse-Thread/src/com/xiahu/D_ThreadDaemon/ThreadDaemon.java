package com.xiahu.D_ThreadDaemon;

/*
 *  
 */
public class ThreadDaemon extends Thread {
	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			System.out.println(getName() + ":" + x);
		}
	}

}
