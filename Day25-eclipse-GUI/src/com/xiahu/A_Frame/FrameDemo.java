package com.xiahu.A_Frame;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 创建窗体对象
 */
public class FrameDemo {
	public FrameDemo() {
		Frame f = new Frame();

		f.setBounds(400, 200, 400, 300);

		f.setVisible(true);

		// f.addWindowListener(new WindowListener() {
		//
		// @Override
		// public void windowOpened(WindowEvent arg0) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void windowIconified(WindowEvent arg0) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void windowDeiconified(WindowEvent arg0) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void windowDeactivated(WindowEvent arg0) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void windowClosing(WindowEvent arg0) {
		// System.exit(0);
		//
		// }
		//
		// @Override
		// public void windowClosed(WindowEvent arg0) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void windowActivated(WindowEvent arg0) {
		// // TODO Auto-generated method stub
		//
		// }
		// });

		// 用适配器类改进
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		new FrameDemo();
	}

}
