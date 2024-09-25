package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharInWordCharsMapToObjCollectCollectorsGroupingbyFunctionIdentityCcounting {
	
	
	public static void main(String[] args) {
		
	String input = "Java is Java again Java again";
	
	Map<Character, Long> collect = input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(""+collect);	
		
		
	}

}
