package com.avalia.multithread;

 public class ThreadPriorities extends Thread {
	public void run() {
		System.out.println("child thread running");
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] a) {
		ThreadPriorities t = new ThreadPriorities();
		t.start();
		Thread.currentThread().setPriority(3);
		System.out.println("parent thread running");
		System.out.println(Thread.currentThread().getPriority());
	}
}