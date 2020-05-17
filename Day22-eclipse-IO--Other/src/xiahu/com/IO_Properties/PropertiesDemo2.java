package xiahu.com.IO_Properties;

import java.util.Properties;
import java.util.Set;

/*
 * 特殊功能：
 * public Object setProperty(String key,String value)：添加元素
 * public String getProperty(String key):获取元素
 * public Set<String> stringPropertyNames():获取所有的键的集合
 */
public class PropertiesDemo2 {
	public static void main(String[] args) {
		//创建集合对象
		Properties prop=new Properties();
		
		//public Object setProperty(String key,String value)：添加元素
		prop.setProperty("诸葛亮", "30");
		prop.setProperty("刘玄德", "40");
		prop.setProperty("赵子龙", "20");
		
		
		//public Set<String> stringPropertyNames():获取所有的键的集合
		Set<String> set=prop.stringPropertyNames();
		for(String s:set){
			String value=prop.getProperty(s);
			System.out.println(s+"---"+value);
			
		}
		
	}

}
