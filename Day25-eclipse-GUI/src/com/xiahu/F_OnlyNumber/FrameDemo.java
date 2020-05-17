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
		// ����һ������
		Frame f = new Frame();

		f.setBounds(400, 300, 400, 200);
		f.setVisible(true);

		// ��Ӵ���ر��¼�
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});

		// ����������
		f.setLayout(new FlowLayout());

		// ���һ��Label��ǩ
		Label label = new Label("���������QQ���룬ֻ���������֣����������ԣ�");

		// ���һ���ı���
		TextField tf = new TextField(15);

		// ����ı�������¼�
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// �����ȡ�õ��ַ����������ַ���ȡ���¼�
				// ˼·���Ȼ�ȡ�ַ����ж��ַ���ȡ���¼�
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
