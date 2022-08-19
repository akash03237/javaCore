package raystech.map;

import java.util.HashMap;
import java.util.Set;

public class TestHashmap {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		map.put("4", "four");// 4 key he four ki
		map.put("4","four");
		String val = (String) map.get("1");
		System.out.println(val);

		//map.remove("4");

		Set keys = map.keySet();
		for (Object k : keys) {
			System.out.println(k);
		}

	}

}
