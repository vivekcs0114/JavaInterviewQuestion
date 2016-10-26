//Child thread will wait until main thread will not completed.

package com.avalia.multithread;

class ThreadJoinDemoo extends Thread {
	public static Thread mt;

	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<5;i++){
			System.out.println("child thread");
			
		}
	}
}
public class ThreadJoin2 {
	public static void main(String[] a)throws InterruptedException {
		ThreadJoinDemoo t1 = new ThreadJoinDemoo();
		ThreadJoinDemoo.mt=Thread.currentThread();
		t1.start();
		for(int i=0;i<5;i++){
			System.out.println("parent thread");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
