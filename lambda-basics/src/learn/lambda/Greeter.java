package learn.lambda;

public class Greeter {

	public void greeter(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		HelloWorldGreeting greeting = new HelloWorldGreeting();
		greeter.greeter(greeting);

		Greeting myLambdaFunction = () -> System.out.println("Hello World Lambda !!");
		Greeting aBlockOfCode = () -> System.out.println("Rohit ");
		DoubleNumber doubleNumberFunction = (int a) -> a * 2;
		AddNumber addFunction = (int a, int b) -> a + b;
		Division safeDivideFunction = (x, y) -> {
			if (y == 0)
				return 0;
			return x / y;
		};
		StringLength stringLengthCountFunction = (String s) -> s.length();
		
		myLambdaFunction.perform();
		aBlockOfCode.perform();
		System.out.println(doubleNumberFunction.doubleOf(4));
		System.out.println(addFunction.sumOf(22, 23));
		System.out.println(safeDivideFunction.division(12, 2));
		System.out.println(stringLengthCountFunction.stringLength("deepika"));
	}

	
	
	// greet(aBlockOfCode);
}

interface DoubleNumber {
	int doubleOf(int a);
}

interface AddNumber {
	int sumOf(int a, int b);
}

interface Division {
	int division(int a, int b);
}

interface StringLength {
	int stringLength(String s);
}