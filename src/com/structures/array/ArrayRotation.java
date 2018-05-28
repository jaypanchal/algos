package com.structures.array;

import java.util.Arrays;

public class ArrayRotation {

	public void rotateArray(int array[], int rotateBy, int length) {
		int i = 0;
		int temp = array[i];
		for(i = 0; i < ((array.length-1) - rotateBy); i++) {
			array[i] = array[i + ((array.length -1) - rotateBy)];
		}
		array[i] = temp;
		
		System.out.println("array :" + Arrays.toString(array));
	}
	
	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5,6};
		int rotateBy = 2;
		int length = array.length;
		
		ArrayRotation arrayRotation = new ArrayRotation();
		//arrayRotation.rotateArray(array, rotateBy, length);
		
		//reverse 
		arrayRotation.rotateArrayUsingReverse(array, rotateBy, length);
	}

	public void rotateArrayUsingReverse(int array[], int rotateBy, int length) {
		
		//reverseArray(array, 0, rotateBy-1);
		partialReverse(array, 0, rotateBy-1);
		System.out.println("Reverse Stage 1 :" + Arrays.toString(array));
		partialReverse(array, rotateBy, length-1);		
		System.out.println("Reverse Stage 2 :" + Arrays.toString(array));
		partialReverse(array, 0, length-1);
		System.out.println("Reverse State 3 :" + Arrays.toString(array));
	}
	
	static public void reverseArray(int array[], int startIndex, int endIndex) {
		
		int length = array.length;
		int _array[] = new int[length];
		
		for(int i = length-1 ; i >= 0; i--) {
			_array[(length - 1) - i] = array[i]; 
		}
		System.out.println("Reverse :" + Arrays.toString(_array));
	}
	
	static void partialReverse(int array[], int startIndex, int endIndex) {
		
		int temp;
		while(startIndex < endIndex) {
			temp = array[startIndex];
			array[startIndex] = array[endIndex];
			array[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
	}
	
	static void rotateArrayWithJugglingMethod(int[] array, int rotateBy) {
		int length = array.length;
		int i, j, k, temp;
		for(i = 0; i < getGCD(rotateBy, length); i++) {
			temp = array[i];
			j = i;
			
			while(true) {
				k = j + rotateBy;
				if(k >= length) {
					k = k - length;
				}
				if (k == i) {
					break;
				}
				array[j] = array[k];
				j = k;
			}
		}
		
	}
	
	static void juggleAndRotateArray(int array[], int rotateBy) {
		
	}
	
	
	static int getGCD(int x, int y) {
		if(y == 0) {
			return x;
		}else {
			return getGCD(y, x % y);
		}
	}
}
