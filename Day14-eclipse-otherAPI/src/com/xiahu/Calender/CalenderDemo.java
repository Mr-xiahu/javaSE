package com.xiahu.Calender;

import java.util.Calendar;

/**
 * @author Administrator
 *  Calendar:��Ϊ�ض�˲����һ������ YEAR��MONTH��DAY_OF_MONTH��HOUR �� �����ֶ�֮���ת���ṩ��һЩ������
 *           ��Ϊ���������ֶΣ������������ڵ����ڣ��ṩ��һЩ������
 * 
 *  public int get(int field):���ظ��������ֶε�ֵ���������е�ÿ�������ֶζ��Ǿ�̬�ĳ�Ա������������int���͡�
 */
public class CalenderDemo {
	public static void main(String[] args) {
		Calendar rigthNow=Calendar.getInstance();
		
		//��ȡ��  ��   ��
		int year=rigthNow.get(Calendar.YEAR);
		int month=rigthNow.get(Calendar.MONTH);
		int day=rigthNow.get(Calendar.DATE);
		int hou=rigthNow.get(Calendar.HOUR);
		int min=rigthNow.get(Calendar.MINUTE);
		System.out.println(year+"��"+(month+1)+"��"+day+"��"+hou+"ʱ"+min+"��");
	}

}
