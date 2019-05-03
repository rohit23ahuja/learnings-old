package learn.threads.threadlocal;

/** * this class acts as a container to our thread local variables. */
public class MyThreadLocal {
	public static final  ThreadLocal<Context> userThreadLocal = new ThreadLocal<Context>();

	public static void set(Context user) {
		userThreadLocal.set(user);
	}

	public static void unset() {
		userThreadLocal.remove();
	}

	public static Context get() {
		return userThreadLocal.get();
	}
}
