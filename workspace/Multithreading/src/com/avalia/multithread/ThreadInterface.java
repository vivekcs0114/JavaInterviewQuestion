package com.avalia.multithread;

class RunnableDemo implements Runnable {
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println("child thread is running...");
		}
	}
}
public class ThreadInterface{
	public static void main(String a[]) {
		RunnableDemo t = new RunnableDemo();
		Thread t1=new Thread(t);
		t1.start();
		for(int i=0;i<5;i++){
			System.out.println("parent thread is running...");
		}
					
	}
}
