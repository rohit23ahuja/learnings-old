package interviewbit.solutions.math;

public class ModularArithmetic {

	public static void main(String[] args) {
		ModularArithmetic a = new ModularArithmetic();

		System.out.println(a.pow(-1, 1, 20));
	}
	
	public int pow(int x, int n, int d) {
		if(x==0) return 0;
    	long output = power(x, n, d);
    	if(output>=0) return (int) output;
    	if(d<1) {
    		return 1;
    	} else {
    		return (int)output+d;
    	}
    	
    }
	
    public long power(int x, int n, int d) {
    	if(n==0) return 1;	
    	if(n%2==0) {
    		long y = pow(x, n/2,d);
    		return (y*y)%d;
    	} else {
    		return (x%d*pow(x,n-1,d))%d;
    	}
    }

}
