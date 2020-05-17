package xiahu.com.IO_Properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
 * Properties:属性集合类。是一个可以和IO流相结合使用的集合类。
 * Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。 
 * 
 * 是Hashtable的子类，说明是一个Map集合。
 */
public class PropertiesDemo {
	public static void main(String[] args) {
		// 作为Map集合的使用
		// 下面这种用法是错误的，一定要看API，如果没有<>，就说明该类不是一个泛型类,在使用的时候就不能加泛型
		// Properties<String, String> prop = new Properties<String, String>();
		Properties prop=new Properties();
		
		prop.put("0001", "诸葛亮");
		prop.put("0003", "刘玄德");
		prop.put("0002", "曹孟德");
		
		//遍历
		Set<Map.Entry<Object, Object>> set=prop.entrySet();
		for(Map.Entry<Object, Object> me:set){
			System.out.println(me.getKey()+"---"+me.getValue());
		}
	}

}
