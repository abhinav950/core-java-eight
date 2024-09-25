package com.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountEachWordUsingCollectCollectorsGroupingbyFindenttityCcounting {
	public static void main(String[] args) {

		String input = "Java is Java again Java again"; // Count no. of word
		List<String> asList = Arrays.asList(input.toLowerCase().split(" "));
		Map<String, Long> strMap = asList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("" + strMap);
		
	

	}
}
