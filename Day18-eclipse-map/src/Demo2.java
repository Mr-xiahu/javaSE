import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xiahu.pojo.Student;

public class Demo2 {
	public static void main(String[] args) {
		Map<String, Student> hm = new HashMap<>();
		// ����ѧ������
		Student s1 = new Student("���ǳ�", 58);
		Student s2 = new Student("���»�", 55);
		Student s3 = new Student("����ΰ", 54);
		Student s4 = new Student("������", 50);

		// ���Ԫ��
		hm.put("9527", s1);
		hm.put("9522", s2);
		hm.put("9524", s3);
		hm.put("9529", s4);
		
		//����map����
		Set<String> keySet = hm.keySet();
		for (String string : keySet) {
			Student student = hm.get(string);
			System.out.println(student.getAge()+"---"+student.getName());
		}
	}

}
