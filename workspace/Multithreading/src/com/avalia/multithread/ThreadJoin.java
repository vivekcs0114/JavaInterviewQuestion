package com.avalia.multithread;

class ThreadJoinDemo extends Thread {
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println("child thread");
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadJoin {
	public static void main(String[] a) {
		ThreadJoinDemo t1 = new ThreadJoinDemo();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<5;i++)
		System.out.println("parent thread");
	}

}
