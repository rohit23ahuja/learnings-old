package java.learning.interfaces;

public interface InterfaceA {
	void fun();
	
	default void show() {
		System.out.println("Interface A");
	}
	
}
