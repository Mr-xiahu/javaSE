package com.xiahu.D_ThreadYield;

/*
 * 
 */
public class ThreadYield extends Thread {
	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			System.out.println(getName() + ":" + x);
			// ÀñÈÃÏß³Ì
			Thread.yield();
		}
	}

}
