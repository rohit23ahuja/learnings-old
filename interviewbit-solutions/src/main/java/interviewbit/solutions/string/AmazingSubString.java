package interviewbit.solutions.string;

import java.util.HashSet;
import java.util.Set;

public class AmazingSubString {
	private static Set<Character> vowels = new HashSet<>();
	static{
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		
	}
	public static void main(String[] args) {
		String A = "ABEfsdalfsdkjfklasd  lasfdjksdklafjasdkljf  lsdjflsdajkfmn eeeeeeeeeeeeeeeeeeeeeeeeee iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuC";
		AmazingSubString a = new AmazingSubString();
		System.out.println(a.solve(A));
	}
	
    public int solve(String A) {
    	long count=0;
    	if(A==null) return (int)count;
    	int length = A.length();
    	for(int i =0;i<length;i++){
    		if (vowels.contains(A.charAt(i))) {
				count += length-i;
			}
    	}
    	return (int)count%10003;
    }

}
