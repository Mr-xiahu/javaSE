package com.xiahu.test;

import java.util.Scanner;

import com.xiahu.dao.UserDao;
import com.xiahu.dao.impl.UserDaoImpl;
import com.xiahu.game.GuessNumber;
import com.xiahu.pojo.User;

/**
 * �û�������
 * 
 * @author Administrator ������������С���� A:���������ͬһ����Ա�������þ�̬
 *         B:ѭ�����������switch��������switch������break����ô�����Ĳ���ѭ��������switch���
 */
public class UserTest {
	public static void main(String[] args) {
		// Ϊ���ܹ��ص���ҳ
		while (true) {
			// ��ӭ���棬����ѡ����
			System.out.println("--------------��ӭ��ĵ���--------------");
			System.out.println("1 ��¼");
			System.out.println("2 ע��");
			System.out.println("3 �˳�");
			System.out.println("��ѡ��:");

			// ����¼��ѡ�񣬸���ѡ��ͬ����ͬ�Ĳ���
			Scanner sc = new Scanner(System.in);
			// ����¼��ѡ�񣬸���ѡ������ͬ�Ĳ���
			String choicestring = sc.nextLine();
			// switch���Ķ���ط�Ҫʹ�ã��ҾͶ��嵽����
			UserDao ud = new UserDaoImpl();
			// �����򵥵�˼������ѡ����switch
			switch (choicestring) {
			case "1":
				// ��¼����
				System.out.println("--------------��ӭ������¼����--------------");
				System.out.println("�������û���:");
				String username = sc.nextLine();
				System.out.println("����������:");
				String password = sc.nextLine();

				// ���õ�¼����
				// ��̬ʹ��
				// UserDao ud=new UserDaoImpl();
				boolean flag = ud.isLogin(username, password);
				if (flag) {
					System.out.println("��¼�ɹ�,��������Ϸ��");

					// // �ж��Ƿ�������Ϸ
					System.out.println("��������Ϸ��?(y/n)");
					while (true) {
						String resultString = sc.nextLine();
						if (resultString.equalsIgnoreCase("y")) {
							// ����Ϸ
							GuessNumber.start();
							System.out.println("�㻹����?y/n");
						} else {
							break;
						}
					}
					System.out.println("ллʹ�ã���ӭ�´�����");
					System.exit(0);

					// break; //����дbreak����������switch
				} else {
					System.out.println("��¼ʧ�ܣ��˺����벻��ȷ");

				}
				break;

			case "2":
				// ע�����
				System.out.println("--------------��ӭ����ע�����--------------");
				System.out.println("�������û���:");
				String newusername = sc.nextLine();
				System.out.println("����������:");
				String newpassword = sc.next();

				// ���û����������װ��һ��������
				User user = new User();
				user.setUsername(newusername);
				user.setPassword(newusername);

				// ����ע�Ṧ��
				// ��̬ʹ��
				// UserDao ud=new UserDaoImpl();
				// ������ʹ��
				// UserDaoImpl udi=new UserDaoImpl();

				ud.regist(user);
				System.out.println("ע��ɹ�!");

				break;

			case "3":
			default:
				System.out.println("ллʹ�ã���ӭ�´�����");
				System.exit(0);
				break;
			}
		}
	}

}
