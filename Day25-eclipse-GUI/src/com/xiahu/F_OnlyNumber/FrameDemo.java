package com.xiahu.F_OnlyNumber;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
	public static void main(String[] args) {
		// 创建一个窗体
		Frame f = new Frame();

		f.setBounds(400, 300, 400, 200);
		f.setVisible(true);

		// 添加窗体关闭事件
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});

		// 设置流布局
		f.setLayout(new FlowLayout());

		// 添加一个Label标签
		Label label = new Label("请输入你的QQ号码，只能输入数字，不信你试试？");

		// 添加一个文本框
		TextField tf = new TextField(15);

		// 添加文本框监听事件
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// 如果你取得的字符不是数字字符就取消事件
				// 思路：先获取字符，判断字符，取消事件
				// char getKeyChar()
				char ch = e.getKeyChar();
				// System.out.println(ch);
				if (!(ch >= '0' && ch <= '9')) {
					e.consume();
				}
			}

		});

		f.add(label);
		f.add(tf);
	}

}
