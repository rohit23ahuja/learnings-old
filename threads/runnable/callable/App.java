package learn.threads.runnable.callable;

import java.util.concurrent.ConcurrentHashMap;

public class App {
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<>();
		chm.put("A", "B");
	}
	
	//http://opensourceforgeeks.blogspot.com/2017/05/how-concurrenthashmap-works-internally.html
}
