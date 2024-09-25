package com.interview.asked;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BatMatCat {
	
	public static void main(String[] args) {
		
		List<String> sentences = Arrays.asList(
				"batty is flying",
				"mattty is on the floor",
				"doggy is barking");
		
		
		List<String> replacedSentences = sentences.stream()
				.map(sentence -> {
					if (sentence.startsWith("batty")) {
						return sentence.replaceFirst("batty", "bat");
					} else if (sentence.startsWith("bat")) {
						return sentence.replaceFirst("bat", "mat");
					} else if (sentence.startsWith("mat")) {
						return sentence.replaceFirst("mat", "bat");
					} else {
						return sentence;
					}
				})
				.collect(Collectors.toList());
		
		replacedSentences.forEach(System.out::println);
	}
	
}

