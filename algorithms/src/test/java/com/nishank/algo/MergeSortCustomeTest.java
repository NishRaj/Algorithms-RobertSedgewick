package com.nishank.algo;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MergeSortCustomeTest {
	
	private int[] arr;
	@BeforeEach
	public  void init() {
		//arr = new int[] {5,4,3,6,7,1,4,2,3};
		arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
	}
	@Test
	public void TestSort() { 
		 MergeSortCustom ms = new MergeSortCustom();
		// MergeSort ms = new MergeSort();
		 ms.sort(arr);
		 System.out.println(Arrays.toString(arr));
         Assertions.assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, arr);
}
}
