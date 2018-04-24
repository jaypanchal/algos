package com.test;

class Test2{
	
	public Test2 test() {
		return this;
	}
}

public class Test extends Test2{

	@Override
	public Test test() {
		
		return this;
	}
	
	String d = "1";
	
	public static void main(String[] args) {
		
		/*int arr[] = {11, 30, 12, 40};
		int k = 12;
		
		int n = arr.length;
		
		System.out.println(k +" present at arr[" + search(arr, n, k) + "] position");*/
		
		test(214);
		
		void2(10L, 0);
	}
	
	static void void2(int d1, long d2) {
		
	}
	
	static void void2(long d1, int d2) {
		
	}
	
	static void test(long d) {
		System.out.println(d);
	}
	
	static int search(int arr[], int n, int k){
		int i;
		
		for(i=0; i<n; i++){
			if(arr[i] == k){
				return i;
			}
		}
		
		return -1;
	}
}