package interviewbit.solutions.array.twod;

import java.util.ArrayList;

public class OverlappingIntervals {
	public static void main(String[] args) {
		ArrayList<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(1, 2));
		intervals.add(new Interval(3, 5));
		intervals.add(new Interval(6, 7));
		intervals.add(new Interval(8, 10));
		intervals.add(new Interval(12, 16));
		
		//intervals.add(new Interval(3, 6));
		//intervals.add(new Interval(8, 10));

		Interval newInterval = new Interval(4, 9);
		OverlappingIntervals i = new OverlappingIntervals();
		i.insert(intervals, newInterval);
	}

	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		ArrayList<Interval> output = new ArrayList<>();
		Integer start = newInterval.start;
		Integer end = newInterval.end;
        if (intervals.size()<1){
            output.add(newInterval);
            return output;
          } 
		for (int i = 0; i < intervals.size(); i++) {
			Interval interval = intervals.get(i);
			if (interval.start<newInterval.start&&interval.end<newInterval.start) {
				output.add(interval);
			} else if (interval.start>newInterval.start&&interval.start>newInterval.end) {
				output.add(interval);
			} else {
				start = Math.min(interval.start, start);
				end = Math.max(interval.end, end);
			}
		}
        for (int i = output.size()-1; i >= 0; i--) {
            Interval interval = output.get(i);
            if (interval.start<start) {
                output.add(i+1,new Interval(start, end));
                start =null;
                end=null;
                break;
            }
        }
        if(start!=null && end!=null) output.add(0, new Interval(start, end));
		return output;
	}

}

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}

	@Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}
	
}
