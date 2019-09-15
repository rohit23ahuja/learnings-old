package java.learning.lambda;

public class UseFoo {

	public static void main(String[] args) {
		String s = "rohit";
		Foo f = p ->{
			//Local variable s defined in an enclosing scope must be final or effectively final
			//s = "deepika";
			p = p+" from foo - "+s;
			return p;
		};
		String r = f.method("Message");
		System.out.println(r);
		//f.defaultCommon();
		Foo.exBar();
	
	}

}
