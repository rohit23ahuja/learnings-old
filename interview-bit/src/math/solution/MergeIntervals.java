package math.solution;

import java.util.ArrayList;

public class MergeIntervals {
	public static void main(String[] args) {
		ArrayList<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(1, 2));
		intervals.add(new Interval(3, 5));
		intervals.add(new Interval(6, 7));
		intervals.add(new Interval(8, 10));
		intervals.add(new Interval(12, 16));
		Interval newInterval = new Interval(4, 9);
		System.out.println(insert(intervals, newInterval));
	}

	public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		for (int i = 0; i < intervals.size()-1; i++) {
			Interval interval = intervals.get(i);
			if (newInterval.start>interval.start && newInterval.start<interval.end) {
				int tempStart = Math.min(interval.start, newInterval.start);
				int tempEnd = Math.max(interval.end, newInterval.end);
				intervals.set(i, new Interval(tempStart, tempEnd));
				newInterval = interval;
			}
		}

		return intervals;
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
