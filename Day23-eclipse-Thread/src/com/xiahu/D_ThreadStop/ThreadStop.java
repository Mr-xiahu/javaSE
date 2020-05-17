package com.xiahu.D_ThreadStop;
/*
 * 
 */
import java.util.Date;

public class ThreadStop extends Thread {
	@Override
	public void run() {
		System.out.println("开始执行:"+new Date());
		
		//睡眠10秒在继续执行
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("结束执行:"+new Date());
	}

}
