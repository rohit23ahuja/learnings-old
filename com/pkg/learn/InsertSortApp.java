package com.pkg.learn;

public class InsertSortApp {

	public static void main(String[] args) {
		int maxSize = 100;
		ArrayInsert arr;
		arr = new ArrayInsert(maxSize);

		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);

		arr.display();

		arr.insertionSort();
		arr.display();
	}
}

class ArrayInsert {
	private long[] a;
	private int nElems;

	public ArrayInsert(int max) {
		a = new long[max];
		nElems = 0;
	}

	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}
	
	public long getItem(int index){
		return a[index];
	}

	public void display() {
		for (int j = 0; j < nElems; j++) {
			System.out.print(a[j] + " ");
			System.out.println("");
		}
	}
	
	public int getSize(){
		return nElems;
	}



	public long median() {
		ArrayInsert tempArray = new ArrayInsert(getSize());
		for (int i = 0; i < nElems; i++) {
			tempArray.insert(a[i]);
		}
		tempArray.insertionSort();
		if (tempArray.getSize() % 2 == 0) {
			int temp = tempArray.getSize() / 2;
			return (tempArray.getItem(temp) + tempArray.getItem(temp-1))/2;
		} else {
			return tempArray.getItem(tempArray.getSize()/2);
		}
	}
	
	public void noDups(){
		insertionSort();
		int total=nElems;
		long curNum=0;
		int shiftAmount=0;
		for (int i = 0; i < total; i++) {
			if (a[i]==curNum) {
				shiftAmount++;
				nElems--;
			} else {
				curNum=a[i];
				a[i-shiftAmount]=a[i];
			}
		}
	}
	
	public void insertionSort() {
		int in, out;
		long temp;
		for (out = 1; out < nElems; out++) {
			temp = a[out];
			in = out;
			while (in > 0 && a[in - 1] >= temp) {
				a[in - 1] = a[in];
				--in;
			}
			a[in] = temp;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void insertionSortRemoveDups(){
		int in,out;
		long temp;
		int nDups=0;
		for(out=1;out<nElems;out++){
			temp=a[out];
			in=out;

			while(in>0&&a[in-1]>=temp){
				if(a[in-1]==temp){
					temp=-1;
					nDups++;
				}
				a[in]=a[in-1];
				--in;
			}
			a[in]=temp;
		}
		if(nDups!=0){
			for (int i = nDups; i < nElems; i++) {
				a[i-nDups]=a[i];
			}
		}
	}


}