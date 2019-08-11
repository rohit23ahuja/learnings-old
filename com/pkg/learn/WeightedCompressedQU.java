package com.pkg.learn;

public class WeightedCompressedQU {
	private int[] id;
	private int[] sz;

	public WeightedCompressedQU(int N) {
		id = new int[N];
		sz = new int[N];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
			sz[i] = 1;
		}
	}

	private int root(int i) {
		while (i != id[i])
			id[i] = id[id[i]];
			i = id[i];
		return i;
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	public int find(int p) {
		int root = p;
	    while (root != id[root])
	    	root = id[root];
	    while (p != root) {
	        int newp = id[p];
	        id[p] = root;
	        p = newp;
	    }
	    return root;
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
