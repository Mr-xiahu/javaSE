package com.xiahu.H_ThreadCallable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
	private int number;

	public MyCallable(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int x = 0; x <= number; x++) {
			sum += x;
		}

		return sum;
	}

}
