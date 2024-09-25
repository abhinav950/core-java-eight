package com.thread;

public class LamadaExpression {
	
	public static void main(String[] args) {
		
		Runnable runnable = ()->{
			
			String name = Thread.currentThread().getName();
			
			System.out.println("Thread Name is "+name);
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
