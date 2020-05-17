import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.xiahu.pojo.Student;

/*
 * ���ǲ���
 * 		bj	����У��
 * 			jc	������
 * 					����ϼ		27
 * 					������		30
 * 			jy	��ҵ��	
 * 					����֥		28
 * 					����		29
 * 		sh	�Ϻ�У��
 * 			jc	������
 * 					������		20
 * 					Ϭ����		22
 * 			jy	��ҵ��	
 * 					�����		21
 * 					����		23
 * 		gz	����У��
 * 			jc	������
 * 					������		30
 * 					���		32
 * 			jy	��ҵ��	
 * 					����		31
 * 					����		33
 * 		xa	����У��
 * 			jc	������
 * 					������		27
 * 					����		30
 * 			jy	��ҵ��	
 * 					�����		28
 * 					��־��		29
 */
public class Demo5 {
	public static void main(String[] args) {
		HashMap<String, HashMap<String, ArrayList<Student>>> CZBO = new HashMap<>();

		// ��������У��
		HashMap<String, ArrayList<Student>> beijing = new HashMap<>();
		// ����������list
		ArrayList<Student> bjJC = new ArrayList<Student>();
		// ���Student
		bjJC.add(new Student("����ϼ", 27));
		bjJC.add(new Student("������", 30));
		// ������ҵlist
		ArrayList<Student> bjJY = new ArrayList<Student>();
		bjJY.add(new Student("�Ļ�", 21));
		bjJY.add(new Student("����", 20));

		beijing.put("��ҵ��", bjJC);
		beijing.put("������", bjJY);
		CZBO.put("����", beijing);

		// �����Ϻ�У��
		HashMap<String, ArrayList<Student>> shanghai = new HashMap<>();
		// ����������list
		ArrayList<Student> shJC = new ArrayList<Student>();
		// ���Student
		shJC.add(new Student("����ϼ�Ϻ�", 27));
		shJC.add(new Student("�������Ϻ�", 30));
		// ������ҵlist
		ArrayList<Student> shJY = new ArrayList<Student>();
		shJY.add(new Student("�Ļ��Ϻ�", 21));
		shJY.add(new Student("�����Ϻ�", 20));

		shanghai.put("������", shJC);
		shanghai.put("��ҵ��", shJY);
		CZBO.put("�Ϻ�", shanghai);

		// �����人У��
		HashMap<String, ArrayList<Student>> wuhan = new HashMap<>();
		// ����������list
		ArrayList<Student> whJC = new ArrayList<Student>();
		// ���Student
		whJC.add(new Student("����ϼ�人", 27));
		whJC.add(new Student("�������人", 30));
		// ������ҵlist
		ArrayList<Student> whJY = new ArrayList<Student>();
		whJY.add(new Student("�Ļ��人", 21));
		whJY.add(new Student("�����人", 20));

		wuhan.put("������", whJC);
		wuhan.put("��ҵ��", whJC);
		CZBO.put("�Ϻ�", wuhan);

		// ����
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
