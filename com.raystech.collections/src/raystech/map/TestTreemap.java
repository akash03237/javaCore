package raystech.map;

import java.util.TreeMap;

public class TestTreemap {
public static void main(String[] args) {
	TreeMap map = new TreeMap();
	map.put("1", "one");
	map.put("2", "two");
	map.put("3", "three");
	map.put("4", "four");
	for (Object p :map.keySet()) {
		System.out.println(p +"="+map.get(p));
	}
		
}//work as natural keys

}
