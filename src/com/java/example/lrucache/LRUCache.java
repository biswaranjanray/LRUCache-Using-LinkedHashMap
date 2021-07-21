package com.java.example.lrucache;

import java.util.LinkedHashMap;

/**
 * @author C5258401
 * 
 * source: https://makeinjava.com/least-recently-used-lru-cache-example-linkedhashmap/
 *
 * @param <K>
 * @param <V>
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
	
	private static final long serialVersionUID = 1L;
	private int capacity;
	
	public LRUCache(int capacity) {
		super(16, 0.75f, true);
		this.capacity = capacity;
	}
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		return size() > capacity;
	}

}
