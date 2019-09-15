package interviewbit.solutions.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JustifiedText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] input = {"This", "is", "an", "example", "of", "text", "justification."};
		String[] input = { "What", "must", "be", "shall", "be."};
		List<String> inputL = Arrays.asList(input);
		JustifiedText j = new JustifiedText();
		//System.out.println(j.fullJustify(inputL, 16));
		System.out.println(j.fullJustify(inputL, 12));

	}
	
    public ArrayList<String> fullJustify(List<String> A, int B) {
    	ArrayList<String> output = new ArrayList<>();
    	ArrayList<String> tempList = new ArrayList<>();
    	int sum = 0;
    	int space =0;
    	int length = A.size();
    	int i =0;
    	while (i<length) {
    		String string = A.get(i).trim();
			if (sum+space+string.length()<=B) {
				sum = sum + string.length();
				tempList.add(string);
				i++;
				space++;
			} else {
				createLine(B, output, tempList, sum);
				sum=0;
				space=0;
				tempList = new ArrayList<>();
			}
		}
    	if (tempList.size()>0) {
    		StringBuilder sb = new StringBuilder();
    		int words = tempList.size()>1?tempList.size()-1:1;
    		for (String string : tempList) {
				sb.append(string);
				if (words>0) {
					sb.append(" ");
				}
				words--;
			}
    		int remainingchars = B - sb.length();
    		for (int j = 1; j <= remainingchars; j++) {
				sb.append(" ");
			}
    		output.add(sb.toString());
		}

    	return output;
    }

	private void createLine(int B, ArrayList<String> output, ArrayList<String> tempList, int sum) {
		int remainingChar = B-sum;
		int words = tempList.size()>1?tempList.size()-1:1;
		int  commonSpace=0;
		int extraSpace=0;
		if(remainingChar%words==0){
			commonSpace = remainingChar/words;
		}else {
			commonSpace = remainingChar/words;
			extraSpace=remainingChar%words;
		}
		StringBuilder sb = new StringBuilder();
		for (String string2 : tempList) {
			sb.append(string2);
			if (words>0) {
				for (int j = 0; j < commonSpace; j++) {
					sb.append(" ");
				}
				words--;
				if (extraSpace>0) {
					sb.append(" ");
					extraSpace--;
				}
			}
		}
		output.add(sb.toString());
	}

}
