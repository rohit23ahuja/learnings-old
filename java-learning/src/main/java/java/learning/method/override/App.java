package java.learning.method.override;

public class App {
	public static void main(String[] args) throws Exception {
		Animal a = new Animal();
		System.out.println(a.walk("Cat"));
		a = new Dog();
		System.out.println(a.walk("cat"));
		
		Dog d = new Dog();
		Animal a1 = new Animal();
		boolean x = a instanceof Animal;
		System.out.println("a instanceOf Animal "+x+" getClass "+a.getClass());
		boolean y = a instanceof Dog;
		System.out.println("a instanceOf Dog "+y+" getClass "+a.getClass());
		
		boolean z = d instanceof Animal;
		System.out.println("d instanceOf Animal "+z+" getClass "+a.getClass());
	}
}
