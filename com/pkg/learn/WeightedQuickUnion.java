package com.pkg.learn;

/**
 * Using Weighted Union-find algorithm it is guaranteed that the depth of any node is atmost log to the base 2 of N.Ï` 
 * 
 * @author deepikaahuja
 *
 */

public class WeightedQuickUnion {

	private int[] id;
	private int[] sz;

	public WeightedQuickUnion(int N) {
		id = new int[N];
		sz = new int[N];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
			sz[i] = 1;
		}
	}

	private int root(int i) {
		while (i != id[i]) {
			i = id[i];
		}
		return i;
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	public void union(int p, int q) {
		int proot = root(p);
		int qroot = root(q);
		if (proot == qroot)
			return;
		if (sz[proot] < sz[qroot]) {
			id[proot] = qroot;
			sz[qroot] += sz[proot];
		} else {
			id[qroot] = proot;
			sz[proot] += sz[qroot];
		}
	}
}
