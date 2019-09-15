package interviewbit.solutions.string;

public class PatternSearch {

	public static void main(String[] args) {
		String pattern = "dog";
		String text = "doyouseedoghere";
		
		int pLength = pattern.length();
		int tLength = text.length();
		int patternIndex=0;
		
		for (int i = 0; i < tLength; i++) {
			int j;
			for (j = 0; j < pLength; j++) {
				if (pattern.charAt(j)!=text.charAt(i+j)) {
					break;
				}
			}
			if (j==pLength) {
				patternIndex = i;					
			}
			
		}
		System.out.println(patternIndex);
	}

}
