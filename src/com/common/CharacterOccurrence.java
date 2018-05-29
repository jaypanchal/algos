package com.common;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class CharacterOccurrence implements Comparator{

	Map<String, Integer> characterCountContainer = new TreeMap<>();
	
	public static void main(String[] args) {
		CharacterOccurrence characterOccurrence = new CharacterOccurrence();
		characterOccurrence.printCharacterOccurrance("ssdfff");
		
	}
	
	public void printCharacterOccurrance(String data) {
		
		char[] charArray = data.toCharArray();
		
		for(int i = charArray.length - 1; i >= 0; i--) {
			if(!characterCountContainer.containsKey(String.valueOf(charArray[i]))) {
				characterCountContainer.put(String.valueOf(charArray[i]), 1);
			}else {
				characterCountContainer.put(String.valueOf(charArray[i]), characterCountContainer.get(String.valueOf(charArray[i])) + 1);
			}
		}
		
		System.out.println(characterCountContainer);
		sortByValue(characterCountContainer);
	}

	
	public static void sortByValue(Map<String, Integer> map) {
		
		TreeSet<Map.Entry<String, Integer>> treeMap = new TreeSet<>(new CharacterOccurrence());
		treeMap.addAll(map.entrySet());
		
		System.out.println(treeMap);
		LinkedHashMap<String, Integer> d = new LinkedHashMap<>();
		treeMap.forEach(f -> d.put(f.getKey(), f.getValue()));
		System.out.println(d);
	}

	@Override
	public int compare(Object o1, Object o2) {
		
		return (((Map.Entry<String, Integer>) o1).getValue()).compareTo(((Map.Entry<String, Integer>) o2).getValue()); 
	}
	
}
