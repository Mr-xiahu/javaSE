package com.xiahu.D_TextAreaToTextField;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * 
 */
public class FrameDemo {
	public static void main(String[] args) {
		// �����������
		Frame f = new Frame();
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

		// �����ı���
		final TextField tf = new TextField(20);

		// ������ť
		Button b = new Button("����ת��");
		
		// �����ı���
		final TextArea ta = new TextArea(10, 40);

		// ���ò���Ϊ������
		f.setLayout(new FlowLayout());

		// ���
		f.add(tf);
		f.add(ta);
		f.add(b);

		// ��Ӱ�ť�����¼�
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// ��ȡ�ı����ֵ
				String tf_str = tf.getText().trim();
				// ����ı���
				tf.setText("");

				// ���ı����ֵ���ı���
				// ta.setText(tf_str);
				// ׷�Ӻͻ���
				ta.append(tf_str + "\r\n");

				// ��ȡ���
				tf.requestFocus();

			}
		});

	}

}
