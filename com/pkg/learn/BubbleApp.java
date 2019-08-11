package com.pkg.learn;

class ArrayBub {
	private long[] a;
	private int nElems;
	
	public ArrayBub(int max) {
	a = new long[max];
	nElems = 0;
	}
	
	public void insert(long item){
		a[nElems] = item;
		nElems++;
	}
	
	public void swap(int index1, int index2){
		long temp = a[index1];
		a[index1]=a[index2];
		a[index2]=temp;
	}
	
	public void bubbleSort() {
		int out, in;
		for(out = nElems-1;out>0;out--) {
			for(in=0; in<out;in++){
				if(a[in]>a[in+1]) swap(in, in+1);
			} 
		}
	}
	
	public void biDirBubbleSort(){
		int outBottom=0;
		int outTop=nElems-1;
		int in;
		while(outBottom<outTop){
			for(in=outBottom;in<outTop;in++){
				if(a[in]>a[in+1]) swap(in,in+1);
			}
			outTop--;
			for(in=outTop;in>outBottom;in--){
				if(a[in-1]>a[in])swap(in-1,in);
			}
			outBottom++;
			display();
		}
	}
	
	public void oddEvenSort(){
		boolean sorted=false;
		while(!sorted){
			sorted=true;
			for(int i=0;i<nElems-1;i+=2){
				if(a[i]>a[i+1]) {
					swap(i,i+1);
					sorted=false;
				}
			}
			for (int i=1; i<nElems-1;i+=2) {
				if(a[i]>a[i+1]){
					swap(i,i+1);
					sorted=false;
				}
			}
		}

	}
	
	public void display(){
		for (int i = 0; i < nElems; i++) 
			System.out.print(a[i]+" ");
		System.out.println("");
		
	}
}
public class BubbleApp {
	public static void main(String[] args) {
		ArrayBub array1 = new ArrayBub(100);
		array1.insert(3);
		array1.insert(59);
		array1.insert(32);
		array1.insert(17);
		array1.insert(47);
		array1.insert(26);
		array1.display();
		System.out.println("Starting bi directional bubble sort");
		//array1.bubbleSort();
		array1.biDirBubbleSort();
	
	}
	
}
