package com.algos.search;

public class BinarySearch {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		BinarySearch binarySearch = new BinarySearch();
		int index = binarySearch.searchElementRecursively(10, 0, arr.length - 1, arr);
		System.out.println("Data present at index : " + index);
	}

	public int searchElementRecursively(int x, int low, int high, int[] arr) {
		if (high >= low) {
			// Optimize this to... low + (high - low) / 2
			int mid = low + (high - low) / 2; // (low + high) / 2;

			if (arr[mid] == x)
				return mid;

			if (arr[mid] < x)
				return searchElementRecursively(x, mid + 1, high, arr);

			if (arr[mid] > x)
				return searchElementRecursively(x, low, mid - 1, arr);
		}
		return -1;
	}

	public int searchElementItervatively(int x, int low, int hight, int[] arr) {

		while (hight >= low) {
			int mid = low + (hight - low) / 2;
			
			if(arr[mid] == x)
				return mid;
			
			if(arr[mid] < x)
				low = mid + 1;
			
			if(arr[mid] > x)
				hight = mid - 1;

		}

		return -1;
	}
}
