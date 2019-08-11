package com.pkg.learn;

// demonstrates array class with high level interface
class HighArray {
	private long[] a;
	private int nElems;

	public int getNumElems() {
		return nElems;
	}
	
	public HighArray(int max) {
		a = new long[max];
		nElems = 0;
	}

	public boolean find(long searchKey) {
		int j;
		for (j = 0; j < nElems; j++) {
			if (a[j] == searchKey)
				break;
		}	
		if (j == nElems)
			return false;
		else
			return true;
	}

	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}

	public boolean delete(long value) {
		int j;
		for (j = 0; j < nElems; j++)
			if (value == a[j])
				break;
		if (j == nElems)
			return false;
		else {
			for (int k = j; k < nElems; k++) {
				a[k] = a[k + 1];
			}
			nElems--;
			return true;
		}
	}

	public void display() {
		for (int j = 0; j < nElems; j++)
			System.out.println(a[j] + " ");
	}
	
	public long getMax() {
		long max = -1;
		if(nElems == 0) return max;
		else {
			for(int i=0; i < nElems; i++) {
				if(a[i] > max) max = a[i];
			}
		}
		return max;
	}
	
	public long removeMax() {
		long largest = -1;
		if(nElems == 0) return largest;
		else {
			for(int i=0; i<nElems; i++){
				if(a[i] > largest) largest = a[i];
			}
			delete(largest);
			return largest;
		}
	}
	
	public long[] noDups(){
		for (int i = 0; i <nElems; i++) {
			for (int j = i+1; j < nElems; j++) {
				if(a[i]==a[j]) a[j]=-999;
			}
		}
		for (int i = 0; i < nElems; i++) {
			if (a[i]==-999) {
				for (int j = i; j < nElems; j++) {
					a[j]=a[j+1];
				}
				nElems--;
			}
		}
		return a;
	}
	
	public void noDupsAdvanced(){
		int size = nElems-1;
		long value=0;
		for (int i = 0; i <= size; i++) {
			value=a[i];
			for (int j = i+1; j <= size; j++) {
				if (a[j]==value) {
					for (int k = j; k < size; k++) {
						a[k]=a[k+1];
					}
					nElems--;
					j--;
					size--;
					System.out.println("Deleted "+value);
				}
			}
		}
	}
	
	public long getElem(int index){
		return a[index];
	}
}

class HighArrayApp {
	public static void main(String[] args) {
		int maxSize=100;
		HighArray arr;
		arr = new HighArray(maxSize);
	
		arr.insert(23);	
		arr.insert(2);
		arr.insert(23);
		arr.insert(6);
		arr.insert(23);
		arr.insert(12);
		arr.insert(23);
		arr.insert(19);
		arr.insert(23);

		
		arr.noDupsAdvanced();
		arr.display();
		System.out.println(arr.getElem(5)+"23 is still present at the last");
		
		/*arr.display();
		
		System.out.println("Largest Element "+arr.getMax());
		System.out.println("Now Sorting array backwards");
		HighArray arrInverse = new HighArray(arr.getNumElems());
		while(arr.getNumElems()!=0){
			long max = arr.removeMax();
			arrInverse.insert(max);
		}
		arrInverse.display();*/
	}
}