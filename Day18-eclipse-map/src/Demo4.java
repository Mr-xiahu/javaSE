import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo4 {
	public static void main(String[] args) {
		HashMap<String, HashMap<Integer, String>> czbo = new HashMap<String, HashMap<Integer, String>>();
		
		HashMap<Integer, String> jyMap = new HashMap<>();
		jyMap.put(1, "�Ļ�");
		jyMap.put(2, "��Ȩ");
		
		czbo.put("��ҵ��", jyMap);
		HashMap<Integer, String> jcMap = new HashMap<>();
		jcMap.put(3, "������");
		jcMap.put(4, "����");
		czbo.put("������", jcMap);
		
		Set<String> czbkMapSet = czbo.keySet();
		for (String czbkMapKey : czbkMapSet) {
			System.out.println(czbkMapKey);
			HashMap<Integer,String> hashMap = czbo.get(czbkMapKey);
			Set<Integer> hashMapKey = hashMap.keySet();
			for (Integer hashMapVlu : hashMapKey) {
				String name = hashMap.get(hashMapVlu);
				System.out.println("\t"+hashMapVlu+"---"+name);
			}
		}
	}
}
