package com.test;

public class Reverse {

	static String data = "My Name is Jay Panchal";
	
	//Pattern : "yM emaN si yaJ lahcnaP"
	//Pattern : "Reverse whole sentence"
	//Pattern : "Reverse sentence without reversing words
	
	
	public static void main(String[] args) {
		reverseSentense(data);
	}
	
	public static void reverseSentense(String data) {
		
		String[] datas = data.split(" ");
		System.out.println("trace");
		String revrse = "";
		for(int i = 0; i < datas.length; i++) {
			String word = datas[i];
			for(int j = word.length() - 1; j <=0 ; j--) {
				revrse = revrse + word.charAt(j);
			}
		}
		System.out.println("Reverse: " + revrse);
	}
	
}
