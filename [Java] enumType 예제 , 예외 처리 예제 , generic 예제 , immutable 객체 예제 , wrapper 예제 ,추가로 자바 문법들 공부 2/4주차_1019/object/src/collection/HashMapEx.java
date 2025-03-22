package collection;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		
	
	HashMap<String, Integer> hashMap = new HashMap<>();

	hashMap.put("Apple", 100);
	hashMap.put("Banana", 150);
	hashMap.put("Cherry", 200);
	hashMap.put("monkey", 300);
	
	//System.out.println(hashMap.get("Apple"));
	//System.out.println(hashMap.get("Banana"));
	//System.out.println(hashMap.get("Cherry"));
	
	//System.out.println(hashMap);
	//hashMap.remove("Apple");
	//System.out.println(hashMap);
	
	//자료 구조들은 향상 For 문에서 돌릴수있음
	for (String key : hashMap.keySet()) {
		System.out.println(key);
		System.out.println(hashMap.get(key));
	}
	
	}
}
