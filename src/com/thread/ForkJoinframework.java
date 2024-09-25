package com.thread;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinframework {
		public static void main(String[] args) {
			ForkJoinPool forkJoinPool = new ForkJoinPool();
			
			forkJoinPool.submit(() -> {
			    // Your parallel task here
			});
			
			
		}
}
