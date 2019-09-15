package java.learning.proxy;

public class App {

	public static void main(String[] args) {
		Task task = (Task) ProxyFactory.newInstance(new TaskImpl());
		task.setData("Test");
		System.out.println(task.getCalData(5));
	}

}
