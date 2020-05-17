package com.xiahu.J_Timer_Test;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

/*
 * ������ָ����ʱ��ɾ�����ǵ�ָ��Ŀ¼(�����ָ��c�̣������Ҳ����飬��ʹ����Ŀ·���µ�demo)
 */
public class TimerTistDemo {
	public static void main(String[] args) {
		// ������ʱ��
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
