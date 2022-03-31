package TestYantraJava;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapClass 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		
		HashMap map = new HashMap<>();
		map.put(1, "Manju");
		map.put("hey", "Hello");
		map.put(3, "Manju");
		map.put(6, "Buddy");
		map.put(6, "Buddy");
		map.put(9, "Hey");
		map.put(null, "Hey");
		map.put(null, "Man");
		System.out.println(map);
		
		TreeMap tm = new TreeMap<>();
		tm.put(1, "Manju");
		tm.put(4, "Hello");
		tm.put(3, "Manju");
		tm.put(6, "Buddy");
		tm.put(6, "Buddy");
		tm.put(9, "Hey");
		try {
			tm.put(null, "Hey");
			tm.put(null, "Man");
		} catch (Exception e) {
			// TODO: handle exception
		}
		tm.put(3, "Manju2");
		tm.put(6, "Buddy2");
		tm.put(6, "Buddy3");
		tm.put(9, "Hey2");
		System.out.println(tm);
		
		
	}

}
