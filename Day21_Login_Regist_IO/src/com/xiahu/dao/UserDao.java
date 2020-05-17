package com.xiahu.dao;

import com.xiahu.pojo.User;


/**
 * 这是针对用户操作的接口
 * @author 夏小Fu
 * @version v1.1
 */
public interface UserDao {
	
	/**
	 * 这是用户登录功能
	 * @param username  用户名
	 * @param password  密码
	 * @return  返回是否登录成功
	 */
	public abstract boolean isLogin(String username,String password);
	
	/**
	 * 这是用户注册功能
	 * @param user 要注册的用户信息
	 */
	public abstract void regist(User user);
	

}
