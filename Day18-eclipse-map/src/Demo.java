import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("�Ļ�", "����");
		map.put("�Ļ�", "����");
		map.put("�Ļ�1", "����1");
		map.put("�Ļ�2", "����2");
		map.put("�Ļ�3", "����3");
		map.put("�Ļ�4", "����4");

		// ����map
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			String string2 = map.get(string);
			System.out.println(string2);
		}
	}

}
