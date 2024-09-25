package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableImpl implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		return 123;
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService excuters = Executors.newFixedThreadPool(10);
		Future<Integer> submit = excuters.submit(new CallableImpl());
		Integer integer = submit.get();
		System.out.println("integer->"+integer);
		excuters.shutdown();  
	}

}
