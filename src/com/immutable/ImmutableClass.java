package com.immutable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ImmutableClass {
	
	private final String name;
    private final int regNo;
    private final Map<String, String> metadata;
    
    
	public ImmutableClass(String name, int regNo, Map<String, String> metadata) {
		super();
		this.name = name;
		this.regNo = regNo;
		this.metadata = new HashMap<String, String>();
	}

	

	public String getName() {
		return name;
	}



	public int getRegNo() {
		return regNo;
	}



	public Map<String, String> getMetadata() {
		return metadata;
	}



	@Override
	public String toString() {
		return "ImmutableClass [name=" + name + ", regNo=" + regNo + ", metadata=" + metadata + "]";
	}



	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("abhinav", "patil");
		map.put("Kranti", "Bachaav");
		ImmutableClass immutableClass = new ImmutableClass("abhinav", 0, map);
		
		System.out.println(""+immutableClass);
		map.put("Kranti", "Saxena");
		System.out.println(""+immutableClass);
		
	}

}
