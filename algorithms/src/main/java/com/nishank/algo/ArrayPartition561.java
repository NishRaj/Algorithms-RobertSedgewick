package com.nishank.algo;

import java.util.Arrays;

/*
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer,
 *  say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i 
 *  from 1 to n as large as possible.

Example 1:
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
Note:
n is a positive integer, which is in the range of [1, 10000].
All the integers in the array will be in the range of [-10000, 10000].
 */
public class ArrayPartition561 {

	private int[] arrofIntegers;	
	
	public ArrayPartition561(int [] arrofIntegers){		
		this.arrofIntegers = arrofIntegers;
	}
	public int arrayPairSum() {
		if(arrofIntegers.length % 2 !=0)
			throw new RuntimeException("Length of the array cannot be odd");
		int sum = 0;
	    Arrays.parallelSort(arrofIntegers);	
	    for(int i =0; i < arrofIntegers.length; i++) {
	    	if(i%2==0)
	    		sum += arrofIntegers[i];
	    }
	    return sum;
	}
}
