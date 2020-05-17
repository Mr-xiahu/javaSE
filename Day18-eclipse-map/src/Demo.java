import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("ÏÄ»¢", "ÑîÃú");
		map.put("ÏÄ»¢", "ÑîÃú");
		map.put("ÏÄ»¢1", "ÑîÃú1");
		map.put("ÏÄ»¢2", "ÑîÃú2");
		map.put("ÏÄ»¢3", "ÑîÃú3");
		map.put("ÏÄ»¢4", "ÑîÃú4");

		// ±éÀúmap
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			String string2 = map.get(string);
			System.out.println(string2);
		}
	}

}
