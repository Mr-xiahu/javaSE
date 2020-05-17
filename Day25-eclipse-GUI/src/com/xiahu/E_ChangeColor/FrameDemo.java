package com.xiahu.E_ChangeColor;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * 
 */
public class FrameDemo {
	public static void main(String[] args) {
		// 创建窗体对象
		final Frame f = new Frame();
		// 设置窗体属性
		f.setBounds(400, 200, 400, 300);
		f.setVisible(true);

		// 窗口关闭事件
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});
		f.setLayout(new FlowLayout());

		// 添加三个按钮
		Button redButton = new Button("红色");
		Button greenButton = new Button("绿色");
		Button blueButton = new Button("蓝色");

		// 添加到窗体
		f.add(blueButton);
		f.add(greenButton);
		f.add(redButton);

		redButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				f.setBackground(Color.RED);
			}
		});

		greenButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				f.setBackground(Color.GREEN);
			}
		});

		blueButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				f.setBackground(Color.BLUE);
			}
		});

	}
}
