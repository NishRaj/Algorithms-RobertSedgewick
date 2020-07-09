package com.nishank.algo;

public class Fibonacci {

	private int N;
	private int DEF_N = 100;
	private int[] fibArray;

	Fibonacci(int N) {
		this.N = N;
		fibArray = new int[N];
	}

	Fibonacci() {
		N = DEF_N;
		fibArray = new int[N];
	}

	public int[] fibSeries() {
		if (N == 0)
			throw new ArrayIndexOutOfBoundsException(N);			
		if (N == 1) {
			fibArray[0] = 0;
		} else if(N==2) {
			fibArray[0] = 0;
			fibArray[1] = 1;
		}
		else {
			fibArray[0] = 0;
			fibArray[1] = 1;
			for (int i = 2; i < N; i++) {
				fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
			}
			
		}
		return fibArray;
	}
	
}
