package problems.string;

public class ImplementStrStr {

	public static void main(String[] args) {
		ImplementStrStr i = new ImplementStrStr();
		String A = "";
		String B="";
		i.strStr(A, B);
	}
	
    public int strStr(final String txt, final String pat) {
		int M = pat.length(); 
		int N = txt.length(); 
		int lps[] = new int[M]; 
		int j = 0; // index for pat[] 
		computeLPSArray(pat, M, lps);
		int i = 0; 
		while (i < N) {
			if (pat.charAt(j) == txt.charAt(i)) { 
				j++; 
				i++; 
			} 
			if (j == M) { 
				return i-j; 
			} 	else if (i < N && pat.charAt(j) != txt.charAt(i)) { 
				if (j != 0) 
					j = lps[j - 1]; 
				else
					i = i + 1; 
			}
		}
    	return -1;
    }
    
	void computeLPSArray(String pat, int M, int lps[]){
		int len = 0; 
		int i = 1; 
		lps[0] = 0; // lps[0] is always 0 
		while (i < M) { 
			if (pat.charAt(i) == pat.charAt(len)) { 
				len++; 
				lps[i] = len; 
				i++; 
			} else {
				if (len != 0) { 
					len = lps[len - 1];					
				} else { 
					lps[i] = len; 
					i++; 
				} 
			}
		}
		
	}

}
