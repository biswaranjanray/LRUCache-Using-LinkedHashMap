package com.java.example.lrucache;

import java.util.Map;

public class LRUCacheDemo {

	private static void displayMapEntries(Map<Integer, String> map) {
		map.forEach((key, value) -> {
			System.out.println("Key: " + key + " Value: " + value);
		});
	}
	
	public static void main(String[] args) {
		int cacheSize = 5;
		
		Map<Integer, String> mapEmployeeIDName = new LRUCache<>(cacheSize);
		mapEmployeeIDName.put(100, "biswa");
		mapEmployeeIDName.put(105, "ranjan");
		mapEmployeeIDName.put(110, "priya");
		mapEmployeeIDName.put(115, "soni");
		mapEmployeeIDName.put(120, "saurav");
		
		System.out.println("1. Iterating initial cache of size = "+cacheSize);
		displayMapEntries(mapEmployeeIDName);
		
		System.out.printf("2. Accessting value at key: %d is %s\n", 100, mapEmployeeIDName.get(100));
		System.out.printf("3. Accessting value at key: %d is %s\n", 110, mapEmployeeIDName.get(110));
		
		System.out.println("4. Iterating cache after accessing its keys: ");
		displayMapEntries(mapEmployeeIDName);
		
		int id = 125;
		String name = "mano";
		System.out.printf("5. Adding new entry to cache, key=%d, value=%s\n", id, name);
		mapEmployeeIDName.put(id, name);
		
		id = 130;
		name = "upali";
		System.out.printf("6. Adding new entry to cache, key=%d, value=%s\n", id, name);
		mapEmployeeIDName.put(id, name);
		
		System.out.println("7. Iterating cache after adding entries beyond its size: ");
		displayMapEntries(mapEmployeeIDName);
	}
}
