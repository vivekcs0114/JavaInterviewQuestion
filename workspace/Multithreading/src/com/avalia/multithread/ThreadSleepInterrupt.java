//Child thread will wait until main thread will not completed.

package com.avalia.multithread;

class ThreadSleepInterruptDemo extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("child thread");
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}

	}
}

public class ThreadSleepInterrupt {
	public static void main(String[] a) throws InterruptedException {
		ThreadSleepInterruptDemo t1 = new ThreadSleepInterruptDemo();
		t1.start();
		t1.interrupt();
		for (int i = 0; i < 5; i++) {
			System.out.println("parent thread");

		}

	}

}
