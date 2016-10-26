//Child thread will wait until main thread will not completed.

package com.avalia.multithread;

class ThreadSleepDemo extends Thread {
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println("child thread");
			try {
				sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
public class ThreadSleep {
	public static void main(String[] a)throws InterruptedException {
		ThreadSleepDemo t1 = new ThreadSleepDemo();
		t1.start();
		for(int i=0;i<5;i++){
			System.out.println("parent thread");
			
		}
		
	}

}
