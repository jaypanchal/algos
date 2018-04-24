package com.test;

public class Insertion {

	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {

			int key = arr[i];
			System.out.println("Key :" + key);

			int j = i - 1;

			// Move elements of arr[0..i-1], that are great, to one position ahead of their
			// current position
			while(j >= 0 && arr[j] > key) {
				
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
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
		
		int arr[] = {12, 11, 13, 5, 6};
		
		Insertion insertion = new Insertion();
		insertion.sort(arr);
		System.out.println("Sorted array :" );
		printArray(arr);
	}
	
}
