package com.learn.concurrency.singleton;

public final class Singleton {
	// we need to establish a happens link between the read operation that is
	// happening at line 14 which is the first not-null check and the write
	// operation that creates new instance.
	// to achieve this we mark "instance" variable as volatile.
	private static volatile Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance != null) {
			return instance;
		}

		synchronized (instance) {
			// between the above test and this one another thread might have
			// created the instance, so its a good practice to double check it.
			if (instance == null) {
				instance = new Singleton();
			}
			return instance;
		}

	}

}

/*
 * double check locking  
public enum Singleton {
	INSTANCE;
}
*/
