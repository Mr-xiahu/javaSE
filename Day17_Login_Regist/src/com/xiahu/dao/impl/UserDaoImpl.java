package com.xiahu.dao.impl;

import java.util.ArrayList;

import com.xiahu.dao.UserDao;
import com.xiahu.pojo.User;

/**
 * �����û������ľ���ʵ����(���ϰ�)
 * 
 * @author ��СFu
 * @version v1.0
 */
public class UserDaoImpl implements UserDao {
	// Ϊ���ö�������ܹ�ʹ��ͬһ�����ϣ��ͰѼ��϶���Ϊ��Ա����
	// Ϊ�˲������˿�������private
	// Ϊ���ö��������ͬһ����Ա��������static
	private static ArrayList<User> list = new ArrayList<User>();

	@Override
	public boolean isLogin(String username, String password) {
		boolean flag = false;

		for (User u : list) {
			if (u.getUsername().equals(username)
					&& u.getPassword().equals(password)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	@Override
	public void regist(User user) {
		// ���û���Ϣ�洢����
		// ArrayList<User> list=new ArrayList<User>();
		list.add(user);

	}

}
