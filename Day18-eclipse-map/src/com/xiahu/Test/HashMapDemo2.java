package com.xiahu.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 为了更符合要求：
 * 		这次的数据就看成是学生对象。
 * 
 * 传智播客
 * 		bj	北京校区
 * 			jc	基础班
 * 					林青霞		27
 * 					风清扬		30
 * 			jy	就业班	
 * 					赵雅芝		28
 * 					武鑫		29
 * 		sh	上海校区
 * 			jc	基础班
 * 					郭美美		20
 * 					犀利哥		22
 * 			jy	就业班	
 * 					罗玉凤		21
 * 					马征		23
 * 		gz	广州校区
 * 			jc	基础班
 * 					王力宏		30
 * 					李静磊		32
 * 			jy	就业班	
 * 					郎朗		31
 * 					柳岩		33
 * 		xa	西安校区
 * 			jc	基础班
 * 					范冰冰		27
 * 					刘意		30
 * 			jy	就业班	
 * 					李冰冰		28
 * 					张志豪		29
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		// 创建传智播客HashMap
		HashMap<String, HashMap<String, ArrayList<Student>>> czbkmap = new HashMap<String, HashMap<String, ArrayList<Student>>>();

		// 创北京校区基础班
		HashMap<String, ArrayList<Student>> bjxq = new HashMap<String, ArrayList<Student>>();

		// 北京校区
		ArrayList<Student> jc = new ArrayList<Student>();
		Student s1 = new Student("诸葛亮", 28);
		Student s2 = new Student("黄月英", 25);
		// 基础班添加学生
		jc.add(s1);
		jc.add(s2);
		// 北京校区就业班
		ArrayList<Student> jy = new ArrayList<Student>();
		Student s3 = new Student("曹操", 40);
		Student s4 = new Student("郭嘉", 30);
		// 就业班添加学生
		jy.add(s3);
		jy.add(s4);

		bjxq.put("jc", jc);
		bjxq.put("jy", jy);

		// 上海校区
		HashMap<String, ArrayList<Student>> shxq = new HashMap<String, ArrayList<Student>>();
		// 上海校区基础班
		ArrayList<Student> shjc = new ArrayList<Student>();
		Student s5 = new Student("林冲", 28);
		Student s6 = new Student("宋江", 25);
		// 基础班添加学生
		jc.add(s5);
		jc.add(s6);
		// 上海校区就业班
		ArrayList<Student> shjy = new ArrayList<Student>();
		Student s7 = new Student("高俅", 40);
		Student s8 = new Student("宋徽宗", 30);
		// 就业班添加学生
		jy.add(s7);
		jy.add(s8);

		shxq.put("jc", shjc);
		shxq.put("jy", shjy);

		// 传智播客添加校区
		czbkmap.put("北京", bjxq);
		czbkmap.put("上海", shxq);

		// 遍历
		Set<Map.Entry<String, HashMap<String, ArrayList<Student>>>> set = czbkmap
				.entrySet();
		for (Map.Entry<String, HashMap<String, ArrayList<Student>>> me : set) {
			String city = me.getKey();
			System.out.println(city);
			HashMap<String, ArrayList<Student>> hm = me.getValue();
			Set<Map.Entry<String, ArrayList<Student>>> set1 = hm.entrySet();
			for (Map.Entry<String, ArrayList<Student>> me1 : set1) {
				String kc = me1.getKey();
				System.out.println("\t" + kc);
				ArrayList<Student> ss = me1.getValue();
				for (Student s : ss) {
					System.out.println("\t" + s.getName()+"---"+s.getAge());
				}
			}
		}

	}

}
