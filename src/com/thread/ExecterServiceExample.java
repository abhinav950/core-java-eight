package com.thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class ExecterServiceExample {
	
	public static void main(String[] args) {
		
		ExecutorService ex= Executors.newFixedThreadPool(10);
		ex.submit(()->{
			Thread.currentThread().currentThread().getName();
		});
		ex.shutdown();
		
	    }

}
