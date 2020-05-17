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
 * 这是用户操作的具体实现类(IO版)
 * 
 * @author 夏小Fu
 * @version v1.1
 * 
 */
public class UserDaoImpl implements UserDao {
	private static File file = new File("aa.txt");
	static {
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("创建文件失败");
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
					System.out.println("登录成功");
					falg = true;
					break;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("用户登录时没有找到相应的文件");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("用户登录失败");
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("用户登录时释放资源失败");
				// e.printStackTrace();
			}
		}
		return falg;
	}

	@Override
	public void regist(User user) {
		/*
		 * 为了让注册的数据能够有一定的规则，我就自己定义了一个规则： 用户名=密码
		 */
		BufferedWriter bw = null;
		try {
			// bw = new BufferedWriter(new FileWriter("aa.txt"));
			bw = new BufferedWriter(new FileWriter(file, true));
			// 为了保证数据是追加写入，必须加true
			bw.write(user.getUsername() + "=" + user.getPassword());
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			System.out.println("用户注册失败");
			// e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					System.out.println("用户注册时释放资源失败");
					// e.printStackTrace();
				}
			}

		}
	}

}
