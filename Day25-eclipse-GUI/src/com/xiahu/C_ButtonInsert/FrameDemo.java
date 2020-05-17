package com.xiahu.C_ButtonInsert;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 
 * 需求：把按钮添加到窗体，并对按钮添加一个点击事件。
 * A：创建窗体对象
 * B:创建按钮对象
 * C:把按钮添加到窗体
 * D:窗体显示
 */
public class FrameDemo {
	public static void main(String[] args) {
		// 创建窗体对象
		Frame f = new Frame();

		f.setBounds(400, 400, 400, 300);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});

		// 创建两个面板
		Panel p1 = new Panel();
		Panel p2 = new Panel();

		f.add(p1, BorderLayout.SOUTH);
		f.add(p2, BorderLayout.NORTH);

		// 添加一个文本域
		final TextArea ta = new TextArea();
		p1.add(ta);

		// //设置布局为流式布局
		// f.setLayout(new FlowLayout());

		// 创建按钮对象
		Button b = new Button("添加");
		p2.add(b, BorderLayout.CENTER);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.setText("nihaoi ");

			}
		});

	}
}
