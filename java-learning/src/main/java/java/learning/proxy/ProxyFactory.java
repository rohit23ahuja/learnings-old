package java.learning.proxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {
	public static Object newInstance(Object obj) {
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class<?>[] { Task.class },
				new MyInvocationHandler(obj));
	}
}
