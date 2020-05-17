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
		// 创建窗体对象
		Frame f = new Frame();
		// 设置窗体属性
		f.setBounds(400, 200, 400, 300);
		f.setVisible(true);
		// 窗口关闭事件
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});

		// 创建文本框
		final TextField tf = new TextField(20);

		// 创建按钮
		Button b = new Button("数据转换");
		
		// 创建文本域
		final TextArea ta = new TextArea(10, 40);

		// 设置布局为流布局
		f.setLayout(new FlowLayout());

		// 添加
		f.add(tf);
		f.add(ta);
		f.add(b);

		// 添加按钮单击事件
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// 获取文本框的值
				String tf_str = tf.getText().trim();
				// 情况文本框
				tf.setText("");

				// 将文本框的值给文本域
				// ta.setText(tf_str);
				// 追加和换行
				ta.append(tf_str + "\r\n");

				// 获取光标
				tf.requestFocus();

			}
		});

	}

}
