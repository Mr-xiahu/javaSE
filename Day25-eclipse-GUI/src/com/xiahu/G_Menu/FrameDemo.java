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
		// 创建窗体对象
		Frame f = new Frame();
		// 设置窗体属性
		f.setBounds(400, 400, 400, 300);
		f.setVisible(true);
		f.setTitle("一级菜单");
		// 设置流布局
		f.setLayout(new FlowLayout());
		// 设置窗体关闭事件
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});

		// 创建菜单栏
		MenuBar mb = new MenuBar();
		// 创建菜单
		Menu m = new Menu("开始");
		// 创建菜单选项
		MenuItem mi = new MenuItem("保存");
		MenuItem mi2 = new MenuItem("退出");
		mi2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);

			}
		});

		// 踩点添加菜单选项
		m.add(mi);
		m.add(mi2);

		// 菜单栏添加菜单
		mb.add(m);

		f.setMenuBar(mb);
	}

}
