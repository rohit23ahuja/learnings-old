package interviewbit.solutions.string;

public class Atoi {

	public static void main(String[] args) {
		Atoi a = new Atoi();
		//String A = "   98a7235";
		//String A ="5121478262 8070067M75 X199R 547 8C0A11 93I630 4P4071 029W433619 M3 5 14703818 776366059B9O43393";
		String A = "-54332872018247709407 4 54";
		System.out.println(Integer.MIN_VALUE);
		System.out.println(a.atoi(A));

	}
	
    public int atoi(final String s) {
		char[] arr = s.toCharArray();
		long res =0;
		int a=0;
		boolean negative = false;
		while(a<arr.length) {
			if (arr[a]==' ') {
				a++;
			} else {
				break;
			}
		}
		for (int i = a; i < arr.length; i++) {
			if(res>=Integer.MAX_VALUE){
				if (negative) {
					res = Integer.MIN_VALUE;
					negative=false;
				} else {
					res = Integer.MAX_VALUE;	
				}
				
				break;
			}
			if(arr[i]==' ') break;
			if (arr[i]=='+') {
				continue;
			}
			if (arr[i]=='-') {
				negative =true;
				continue;
			}
			int temp = arr[i]-'0';
			if (temp>=0&&temp<=9) {
	
				res = res*10 + temp;
			} else {
				break;
			}
		}

		if (negative) 
			res=-res;
 		return (int)res;
    }

}
