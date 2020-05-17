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
		// ��������
		Container c = getContentPane();
		setBounds(400, 400, 400, 500);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// �����������
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		c.add(jp1, BorderLayout.NORTH);
		c.add(jp2, BorderLayout.SOUTH);

		// ����һ����ť
		JButton jb = new JButton("���");
		jp1.add(jb);
		// ���һ���ı���
		final JTextArea ta = new JTextArea();
		jp2.add(ta);

		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.setText("���ڵ���һ������");
			}
		});

	}

	public static void main(String[] args) {
		new FrameDemo2();
	}

}
