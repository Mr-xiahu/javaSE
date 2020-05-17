package com.xiahu.Map_Son;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapTest2 {
	private static final int String = 0;

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		
		map.put("无极剑圣", "易大师");
		map.put("盲僧", "Leeson");
		map.put("武器大师", "贾克斯");
		map.put("德玛西亚之力", "盖伦");
		map.put("德玛西亚之力", "盖伦");
		
		Set<Map.Entry<String, String>> set=map.entrySet();
		for(Map.Entry<String, String> me:set){
			System.out.println(me.getKey()+"-------"+me.getValue());
		}
	}

}
