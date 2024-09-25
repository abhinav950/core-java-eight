package com.thread;

import java.util.concurrent.CompletableFuture;

public class CompitableFuture {
	 public static void main(String[] args) {
		CompletableFuture.supplyAsync(()->{
			return "abhinav";
		}).thenApply(result->{
			return result+" patil";
		}).thenAccept(System.out::println);
		
		
	}
}
