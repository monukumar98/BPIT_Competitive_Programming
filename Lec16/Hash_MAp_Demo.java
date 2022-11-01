package Lec16;

import java.util.*;

public class Hash_MAp_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Raj", 89);
		map.put("Ramesh", 89);
		map.put("Ankit", 77);
		map.put("Aman", 67);
		map.put("kumal", 71);
		map.put("Hardik", 77);
//		map.put("Raj", 1);
//		map.put(null, 90);
		System.out.println(map);
		Set<String> set = map.keySet();
		for (String s : set) {
			System.out.println(s + " " + map.get(s));
		}
		for (String s : map.keySet()) {
			System.out.println(s + " " + map.get(s));
		}
		ArrayList<String> list = new ArrayList<>(map.keySet());

//		System.out.println(map.get("Rahul"));
//		System.out.println(map.get("Raj"));
//		System.out.println(map.containsKey("Raj"));
//		System.out.println(map.containsKey("Rahul"));
//		System.out.println(map.remove("Rahul"));
//		System.out.println(map.remove("Raj"));
//		System.out.println(map);
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		map1.put("Raj", 89);
		map1.put("Ramesh", 89);
		map1.put("Ankit", 77);
		map1.put("Aman", 67);
		map1.put("kumal", 71);
		map1.put("Hardik", 77);
		// map1.put(null, 77);
		// System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		map2.put("Raj", 89);
		map2.put("Ramesh", 89);
		map2.put("Ankit", 77);
		map2.put("Aman", 67);
		map2.put("kumal", 71);
		map2.put("Hardik", 77);
		map2.put(null, 77);
		// System.out.println(map2);

	}

}
