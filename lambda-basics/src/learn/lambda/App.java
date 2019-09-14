package learn.lambda;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(34);
		A.add(24);
		A.add(44);
		A.add(54);
		//A.forEach(n -> System.out.println(n));
		FuncInterface add = (x,y) -> x+y;
		FuncInterface multiply = (x,y) -> x*y;
		
		App app = new App();
		System.out.println("Addition of "+app.performOperate(4, 2, add));
		System.out.println("Multiply of "+app.performOperate(4, 2, multiply));
	}
	
	private int performOperate(int a, int b, FuncInterface fobj) {
		return fobj.operate(a, b);
	}
}


interface FuncInterface {
	int operate(int a, int b);
}