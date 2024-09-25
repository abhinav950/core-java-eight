package com.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharEntrySetStreamFilterMapFindFirst {
	
	private static Character findFirstNonRepeatedChar(String input) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for (char c : input.toCharArray()) {
			if (map.get(c) == 1) {
                return c;
            }
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		 	String input = "swiss";
	        Character result = findFirstNonRepeatedChar(input);
	        System.out.println("result:->"+result);
	        
	        
	       
	        
	        input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst();
	        
	}

	

}
