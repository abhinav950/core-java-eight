package com.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountWordLengthUsingMap {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		List<Integer> collect = words.stream().map(String::length).collect(Collectors.toList());
		System.out.println("-->"+collect);
		
	}

}
