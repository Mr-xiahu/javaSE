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
		// �����������
		final Frame f = new Frame();
		// ���ô�������
		f.setBounds(400, 200, 400, 300);
		f.setVisible(true);

		// ���ڹر��¼�
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});
		f.setLayout(new FlowLayout());

		// ���������ť
		Button redButton = new Button("��ɫ");
		Button greenButton = new Button("��ɫ");
		Button blueButton = new Button("��ɫ");

		// ��ӵ�����
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
