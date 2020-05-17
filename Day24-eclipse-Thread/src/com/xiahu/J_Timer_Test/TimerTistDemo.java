package com.xiahu.J_Timer_Test;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

/*
 * 需求：在指定的时间删除我们的指定目录(你可以指定c盘，但是我不建议，我使用项目路径下的demo)
 */
public class TimerTistDemo {
	public static void main(String[] args) {
		// 创建定时器
		Timer t = new Timer();
		t.schedule(new MyTisk(), 6000);
	}

}

class MyTisk extends TimerTask {

	@Override
	public void run() {
		File srcFolder = new File("aaa");
		deleteFolder(srcFolder);

	}

	private void deleteFolder(File srcFolder) {
		File[] arrayFile = srcFolder.listFiles();
		if (arrayFile != null) {
			for (File file : arrayFile) {
				if (file.isDirectory()) {
					deleteFolder(file);
				} else {
					file.delete();
				}
			}
			srcFolder.delete();
		}

	}
}
