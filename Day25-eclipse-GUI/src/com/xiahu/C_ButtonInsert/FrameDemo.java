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
 * ���󣺰Ѱ�ť��ӵ����壬���԰�ť���һ������¼���
 * A�������������
 * B:������ť����
 * C:�Ѱ�ť��ӵ�����
 * D:������ʾ
 */
public class FrameDemo {
	public static void main(String[] args) {
		// �����������
		Frame f = new Frame();

		f.setBounds(400, 400, 400, 300);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});

		// �����������
		Panel p1 = new Panel();
		Panel p2 = new Panel();

		f.add(p1, BorderLayout.SOUTH);
		f.add(p2, BorderLayout.NORTH);

		// ���һ���ı���
		final TextArea ta = new TextArea();
		p1.add(ta);

		// //���ò���Ϊ��ʽ����
		// f.setLayout(new FlowLayout());

		// ������ť����
		Button b = new Button("���");
		p2.add(b, BorderLayout.CENTER);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.setText("nihaoi ");

			}
		});

	}
}
