package com.algos.search;

public class Binary {

	int sort(int arr[],int searchStartIndex, int searchEndIndex, int searchElement){
		if(searchEndIndex >= searchStartIndex) {
			
			int middleIndex = searchStartIndex + (searchEndIndex - searchStartIndex) / 2;
			System.out.println("Middle index : " + middleIndex + ", value : " + arr[middleIndex]);
			//
			if(searchElement == arr[middleIndex]) {
				return middleIndex;
			}
			
			if(arr[middleIndex] > searchElement) {
				sort(arr, searchStartIndex, middleIndex - 1, searchElement);
			}else {
				sort(arr, middleIndex + 1, searchEndIndex, searchElement);
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10, 1, 12, 13};
		int middleIndex = 0 + ((arr.length - 1) - 0) / 2;
		System.out.println("Middle index : " + middleIndex + ", value : " + arr[middleIndex]);
	}
}
