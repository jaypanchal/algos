package com.common;

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
		String reverse = "";
		for(int i = 0; i < datas.length; i++) {
		//for(int i = datas.length -1; i >= 0; i--) {
			String word = datas[i];
			for(int j = word.length() - 1; j >= 0  ; j--) {
				reverse = reverse + word.charAt(j);
			}
			reverse += " ";
		}
		System.out.println("Reverse: " + reverse);
	}
	
}
