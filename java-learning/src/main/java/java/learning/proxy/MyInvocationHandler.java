package java.learning.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private Object obj;

	public MyInvocationHandler(Object object) {
		this.obj = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result;
		try {
			if (method.getName().indexOf("get") > -1) {
				System.out.println("Get Method Executing");
			} else {
				System.out.println("set method executing");
			}
			result = method.invoke(obj, args);
		} catch (Exception e) {
			throw e;
		}
		return result;
	}

}
