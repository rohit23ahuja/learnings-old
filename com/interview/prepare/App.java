package com.interview.prepare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(1);
		numbers.add(5);
		numbers.add(9);
		numbers.add(6);
		numbers.add(10);
		
		countPairs(numbers, 2);
	}
	
	public static int countPairsNew(List<Integer> numbers, int k) {
		int count =0;
		Collections.sort(numbers);
		int l =0;
		int r =0;
		while(r<numbers.size()){
			if (numbers.get(r)-numbers.get(l)==k) {
				count++;
				l++;
				r++;
			}else if(numbers.get(r)-numbers.get(l)>k){
				l++;
			} else {
				r++;
			}
		}
		return count;
	}

	public static int countPairs(List<Integer> numbers, int k) {
		int length = numbers.size();
		if (length<2) {
			return 0;
		}
		if (k<0) {
			return 0;
		}
		// Write your code here
		Collections.sort(numbers);
		if (length==2){
			if (numbers.get(1)-numbers.get(0)==k) {
				return 1;	
			}
			return 0;
		}
		
		int high = length - 1;
		int low = length - 2;
		int count =0;
		long prevHigh=0;
		long prevLow=0;
		while (low >= 0 && high >= 1) {
			long currHigh = numbers.get(high);
			long currLow = numbers.get(low);
			if (prevHigh==currHigh&&prevLow==currLow) {
				low--;
				high--;
				continue;
			}
			if (currHigh-currLow==k) {
				System.out.println(currHigh +" , "+currLow);
				count++;
				low--;
				high--;
			} else if(currHigh-currLow<k) {
				low--;
			} else {
				high--;
			}
			prevHigh=currHigh;
			prevLow=currLow;
		}
		return count;
	}
}
