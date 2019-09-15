package java.learning.lambda;

@FunctionalInterface
public interface Foo extends Baz,Bar {
	String method(String string);
	

	default void defaultCommon(){
		Baz.super.defaultCommon();
	}
	
	static void exBar(){
		System.out.println("fsdfsd");
	}
}

@FunctionalInterface
interface Baz{
	String method(String string);
	default void defaultCommon(){
		System.out.println("defaultBaz");
	}
	
	static void exBar(){
		System.out.println("fsdfsd");
	}
}

@FunctionalInterface
interface Bar{
	String method(String string);
	default void defaultCommon(){
		System.out.println("defaultBar");
	}
	
	static void exBar(){
		System.out.println("fsdfsd");
	}
}
