package com.nishank.algo;

public class UnionFind {
 private int[] unionFindArr;
 private int count;
 public UnionFind(int N) {
	 count = N;
	 unionFindArr = new int[N];
	 for(int i =0; i < N; i++) {
		 unionFindArr[i] = i;
	 }
 }
  public void connect(int p, int q)  {
	if(!isConnected(p, q)) {
		int temp = unionFindArr[p];
		unionFindArr[p] = unionFindArr[q];
		for(int i =0; i < unionFindArr.length ; i++) {
			if(unionFindArr[i]== temp)
				unionFindArr[i] = unionFindArr[q];
		}
		count--;
	}
  }
 public boolean isConnected(int p, int q) {
	return unionFindArr[p] == unionFindArr[q] ? true : false;
 }
 public int count() {
	 return count;
 }
}
