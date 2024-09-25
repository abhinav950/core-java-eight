package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableThreadImpl implements Runnable {

	@Override
	public void run() {
		System.out.println("Running");
		
	}
  
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new RunnableThreadImpl());
		executorService.shutdown();
		
		
	}
}
