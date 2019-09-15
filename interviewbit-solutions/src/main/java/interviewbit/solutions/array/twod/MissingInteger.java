package interviewbit.solutions.array.twod;

import java.util.Arrays;
import java.util.List;

public class MissingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1};
		MissingInteger mi = new MissingInteger();
		System.out.println(mi.firstMissingPositive(Arrays.asList(arr)));


		
	}

	public int firstMissingPositive(List<Integer> A) {
		Integer minPositive = null;
		Integer maxPositive = null;
		Integer positiveCount = 0;
		for (int i = 0; i < A.size(); i++) {
			Integer num = A.get(i);
			if (num>0) {
				if(minPositive==null) minPositive=num;
				else minPositive = Math.min(minPositive, num);
				if(maxPositive==null) maxPositive=num;
				else maxPositive = Math.max(maxPositive, num);
				positiveCount++;
			}
		}
		if(minPositive==null||minPositive!=1) return 1;
		Integer[] result = new Integer[positiveCount+1];
		for (int i = 0; i < A.size(); i++) {
			Integer num = A.get(i);
			if (num>0 && num<=positiveCount) {
				result[num-1]=1;
			}
		}
		for (int i = 0; i < result.length; i++) {
			if (result[i]==null) {
				return i+1;
			}
		}
		return positiveCount+1;
	}
	
	
	private int firstMissingPositiveAlternate(List<Integer> A) {
		int size = A.size();
		Integer [] copyarr = new Integer[size];
		Integer output = null;
		Integer sum =0;
		for(int i=0;i<size;i++){
			Integer num = A.get(i);
			sum+=num;
			if(num>0 && size>num){
				copyarr[num]=0;
			}
		}
		for(int i=1;i<size;i++){
			if(copyarr[i] ==null){
				output=i;
				break;
			}
		}
		if (sum<1) {
			return 1;
		}
		if(output==null){
			return size+1;
		} else {
			return output;
		} 
	}
	



}
