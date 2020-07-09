package com.nishank.algo;

public class MergeSortCustom {
	
	private int [] numbers;
	private int[] helper;
	private int number;
	public void sort(int [] arr) {
		numbers = arr;
		number = numbers.length;
		this.helper = new int[number];
		mergeSort(0,number-1);
	}
	public void mergeSort(int low, int high) {
		if(low < high) {
			int mid = low + (high-low)/2;
			mergeSort(low,mid);
			mergeSort(mid+1,high);
			if(numbers[mid] <=numbers[mid+1])
				return;
			merge(low,mid,high);
		}
	}

	/*
	 * public void merge(int low, int mid, int high) {
	 * 
	 * for(int i=low; i<=high; i++) { helper[i] = numbers[i]; } int k = low, l=mid+1
	 * , m = low; while(k<=mid && l<=high) { if(helper[k]<=helper[l]) { numbers[m] =
	 * helper[k]; k++; } else { numbers[m] = helper[l]; l++; } m++; } //copy left
	 * over elements from the lest hand side of the array. while(k<=mid) {
	 * numbers[m] = helper[k]; k++; m++; } }
	 */
	public void merge(int low, int mid, int high) {
		for(int k=low; k<=high; k++) {
			helper[k] = numbers[k];
		}
		int i = low, j = mid+1;
		for(int k=low; k<=high; k++) {
		if(i > mid) 
			numbers[k] = helper[j++];
			else if(j>high)
				numbers[k] = helper[i++];
			else if(helper[i] < helper[j])
				numbers[k] = helper[i++];
			else
				numbers[k] = helper[j++];
		}
	}

}
