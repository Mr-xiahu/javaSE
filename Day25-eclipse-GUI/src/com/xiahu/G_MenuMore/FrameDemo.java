package com.xiahu.G_MenuMore;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

/*
 * �༶�˵�����
 */
public class FrameDemo {
	public static void main(String[] args) {
		// �����������
		final Frame f = new Frame();
		// ���ô�������
		f.setBounds(400, 400, 400, 300);
		f.setVisible(true);
		f.setTitle("�༶�˵�");
		// ����������
		f.setLayout(new FlowLayout());
		// ���ô���ر��¼�
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});

		// // �����˵���
		// MenuBar mb = new MenuBar();
		//
		// // ����һ���˵�
		// Menu m1 = new Menu("��ʼ");
		// Menu m2 = new Menu("�˳�");
		//
		// // ����m1���Ӳ˵�
		// MenuItem m11 = new MenuItem("�½�");
		// MenuItem m12 = new MenuItem("�ú�ѧϰ");
		// MenuItem m13 = new MenuItem("��������");
		//
		// // m1��Ӳ˵�����
		// m1.add(m11);
		// m1.add(m12);
		// m1.add(m13);
		//
		// // ����m1���Ӳ˵�
		// MenuItem m21 = new MenuItem("����");
		// MenuItem m22 = new MenuItem("�˳�");
		//
		// // m2��Ӳ˵�����
		// m2.add(m21);
		// m2.add(m22);
		//
		// mb.add(m1);
		// mb.add(m2);

		// �����˵���
		MenuBar mb = new MenuBar();
		// ���һ���ı���
		final TextArea ta = new TextArea(10, 50);

		f.add(ta);

		// �����˵�
		Menu m1 = new Menu("��ʼ");
		Menu m2 = new Menu("�½�");
		Menu m3 = new Menu("�����ĵ�");
		Menu m4 = new Menu("�˳�");

		m1.add(m2);
		m1.add(m3);
		m1.add(m4);

		// ��Ӳ˵�����
		final MenuItem mi1 = new MenuItem("�½�");
		final MenuItem mi2 = new MenuItem("����");
		m2.add(mi1);
		m2.add(mi2);

		MenuItem mi11 = new MenuItem("���ı���");
		mi11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				f.setTitle("�һ�ƫƫ�����㻻");

			}
		});

		MenuItem mi12 = new MenuItem("�ú�ѧϰ");
		mi12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.append("�ú�ѧϰ" + "\r\n");

			}
		});

		MenuItem mi13 = new MenuItem("��������");
		mi13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.append("��������" + "\r\n");

			}
		});
		m3.add(mi11);
		m3.add(mi12);
		m3.add(mi13);

		MenuItem mi21 = new MenuItem("�򿪼�����");
		mi21.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Runtime r = Runtime.getRuntime();
				try {
					r.exec("calc.exe");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		MenuItem mi22 = new MenuItem("�˳�");
		mi22.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);

			}
		});
		m4.add(mi21);
		m4.add(mi22);

		// ������Ӳ˵���
		f.setMenuBar(mb);
		mb.add(m1);

	}
}
