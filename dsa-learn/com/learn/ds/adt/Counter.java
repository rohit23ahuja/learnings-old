package com.learn.ds.adt;

public class Counter {
	private int counter;
	private String counterName;
	public Counter(String str) {
		this.counterName = str;
		this.counter = 0;
		System.out.println("New Counter initialized with name - "+ this.counterName +", Initial Value - "+counter);
	}
	
	public void increment(){
		counter++;
	}
	
	public int getCurrentValue(){
		return counter;
	}

	@Override
	public String toString() {
		return "Counter [counter=" + counter + ", counterName=" + counterName + "]";
	}

}
