package xiahu.com.IO_Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * 
 * 这里的集合必须是Properties集合：
 * public void load(Reader reader):把文件中的数据读取到集合中
 * public void store(Writer writer,String comments):把集合中的数据存储到文件
 * 
 * 单机版游戏：
 * 		进度保存和加载。
 * 		三国群英传，三国志，仙剑奇侠传...
 * 
 * 		吕布=1
 * 		方天画戟=1
 */
public class PropertiesDemo3 {
	public static void main(String[] args) throws IOException {
		myStore();

		myLoad();
	}

	private static void myStore() throws IOException {
		Properties prop=new Properties();
		
		prop.setProperty("张三", "40");
		prop.setProperty("李四", "45");
		prop.setProperty("王五", "10");
		
		//public void store(Writer writer,String comments):把集合中的数据存储到文件
		Writer w=new FileWriter("b.txt");
		
		prop.store(w, "hello");
		
		w.close();
		
	}

	private static void myLoad() throws IOException {
		Properties prop = new Properties();
		// public void load(Reader reader):把文件中的数据读取到集合中
		// 注意：这个文件的数据必须是键值对形式
		Reader r = new FileReader("a.txt");
		prop.load(r);
		r.close();
		
		System.out.println(prop);

	}

}
