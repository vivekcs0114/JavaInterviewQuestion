package com.avalia.multithread;

class ThreadYieldDemo extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");
			Thread.yield();
		}
	}
}
public class ThreadYield {
	public static void main(String[] a) {
		ThreadYieldDemo t = new ThreadYieldDemo();
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("parent thread");
		}
	}

}
