package com.learn.ds.array;

public class OneDimensionArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 23;
		numbers[1] = 7;
		numbers[2] = 11;
		numbers[3] = 10;
		numbers[4] = 13;
		for(int i=0; i<numbers.length;i++) 
			System.out.println(numbers[i]);
		
		Student[] students = new Student[4];
		students[0] = new Student(1, "rohit");
		students[1] = new Student(2, "deepika");
		students[2] = new Student(3, "harish");
		students[3] = new Student(4, "neena");
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

	}

}
