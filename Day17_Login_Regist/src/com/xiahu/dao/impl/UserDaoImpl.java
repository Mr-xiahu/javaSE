package com.xiahu.dao.impl;

import java.util.ArrayList;

import com.xiahu.dao.UserDao;
import com.xiahu.pojo.User;

/**
 * 这是用户操作的具体实现类(集合版)
 * 
 * @author 夏小Fu
 * @version v1.0
 */
public class UserDaoImpl implements UserDao {
	// 为了让多个方法能够使用同一个集合，就把集合定义为成员变量
	// 为了不让外人看到，用private
	// 为了让多个对象共享同一个成员变量，用static
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
		// 把用户信息存储集合
		// ArrayList<User> list=new ArrayList<User>();
		list.add(user);

	}

}
