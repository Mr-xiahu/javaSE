import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xiahu.pojo.Student;

public class Demo2 {
	public static void main(String[] args) {
		Map<String, Student> hm = new HashMap<>();
		// 创建学生对象
		Student s1 = new Student("周星驰", 58);
		Student s2 = new Student("刘德华", 55);
		Student s3 = new Student("梁朝伟", 54);
		Student s4 = new Student("刘嘉玲", 50);

		// 添加元素
		hm.put("9527", s1);
		hm.put("9522", s2);
		hm.put("9524", s3);
		hm.put("9529", s4);
		
		//遍历map集合
		Set<String> keySet = hm.keySet();
		for (String string : keySet) {
			Student student = hm.get(string);
			System.out.println(student.getAge()+"---"+student.getName());
		}
	}

}
