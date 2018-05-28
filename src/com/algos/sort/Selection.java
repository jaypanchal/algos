package com.algos.sort;

public class Selection {

	void sort(int arr[]) {
		
		int length = arr.length;
		
		for(int i = 0; i < length - 1; i++) {
			int min_index = i;
			
			// Move boundary of unsorted subarray
			for(int j = i + 1; j < length; j++) {
				if(arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			
			//Swap the minimum element found from the sub array with the first element of sub array
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
		
	}

	void print(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		Selection selection = new Selection();
		int arr[] = {64, 11, 10};
		
		selection.sort(arr);
		System.out.println("Sorted array :");
		selection.print(arr);
		
	}
}
