package java.learning.interfaces;

public interface InterfaceB {
	void fun();
	
	default void show() {
		System.out.println("Interface B");
	}
}
