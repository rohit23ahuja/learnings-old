package com.learn.ds.heap;

public class MaxHeap {
	private int[] items;
	private int nextSlot;
	private int maxSize;

	MaxHeap(int size) {
		items = new int[size];
		nextSlot = 0;
		maxSize = size;
	}

	public void insert(int i) {
		if (nextSlot == maxSize) {
			throw new IllegalStateException();
		}
		int k = nextSlot;
		items[k] = i;
		nextSlot++;
		shiftUp(k);
	}

	private void shiftUp(int k) {
		if (k == 0)
			return;
		int p = (k - 1) / 2;
		if (items[p] > items[k]) {
			return;
		} else {
			swap(p, k);
		}
		k = p;
		shiftUp(k);
	}

	public int delete() {
		int element = items[0];
		nextSlot--;
		items[0] = items[nextSlot];
		items[nextSlot] = 0;
		shiftDown(0);
		return element;
	}

	private void shiftDown(int k) {
		if(k>=maxSize) return;
		int l = 2 * k + 1;
		int r = 2 * k + 2;
		int max=items[r]>items[l]?r:l;
		if (items[k]<items[max]) {
			swap(k, max);
		} else {
			return;
		}
		k=max;
		shiftDown(k);
	}

	private void swap(int p, int k) {
		int temp = items[p];
		items[p] = items[k];
		items[k] = temp;
	}

	public void display() {
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i] + " ");
		}
	}

}
