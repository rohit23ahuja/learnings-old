package interviewbit.solutions.twopointer;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedLists {

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(5);
		A.add(6);
		A.add(3);
		
/*		A.add(-4);
		A.add(3);*/
		List<Integer> B = new ArrayList<>();
/*		B.add(-2);*/
		B.add(-4);
		B.add(-3);
		MergeSortedLists l = new MergeSortedLists();
		l.merge(A, B);
		System.out.println(A);
	}
	
	public void merge(List<Integer> a, List<Integer> b) {
		if (a==null && b!=null) {
			a = b;
			return;
		}
		if (a!=null && b==null) {
			return;
		}
		if(a==null && b==null) {
			a = new ArrayList<Integer>();
			return;
		}
		int i=0;
		int j=0;
		while(i<a.size()&&j<b.size()){
			if(a.get(i)>=b.get(j)){
				a.add(i, b.get(j));
				j++;
			} else {
				i++;				
			}
				
		}
		
		while(j<b.size()){
			a.add(b.get(j));
			j++;
		}
	}
	
	
	
	public void mergeCopied(List<Integer> a, List<Integer> b) {
		for (int i = 0, j=0; j < b.size(); i++) {
			if(i==a.size()|| a.get(i)>b.get(j)){
				a.add(i, b.get(j++));
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public List<Integer> mergeDifferent(List<Integer> a, List<Integer> b) {
		int i = 0;
		int j=0;
		int aLength = a.size();
		int bLength = b.size();
		List<Integer> c = new ArrayList<>(aLength+bLength);
		while(i<aLength&&j<bLength){
			if(a.get(i)<=b.get(j)){
				c.add(a.get(i));
				i++;
			} else {
				c.add(b.get(j));
				j++;
			}
		}
		
		while(i<aLength){
			c.add(a.get(i));
			i++;
		}
		
		while(j<bLength){
			c.add(b.get(j));
			j++;
		}
		
		return c;
	}

}
