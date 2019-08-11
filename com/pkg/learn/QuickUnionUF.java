package com.pkg.learn;
/**
 * @author deepikaahuja
 *
 */
public class QuickUnionUF {

	private int[] id;

	/**
	 * Constructor is parameterized to created an array data structure of
	 * integer passed into it.Ï Create the array and set each element in array
	 * with its own index value.Ï
	 * 
	 * @param N
	 */
	public QuickUnionUF(int N) {
		id = new int[N];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
		}
	}

	/**
	 * This method is used to find the root of a given element. We do this by
	 * comparing the value at the specified index with passed value. If they are
	 * equal that means is the root. If not we replace the passed integer with
	 * the value at this index and we do this until the value at passed index is
	 * equal to passed index.
	 * 
	 * @param i
	 * @return
	 */
	private int root(int i) {
		while (i != id[i])
			i = id[i];
		return i;
	}

	/**
	 * Utilize the root method implementation if the root of two elements is
	 * same then they are connected.
	 * 
	 * @param p
	 * @param q
	 * @return
	 */
	public boolean connection(int p, int q) {
		return root(p) == root(q);
	}

	/**
	 * If we are to connect two elements that are passed in this method. for ex
	 * - 3 and 8. what we do is we set the value at index 3 to the value at
	 * index 8. so that the root of index 8 is now also the root of index 3.
	 * 
	 * @param q
	 */
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}
}
