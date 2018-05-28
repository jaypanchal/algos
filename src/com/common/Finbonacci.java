package com.common;

import com.test.Test;

public class Finbonacci extends Test{

	static int element0 = 0;
	static int element1 = 1;
	static int elementN;
	
	static String data1 = "Data1";
	String data2 = "Data2";
		
	void display() {		
		data1 = "1";
		Finbonacci finbonacci = new Finbonacci();
		finbonacci.data2 = data1;
	}
	
	static void displayOhm() {		
		data1 = "1";
		Finbonacci finbonacci = new Finbonacci();
		finbonacci.data2 = data1;
	}
	
	void testMethod() {
		this.display();		
	}
	
	public static void main(String[] args) {
		
		//Without Recursion
		/*int element0 = 0;
		int element1 = 1;
		int elementN;
		int count = 10;
		
		
		System.out.print(element0 + " " + element1);
		
		for(int i = 2; i < count; i++){
			
			elementN = element0 + element1;
			
			System.out.print(" " + elementN);
			
			element0 = element1;
			element1 = elementN;
		}*/
		
		//With Recursion
		
		//int count = 10;
		
		//System.out.print(element0 + " " + element1);
				
		//printFibonacciSeries(count-2);
		
		/*if(isPrimeNumber(number)){
			System.out.println("Yes it is..");
		}else{
			System.out.println("No it's not...");
		}*/
		
		//isPrimeNumber(100);
				
		//isPalindromeNumber(121321);
		
		//isArmstrongNumber(372);
		
		Finbonacci finbonacci = new Finbonacci();
		System.out.println(finbonacci);
	}
	
	public static void isArmstrongNumber(int number) {
		
		int temp = number;		
		int remainder;		
		int sum = 0;
		
		while(temp > 0) {
			
			remainder = temp % 10;			
			sum = sum + ( remainder * remainder * remainder);			
			temp = temp / 10;			
		}
		
		if(sum == number) {
			System.out.println("Damn! Yeah...");
		}else {
			System.out.println("Oh! No...");
		}
	}
	
	public static void isPrimeNumber(int number){
	
		for(int i = 1; i <= number; i++){
			
			boolean isPrime = true;			
			for(int j = 2; j <= i/2; j++){
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			
			if(isPrime){
				System.out.print(" " + i);
			}
		}		
	}
	
	public static void printFibonacciSeries(int count) {

		if (count > 0) {

			elementN = element0 + element1;

			System.out.print(" " + elementN);

			element0 = element1;
			element1 = elementN;

			count--;

			printFibonacciSeries(count);

		}
	}
	
	public static boolean isPalindromeNumber(int number){
		
		int remainder;
		int sum = 0;
		int temp;
		
		temp = number;		
		while (number > 0) {			
			remainder = number % 10;									
			sum = (sum * 10) + remainder;						
			number = number / 10;
		}
		
		if(temp == sum) {
			System.out.println("It's palindrome");
		}else {
			System.out.println("It's not palindrome");
		}
		
		return false;
	}

}


