package learn.twod.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RangeSearch {

	public static void main(String[] args) {
		Integer[] arr = {3,5,7,7,8,8,8,8,8,8,8,8,8,8,8,8,10};
		List<Integer> A = Arrays.asList(arr);
		RangeSearch rs = new RangeSearch();
		System.out.println(rs.searchRange(A, 8));
	}
	
	
    public ArrayList<Integer> searchRange(final List<Integer> A, int num) {

    	ArrayList<Integer> searchRange = new ArrayList<>();
		if (A.size()==1 && A.get(0)==num) {
    		searchRange.add(0);
    		searchRange.add(0);
    		return searchRange;				
		}
    	int lowerBound =0;
    	int upperBound = A.size()-1;
    	int firstIdx = findFirstIdx(A, num, lowerBound, upperBound);

    	if (firstIdx==-1) {
			searchRange.add(-1);
			searchRange.add(-1);
			return searchRange;
		} else {
			int endIdx = findEndIdx(A, num, lowerBound,upperBound);
			if (endIdx==-1) endIdx =firstIdx;
			searchRange.add(firstIdx);
			searchRange.add(endIdx);
		}

    	return searchRange;
    }
	
    private int findEndIdx(List<Integer> a, int num, int lowerBound, int upperBound) {
    	int idx =-1;
    	while(lowerBound<=upperBound){
    		int mid = (lowerBound+upperBound+1)/2;
    		if (a.get(mid)==num) {
				idx=mid;
				if (idx==a.size()-1) {
					return idx;
				}
				if (a.get(idx+1)==num) {
					idx=idx+1;
					int value = findEndIdx(a, num, idx+1, upperBound);
					if (value!=-1) {
						return value;
					} else {
						return idx;
					}
				}
				if (a.get(idx+1)>num) {
					return idx;
				}
			} else if(a.get(mid)>num) {
				upperBound=mid-1;
			} else {
				lowerBound=mid+1;
			}
    	}
    	return idx;
	}


	private int findFirstIdx(List<Integer> a, int num, int lowerBound, int upperBound) {
    	int idx =-1;
    	while(lowerBound<=upperBound){
    		int mid = (lowerBound+upperBound+1)/2;
    		if (a.get(mid)==num) {
				idx=mid;
				if (idx==0) {
					return idx;
				}
				if (a.get(idx-1)==num) {
					idx = idx-1;
					int value = findFirstIdx(a, num, lowerBound, idx-1);
					if (value!=-1) {
						return value;
					} else {
						return idx;
					}
					
				}
				if (a.get(idx-1)<num) {
					return idx;
				}
			} else if(a.get(mid)>num) {
				upperBound=mid-1;
			} else {
				lowerBound=mid+1;
			}
    	}
		return idx;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	public ArrayList<Integer> searchRangeOld(final List<Integer> A, int num) {

    	ArrayList<Integer> searchRange = new ArrayList<>();
		if (A.size()==1 && A.get(0)==num) {
    		searchRange.add(0);
    		searchRange.add(0);
    		return searchRange;				
		}
    	int lowerBound =0;
    	int upperBound = A.size()-1;
    	int idx = findIdx(A, num, lowerBound, upperBound);
    	if (idx==-1) {
    		searchRange.add(-1);
    		searchRange.add(-1);
    		return searchRange;
		}
    	return searchRange;
    }

	private int findIdx(final List<Integer> A, int num, int lowerBound, int upperBound) {
		int idx =-1;
    	while(lowerBound<=upperBound){
    		int mid = (upperBound+lowerBound+1)/2;
    		if (A.get(mid)==num) {
				idx = mid;
				
			} else if (A.get(mid)>num) {
				upperBound = mid-1;
			} else {
				lowerBound = mid+1;
			}
    	}
		return idx;
	}
}
