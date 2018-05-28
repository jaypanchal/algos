package com.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.format.DecimalStyle;
import java.util.Arrays;

class Test2{
	
	public Test2 test() {
		return this;
	}
}

class FindOccurrence{
	
}

public class Test extends Test2{

	static void getOccurringChar(String str) {
		int count[] = new int[256];
		
		int length = str.length();
		
		for(int i = 0; i < length; i++) {
			char ch = str.charAt(i);			
			int  d = count[ch]++;
			
		}
		System.out.println(Arrays.toString(count));
		
		char ch[] = new char[str.length()];
		for(int i = 0; i < length; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			
			for(int j = 0; i <= i; j++) {
				if(str.charAt(i) == ch[j]) {
					find++;
				}
			}
			
			if(find == 1) {
				System.out.println("Occ of " + str.charAt(i) + " is : " + count[str.charAt(i)]);
			}
			
		}
		
	}
	
	@Override
	public Test test() {
		
		return this;
	}
	
	String d = "1";
	
	public static String refactorColumnName(String columnName) {
		String characterRestrictions = "[\\s\\.,;{}()\\n\\t=%\\*/$@#\\^\\+&\\[\\]'\"\\\\:!~`?<>|]";
		try {
			columnName = columnName.replaceAll("%", "PER");			
			columnName = columnName.replaceAll(characterRestrictions, "_");
			columnName = columnName.replaceAll("_{2,}", "_");
			columnName = columnName.replaceAll("_$", "");
		}catch (Exception e) {
			System.out.println(e);
			columnName = columnName.replaceAll(" ", "_");
		}
		System.out.println("Col: "+ columnName);
		return columnName;
	}
	
	private static void splitter(Object data) {
		if(data instanceof Number) {
			if(data.toString().indexOf(".") > 0) {
				String _data[] = data.toString().split(".");
				
			}
		}
	}
	
	public static void main(String[] args) {
		
		getOccurringChar("ABCDEFGH");
		/*String data = "qq";
		int[] d = new int[4];
		
		for(int i = 0; i < 4; i++) {
			d[data.charAt(i)]++;
			System.out.println(Arrays.toString(d));
		}
		System.out.println(Arrays.toString(d));*/
		//refactorColumnName("A@$&+=*({!=%.5|^#(//;,\\\",;[]{}:'!~`?<>X||Z!@#Aa_");
		
		/*
		double m = 0.000000012d;
		*//*
		DecimalFormat decimalFormat = new DecimalFormat("#");
		decimalFormat.setMaximumFractionDigits(DecimalFormat);
		System.out.println(decimalFormat.format(m));*/
		/*int arr[] = {11, 30, 12, 40};
		int k = 12;
		
		int n = arr.length;
		
		System.out.println(k +" present at arr[" + search(arr, n, k) + "] position");*/
		
		//test(214);
		
		//void2(10L, 0);
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