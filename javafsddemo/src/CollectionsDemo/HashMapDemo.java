package CollectionsDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		
		m.put("Bob", 99);
		m.put("Jhon", 92);
		m.put("Bob", 90);
		System.out.println(m);
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		for(String key:m.keySet()) {
			System.out.println(m.get(key));
		}
		
		Map<String,Integer> m1 = new LinkedHashMap<>();
		
		m1.put("Bob", 99);
		m1.put("Jhon", 92);
		m1.put("Bob", 90);
		System.out.println(m1);
	}
}
