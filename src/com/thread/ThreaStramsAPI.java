package com.thread;

import java.util.Arrays;
import java.util.List;

public class ThreaStramsAPI {
	
	public static void main(String[] args) {
		
		List<Integer>  lstIntegers= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		lstIntegers.parallelStream().filter(i->i%2==0).forEach(System.out::println);
		
		
		
	}

}
