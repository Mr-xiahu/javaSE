package com.xiahu.G_Menu;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
	public static void main(String[] args) {
		// �����������
		Frame f = new Frame();
		// ���ô�������
		f.setBounds(400, 400, 400, 300);
		f.setVisible(true);
		f.setTitle("һ���˵�");
		// ����������
		f.setLayout(new FlowLayout());
		// ���ô���ر��¼�
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});

		// �����˵���
		MenuBar mb = new MenuBar();
		// �����˵�
		Menu m = new Menu("��ʼ");
		// �����˵�ѡ��
		MenuItem mi = new MenuItem("����");
		MenuItem mi2 = new MenuItem("�˳�");
		mi2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);

			}
		});

		// �ȵ���Ӳ˵�ѡ��
		m.add(mi);
		m.add(mi2);

		// �˵�����Ӳ˵�
		mb.add(m);

		f.setMenuBar(mb);
	}

}
