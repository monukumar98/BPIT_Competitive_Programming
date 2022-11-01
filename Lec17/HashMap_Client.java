package Lec17;



public class HashMap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Raj", 77);
		map.put("Kunal", 73);
		map.put("Anish", 77);
		map.put("Pooja", 67);
		map.put("Hardik", 57);
		map.put("Raj", -77);
		map.put("Ankit", 71);
		System.out.println(map.containsKey("Ankit"));
		System.out.println(map.containsKey("Ankita"));
		System.out.println(map.get("raj"));
		System.out.println(map.get("Raj"));
		System.out.println(map);
		System.out.println(map.remove("Ankit"));
		System.out.println(map);

	}

}
