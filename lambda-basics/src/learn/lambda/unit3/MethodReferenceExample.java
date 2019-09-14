package learn.lambda.unit3;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> System.out.println("inside thread"));
		t1.start();
	}
}
