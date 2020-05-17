import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.xiahu.pojo.Student;

/*
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
public class Demo5 {
	public static void main(String[] args) {
		HashMap<String, HashMap<String, ArrayList<Student>>> CZBO = new HashMap<>();

		// 创建北京校区
		HashMap<String, ArrayList<Student>> beijing = new HashMap<>();
		// 创建基础班list
		ArrayList<Student> bjJC = new ArrayList<Student>();
		// 添加Student
		bjJC.add(new Student("林青霞", 27));
		bjJC.add(new Student("风清扬", 30));
		// 创建就业list
		ArrayList<Student> bjJY = new ArrayList<Student>();
		bjJY.add(new Student("夏虎", 21));
		bjJY.add(new Student("杨铭", 20));

		beijing.put("就业班", bjJC);
		beijing.put("基础班", bjJY);
		CZBO.put("北京", beijing);

		// 创建上海校区
		HashMap<String, ArrayList<Student>> shanghai = new HashMap<>();
		// 创建基础班list
		ArrayList<Student> shJC = new ArrayList<Student>();
		// 添加Student
		shJC.add(new Student("林青霞上海", 27));
		shJC.add(new Student("风清扬上海", 30));
		// 创建就业list
		ArrayList<Student> shJY = new ArrayList<Student>();
		shJY.add(new Student("夏虎上海", 21));
		shJY.add(new Student("杨铭上海", 20));

		shanghai.put("基础班", shJC);
		shanghai.put("就业班", shJY);
		CZBO.put("上海", shanghai);

		// 创建武汉校区
		HashMap<String, ArrayList<Student>> wuhan = new HashMap<>();
		// 创建基础班list
		ArrayList<Student> whJC = new ArrayList<Student>();
		// 添加Student
		whJC.add(new Student("林青霞武汉", 27));
		whJC.add(new Student("风清扬武汉", 30));
		// 创建就业list
		ArrayList<Student> whJY = new ArrayList<Student>();
		whJY.add(new Student("夏虎武汉", 21));
		whJY.add(new Student("杨铭武汉", 20));

		wuhan.put("基础班", whJC);
		wuhan.put("就业班", whJC);
		CZBO.put("上海", wuhan);

		// 遍历
		Set<String> czbkMapSet = CZBO.keySet();
		for (String czbkMapKey : czbkMapSet) {
			System.out.println(czbkMapKey);
			HashMap<String, ArrayList<Student>> czbkMapValue = CZBO.get(czbkMapKey);
			Set<String> czbkMapValueSet = czbkMapValue.keySet();
			for (String czbkMapValueKey : czbkMapValueSet) {
				System.out.println("\t" + czbkMapValueKey);
				ArrayList<Student> czbkMapValueValue = czbkMapValue.get(czbkMapValueKey);
				for (Student s : czbkMapValueValue) {
					System.out.println("\t\t" + s.getName() + "---" + s.getAge());
				}

			}
		}
	}

}
