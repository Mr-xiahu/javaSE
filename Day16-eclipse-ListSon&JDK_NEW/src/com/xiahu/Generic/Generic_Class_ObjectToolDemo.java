package com.xiahu.Generic;
/*
 * ������Ĳ���
 */
public class Generic_Class_ObjectToolDemo {
	public static void main(String[] args) {
//		Generic_Class_ObjectTool ot=new Generic_Class_ObjectTool();
//		
//		ot.setObj(new String("��������"));
//		
//		String name=(String)ot.getObj();
//		
//		ot.setObj(new Integer(25));
//		Integer age=(Integer)ot.getObj();
//		System.out.println("������:"+name);
//		System.out.println("������:"+age);
		
		Generic_Class_ObjectTool<String> ot=new Generic_Class_ObjectTool<String>();
		
		ot.setObj("��������");
		System.out.println("������:"+ot.getObj());
		
		Generic_Class_ObjectTool<Integer> ot2=new Generic_Class_ObjectTool<Integer>();
		ot2.setObj(26);
		System.out.println("������:"+ot2.getObj());
	}

}
