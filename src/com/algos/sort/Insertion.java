package com.algos.sort;

public class Insertion {

	void sort(int arr[]) {
		
		int length = arr.length;
		
		// 
		for(int i = 1; i < length; i++) {
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1 ] = key;
			printArray(arr);
		}
	}
	
	static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int arr[] = {12, 5, 11, 6, 13,  0};
		
		Insertion insertion = new Insertion();
		insertion.sort(arr);
		System.out.println("Sorted array :" );
		printArray(arr);
	}
	
}
