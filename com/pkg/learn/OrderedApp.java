package com.pkg.learn;

class OrdArray{
	private long[] a;  //ref to array a
	private int nElems;  //number of data items
	public OrdArray(int max) {  //constructor
		a = new long[max]; //create array
		nElems = 0;
	}
	public int size() {
		return nElems;
	}
	
	public long getElem(int index){
		return a[index];
	}
	
	public int find(long searchKey) {
		int lowerBound=0;
		int upperBound=nElems-1;
		int curIn;
		while(true) {
			curIn = (lowerBound + upperBound)/2;
			if(a[curIn]==searchKey)
				return curIn;  //found it
			else if(lowerBound > upperBound)
				return nElems; //cant find it
			else {   //divide range
				if(a[curIn]<searchKey)
					lowerBound = curIn+1;
				else 
					upperBound = curIn-1;
			}
		}
	}
	
	public void insertLinerSearch(long value) { //put element into array
		int j;
		for(j=0; j<nElems; j++)    //find where it goes
			if(a[j]>value)   //linear search
				break;
		for(int k=nElems; k>j; k--) //move bigger ones up
			a[k] = a[k+1];
		a[j] = value;
		nElems++;
	}
	
	public void insert(long value) {
		int lowerBound=0;
		int upperBound=nElems-1;
		int j=0;
		while(true){
			if(lowerBound>upperBound) break;
			j=(lowerBound+upperBound)/2;
			if(a[j]<value) {
				lowerBound=j+1;
				j++;
			}else {
				upperBound=j-1;
			}
		}
		for (int i = nElems; i > j; i--) 
			a[i] =a[i-1];
		a[j]=value;
		nElems++;
		
	}
	
	public boolean delete(long value) {
		int j = find(value);
		if(j==nElems)      //cant find it
			return false;
		else {             //found it
			for(int k=j; k<nElems; k++)  //move bigger ones down
				a[k]=a[k+1];
			nElems--;         //decrement size
			return true;
		}
	}
	
	public void display() {
		for(int j=0; j<nElems; j++)     //for each element
			System.out.println(a[j]+" ");    //display it
	}
	
	public void mergeOld(OrdArray a, OrdArray b){
		OrdArray c = new OrdArray(400);
		for (int i = 0; i < a.size(); i++) {
			long elemToInsert = a.getElem(i);
			for (int j = 0; j < b.size(); j++) {
				if(b.getElem(j)<elemToInsert) {
					c.insert(b.getElem(j));
				} 
			}
			c.insert(elemToInsert);
		}
		for(int j=0; j<c.size(); j++)     //for each element
			System.out.println(c.getElem(j)+" ");    //display it
	}
	
	public long getValueAt(int index){
		return a[index];
	}
	
	public void setValueAt(int index, long value){
		a[index]=value;
	}
	
	public static OrdArray merge(OrdArray a, OrdArray b){
		int length=a.size()+b.size();
		OrdArray c = new OrdArray(length*2);
		int i=0, j=0, k=0;
		while(j<a.size()&&k<b.size()){
			if(a.getValueAt(j)<=b.getValueAt(k)){
				c.setValueAt(i, a.getValueAt(j));
				j++;
			} else {
				c.setValueAt(i, b.getValueAt(k));
				k++;
			}
			i++;
		}
		while(j<a.size()){
			c.setValueAt(i, a.getValueAt(j));
			c.nElems++;
			i++;
			j++;
		}
		while(k<b.size()){
			c.setValueAt(i, b.getValueAt(k));
			k++;
			i++;
			c.nElems++;
		}
		return c;
	}
}

class OrderedApp {
	public static void main(String[] args) {
		int maxSize=100;
		long random=0;
		OrdArray arr = new OrdArray(maxSize);
		for (int i = 0; i < 45; i++) {
			random=(long)(Math.random()*200);
			arr.insert(random);
		}
		System.out.print("Array 1:");
		arr.display();
		
		OrdArray arr2= new OrdArray(maxSize);
		for (int i = 0; i < 15; i++) {
			random=(long)(Math.random()*200);
			arr2.insert(random);
		}
		System.out.println("Array 2:");
		arr2.display();
		
		OrdArray arr3= OrdArray.merge(arr, arr2);
		System.out.print("Array3 :");
		arr3.display();
	}
}