package com.avalia.multithread;

public class ThreadDemo extends Thread {
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("child thread is running...");
		}
		
	}
	public static void main(String[] args)  {
		ThreadDemo t=new ThreadDemo();
		t.start();
		for(int i=0;i<5;i++){
			System.out.println("parent thread is running...");
		}
		
		}
	}
