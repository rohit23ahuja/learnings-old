package java.learning.lambda;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> System.out.println("inside thread"));
		t1.start();
	}
}
