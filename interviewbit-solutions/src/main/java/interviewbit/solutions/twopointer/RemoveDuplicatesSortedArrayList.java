package interviewbit.solutions.twopointer;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesSortedArrayList {
	public static void main(String[] args) {
		//Integer[] arr = {0, 1,2,3,4,5,6};
		Integer[] arr = {1,2,2,3,4999, 5000};
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
/*		list.add(1);
		list.add(1);
		list.add(2);*/
		RemoveDuplicatesSortedArrayList r = new RemoveDuplicatesSortedArrayList();
		System.out.println(r.removeDuplicates(list));
	}
	
    public int removeDuplicates(ArrayList<Integer> a) {
    	if(a==null || a.size()==0) return 0;
    	int length = a.size();
    	int i =0;
    	int j =1;
    	while(i<length-1){
    		if(a.get(i).equals(a.get(i+1))){
				i++;
			} else {
				a.set(j++, a.get(i+1));
				i++;
			}
    	}
    	return j;
    }
}
