package com.xiahu.C_ButtonInsert;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FrameDemo2 extends JFrame {
	public FrameDemo2() {
		// 创建容器
		Container c = getContentPane();
		setBounds(400, 400, 400, 500);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// 创建两个面板
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		c.add(jp1, BorderLayout.NORTH);
		c.add(jp2, BorderLayout.SOUTH);

		// 创建一个按钮
		JButton jb = new JButton("添加");
		jp1.add(jb);
		// 添加一个文本域
		final JTextArea ta = new JTextArea();
		jp2.add(ta);

		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.setText("你在点我一下试试");
			}
		});

	}

	public static void main(String[] args) {
		new FrameDemo2();
	}

}
