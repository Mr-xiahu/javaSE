package com.xiahu.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.xiahu.pojo.User;

/**
 * �����û������ľ���ʵ����(IO��)
 * 
 * @author ��СFu
 * @version v1.1
 * 
 */
public class UserDaoImpl implements UserDao {
	private static File file = new File("aa.txt");
	static {
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("�����ļ�ʧ��");
			// e.printStackTrace();
		}

	}

	@Override
	public boolean isLogin(String username, String password) {
		// return false;
		boolean falg = false;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] dates = line.split("=");
				if (dates[0].equals(username) && dates[1].equals(password)) {
					System.out.println("��¼�ɹ�");
					falg = true;
					break;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("�û���¼ʱû���ҵ���Ӧ���ļ�");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("�û���¼ʧ��");
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("�û���¼ʱ�ͷ���Դʧ��");
				// e.printStackTrace();
			}
		}
		return falg;
	}

	@Override
	public void regist(User user) {
		/*
		 * Ϊ����ע��������ܹ���һ���Ĺ����Ҿ��Լ�������һ������ �û���=����
		 */
		BufferedWriter bw = null;
		try {
			// bw = new BufferedWriter(new FileWriter("aa.txt"));
			bw = new BufferedWriter(new FileWriter(file, true));
			// Ϊ�˱�֤������׷��д�룬�����true
			bw.write(user.getUsername() + "=" + user.getPassword());
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			System.out.println("�û�ע��ʧ��");
			// e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					System.out.println("�û�ע��ʱ�ͷ���Դʧ��");
					// e.printStackTrace();
				}
			}

		}
	}

}
