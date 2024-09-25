package com.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfListConvertintoSingleListUsingFlatmap {
	
	
	public static void main(String[] args) {
		List<List<String>> fruitsLst= 
				Arrays.asList( Arrays.asList("Banana","Mango"),
							   Arrays.asList("WaterMelon","Oranage")
							  );
		
		List<String> lst = fruitsLst.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(""+lst);//[Banana, Mango, WaterMelon, Oranage]
	}

}
