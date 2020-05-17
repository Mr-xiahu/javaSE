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
 * 多级菜单窗口
 */
public class FrameDemo {
	public static void main(String[] args) {
		// 创建窗体对象
		final Frame f = new Frame();
		// 设置窗体属性
		f.setBounds(400, 400, 400, 300);
		f.setVisible(true);
		f.setTitle("多级菜单");
		// 设置流布局
		f.setLayout(new FlowLayout());
		// 设置窗体关闭事件
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});

		// // 创建菜单栏
		// MenuBar mb = new MenuBar();
		//
		// // 创建一级菜单
		// Menu m1 = new Menu("开始");
		// Menu m2 = new Menu("退出");
		//
		// // 创建m1的子菜单
		// MenuItem m11 = new MenuItem("新建");
		// MenuItem m12 = new MenuItem("好好学习");
		// MenuItem m13 = new MenuItem("天天向上");
		//
		// // m1添加菜单集合
		// m1.add(m11);
		// m1.add(m12);
		// m1.add(m13);
		//
		// // 创建m1的子菜单
		// MenuItem m21 = new MenuItem("帮助");
		// MenuItem m22 = new MenuItem("退出");
		//
		// // m2添加菜单集合
		// m2.add(m21);
		// m2.add(m22);
		//
		// mb.add(m1);
		// mb.add(m2);

		// 创建菜单栏
		MenuBar mb = new MenuBar();
		// 添加一个文本域
		final TextArea ta = new TextArea(10, 50);

		f.add(ta);

		// 创建菜单
		Menu m1 = new Menu("开始");
		Menu m2 = new Menu("新建");
		Menu m3 = new Menu("更改文档");
		Menu m4 = new Menu("退出");

		m1.add(m2);
		m1.add(m3);
		m1.add(m4);

		// 添加菜单集合
		final MenuItem mi1 = new MenuItem("新建");
		final MenuItem mi2 = new MenuItem("保存");
		m2.add(mi1);
		m2.add(mi2);

		MenuItem mi11 = new MenuItem("更改标题");
		mi11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				f.setTitle("我还偏偏不给你换");

			}
		});

		MenuItem mi12 = new MenuItem("好好学习");
		mi12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.append("好好学习" + "\r\n");

			}
		});

		MenuItem mi13 = new MenuItem("天天向上");
		mi13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.append("天天向上" + "\r\n");

			}
		});
		m3.add(mi11);
		m3.add(mi12);
		m3.add(mi13);

		MenuItem mi21 = new MenuItem("打开计算器");
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
		MenuItem mi22 = new MenuItem("退出");
		mi22.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);

			}
		});
		m4.add(mi21);
		m4.add(mi22);

		// 窗体添加菜单栏
		f.setMenuBar(mb);
		mb.add(m1);

	}
}
