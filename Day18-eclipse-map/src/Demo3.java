import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo3 {
	public static void main(String[] args) {
		// �������϶���
		TreeMap<String, String> tm = new TreeMap<String, String>();

		// ����Ԫ�ز����Ԫ��
		tm.put("hello", "���");
		tm.put("world", "����");
		tm.put("java", "צ��");
		tm.put("world", "����2");
		tm.put("javaee", "צ��EE");

		// ��������
		Set<String> set = tm.keySet();
		for (String key : set) {
			String value = tm.get(key);
			System.out.println(key + "---" + value);
		}
	}

}
