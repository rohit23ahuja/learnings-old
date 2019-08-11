package com.pkg.learn;

class ArraySelect{
	private long[] a;
	private int nElems;
	
	public ArraySelect(int max) {
		a = new long[max];
		nElems=0;
	}
	
	public void insert(long item){
		a[nElems]=item;
		nElems++;
	}
	
	public void display(){
		for (int i = 0; i < nElems; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
	
	public void swap(int index1, int index2){
		long temp = a[index1];
		a[index1]=a[index2];
		a[index2]=temp;
	}
	
	public void selectSort(){
		int out, min, in;
		for (out = 0; out < nElems-1; out++) {
			min=out;
			for (in = out+1; in < nElems; in++) {
				if(a[in]<a[min]) min=in;
			}
			swap(out, min);
		}
	}
}

public class SelectSortApp {
	public static void main(String[] args) {
		ArraySelect arr = new ArraySelect(100);
		arr.insert(97);
		arr.insert(3);
		arr.insert(42);
		arr.insert(13);
		arr.insert(87);
		arr.insert(65);
		arr.insert(23);
		arr.insert(78);
		arr.display();
		arr.selectSort();
		arr.display();
	}
}
