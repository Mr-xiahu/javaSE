package com.xiahu.dao;

import com.xiahu.pojo.User;


/**
 * ��������û������Ľӿ�
 * @author ��СFu
 * @version v1.1
 */
public interface UserDao {
	
	/**
	 * �����û���¼����
	 * @param username  �û���
	 * @param password  ����
	 * @return  �����Ƿ��¼�ɹ�
	 */
	public abstract boolean isLogin(String username,String password);
	
	/**
	 * �����û�ע�Ṧ��
	 * @param user Ҫע����û���Ϣ
	 */
	public abstract void regist(User user);
	

}
