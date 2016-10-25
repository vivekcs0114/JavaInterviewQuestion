package com.avalia.multithread;

public class ThreadSetGet extends Thread {
	public void run(){
		System.out.println("child thread is running...");
		Thread.currentThread().setName("vivek");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args)  {
		ThreadSetGet t=new ThreadSetGet();
		t.start();
		System.out.println("parent thread is running...");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("vibhav");
		System.out.println(Thread.currentThread().getName());
		}
	}
