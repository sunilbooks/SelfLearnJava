package com.sunilbooks.selflearnjava.generics;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Implements a Least Recently Used (LRU) cache using a LinkedHashMap. The cache
 * automatically removes the least recently used entry when the cache size
 * exceeds the specified limit.
 * 
 * @param <E> the type of elements in the cache.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class LRUCache<E> {

	private Map<Object, E> fCacheMap;
	private int fCacheSize;

	/**
	 * Constructs an LRUCache with the specified size.
	 * 
	 * @param size the maximum number of entries the cache can hold.
	 */
	LRUCache(int size) {
		fCacheSize = size;

		// If the cache is to be used by multiple threads,
		// the hashMap must be wrapped with code to synchronize
		fCacheMap = Collections.synchronizedMap(
				// true = use access order instead of insertion order
				new LinkedHashMap<Object, E>(fCacheSize, .75F, true) {
					@Override
					protected boolean removeEldestEntry(Map.Entry<Object, E> eldest) {
						// Remove the eldest entry when the size exceeds the limit
						return size() > fCacheSize;
					}
				});
	}

	/**
	 * Puts a key-value pair into the cache.
	 * 
	 * @param key  the key with which the specified value is to be associated.
	 * @param elem the value to be associated with the specified key.
	 */
	public void put(Object key, E elem) {
		fCacheMap.put(key, elem);
	}

	/**
	 * Retrieves the value associated with the specified key.
	 * 
	 * @param key the key whose associated value is to be returned.
	 * @return the value to which the specified key is mapped, or null if this cache
	 *         contains no mapping for the key.
	 */
	public E get(Object key) {
		return fCacheMap.get(key);
	}

	public static void main(String[] args) {
		// Main method can be used for testing the LRUCache functionality
	}

}
