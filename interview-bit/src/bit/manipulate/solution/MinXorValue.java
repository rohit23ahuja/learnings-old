package bit.manipulate.solution;

import java.util.ArrayList;
import java.util.Collections;

public class MinXorValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int findMinXor(ArrayList<Integer> A) {
       Collections.sort(A);
        
        long minXor = Integer.MAX_VALUE; 
        long val = 0; 
        int n = A.size();
        // calculate min xor of consecutive pairs 
        for (int i = 0; i < n - 1; i++) { 
            val = A.get(i) ^ A.get(i+1); 
            minXor = Math.min(minXor, val); 
        } 
  
        return (int) minXor; 
    }

}
