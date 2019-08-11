package com.learn.systemdesign.lrucache;

import org.junit.Assert;
import org.junit.Test;

public class LRUCacheTest {
	LRUCachePractice cache = new LRUCachePractice(4);
	
	@Test
	public void tailShouldReturnLRUItem() {
		cache.add("mercedes");
		cache.add("bmw");
		cache.add("toyota");
		cache.add("volkswagen");
		Assert.assertEquals(cache.getLRUItem(), "volkswagen");
		cache.get("toyota");
		cache.get("volkswagen");
		cache.get("mercedes");
		Assert.assertEquals(cache.getLRUItem(), "bmw");
		//System.out.println(cache);
	}

}
