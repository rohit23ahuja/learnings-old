package com.learn.generics.generics;
import org.junit.*;
public class CircularQueueTest {
	CircularQueue queue = new CircularQueue(2);
	
	@Test
	public void shouldOfferPollableElement() {
		Assert.assertTrue(queue.offer(1));
		
		Assert.assertEquals(1, queue.poll());
		Assert.assertNull(queue.poll());
	}
	
	@Test
	public void shouldNotOfferWhenQueueIsFull(){
		Assert.assertTrue(queue.offer(1));
		Assert.assertTrue(queue.offer(2));
		Assert.assertFalse(queue.offer(3));
	}
	
	@Test
	public void shouldNotPollWhenQueueIsEmpty(){
		Assert.assertNull(queue.poll());
	}
	
	@Test
	public void shouldRecycleQueue(){
		Assert.assertTrue(queue.offer(1));
		Assert.assertTrue(queue.offer(2));
		Assert.assertEquals(1, queue.poll());
		Assert.assertTrue(queue.offer(3));
		Assert.assertEquals(2, queue.poll());
		Assert.assertEquals(3, queue.poll());

	}
}
