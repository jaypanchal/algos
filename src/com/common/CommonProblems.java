package com.common;

import java.util.HashMap;
import java.util.HashSet;

public class CommonProblems {

	static final int MAX_CHAR = 256;
	
	//HashMap<K, V>
	public static void main(String[] args) {
		//getOrderOfNumber(12345);
		//System.out.println(9 << 6);
		//System.out.println("power(2, 3) : " + power(2, 8));
		//System.out.println(isArmstrong(153));
		//findFirstRepeatedInteger(new int[]{4,5,3,5,2,5,6,6,7,8});
		findOccurrenceOfCharaters("ssdedrf");
	}
	
	//Remove duplicates from array
	
	//
	static void isPalindromString(String data) {
		
	}
	
	static void chaeckWhetherStringCanContainsPalindromOrNot(String data) {
		
	}
	
	static void fibonacci() {
		
	}
	
	static void isPrime() {
		
	}
	
	static void getFirstNPrime() {
		
	}
	
	static void getPrimeNummbersUptoNth() {
		
	}
	
	static final int MAX_LENGTH = 256;
	static void findOccurrenceOfCharaters(String data) {
		
		int[] count = new int[MAX_LENGTH];
		for(int i = 0; i < data.length(); i++)
			count[data.charAt(i)]++;
		
		char[] ch = new char[data.length()];
		for(int i = 0; i < data.length(); i++) {
			ch[i] = data.charAt(i);
			
			int find = 0;
			for(int j = 0; j <= i; j++) {
				if(data.charAt(i) == ch[j]) {
					find++;
				}
			}
			if(find == 1) {
				System.out.println("Character : " + data.charAt(i) + " found " + count[data.charAt(i)] + " times");
			}
		}
		
	}
		
	static void findFirstRepeatedInteger(int[] data) {
		
		int repeatedNumber = -1;
		
		HashSet<Integer> uniqueData = new HashSet<>();
				
		for(int i = data.length - 1; i >=0; i--) {
			if(uniqueData.contains(data[i])) {
				repeatedNumber = i;
			}else {
				uniqueData.add(data[i]);
			}
		}
		
		if(repeatedNumber != -1) {
			System.out.println("First repeated number is : " + data[repeatedNumber]);
		}else {
			System.out.println("No repeated number");
		}
	}
	
	static boolean isArmstrong(int number) {
		
		int order = getOrderOfNumber(number);
		int temp = number, sum = 0;
		while (temp != 0) {			
			int r = temp % 10;
			sum = sum + power(r,order);
			temp = temp / 10;			
		}
		
		System.out.println(number +": "+ sum);
		if(number == sum) {
			return true;
		}
		return false;
	}
	
	public static int power(int x, int y) {
		
		//System.out.println("y("+y+") % 2 = " + y%2);
		
		if(y == 0) {
			System.out.println("Y is 1");
			return 1;
		}
			
		if(y%2 == 0) {
			//System.out.println("power("+x+", "+y+"/2)*power("+x+", "+y+"/2) : " + power(x, y/2)*power(x, y/2));
			int t = power(x, y/2)*power(x, y/2);
			System.out.println("t : " + t);
			return t;
		}
		//System.out.println("Before return");
		//System.out.println(x+"*"+power(x, y/2)+"*"+power(x, y/2)+" :" + x*power(x, y/2)*power(x, y/2));
		int z = x*power(x, y/2)*power(x, y/2);
		System.out.println("Z : " + z);
		return z;
	}
	
	public static int getOrderOfNumber(int number) {
		
		int order = 0;
		
		while(number != 0) {
			order++;
			
			System.out.println("Modulo :" + number % 10);
			
			number = number / 10;
			System.out.println("Number : " + number + ", order : " + order);
		}
		System.out.println(order);
		
		return order;
	}

}
