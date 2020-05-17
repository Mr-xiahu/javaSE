package com.xiahu.Generic;
/*
 * 泛型类的测试
 */
public class Generic_Class_ObjectToolDemo {
	public static void main(String[] args) {
//		Generic_Class_ObjectTool ot=new Generic_Class_ObjectTool();
//		
//		ot.setObj(new String("东方不败"));
//		
//		String name=(String)ot.getObj();
//		
//		ot.setObj(new Integer(25));
//		Integer age=(Integer)ot.getObj();
//		System.out.println("姓名是:"+name);
//		System.out.println("年龄是:"+age);
		
		Generic_Class_ObjectTool<String> ot=new Generic_Class_ObjectTool<String>();
		
		ot.setObj("东方不败");
		System.out.println("姓名是:"+ot.getObj());
		
		Generic_Class_ObjectTool<Integer> ot2=new Generic_Class_ObjectTool<Integer>();
		ot2.setObj(26);
		System.out.println("年龄是:"+ot2.getObj());
	}

}
