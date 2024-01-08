package com.divs;

class MyThreadB extends Thread{
	int total=0;
	@Override
	public void run() {
		System.out.println("Child thread started");
		synchronized (this) {
			for(int i=0;i<100;i++) {
				total+=i;
			}
			System.out.println("Child giving notification");
			this.notify();
		}
		
		
		}
}


public class AbstractDemo {

	public static void main(String[] args) {
		
		MyThreadB t=new MyThreadB();
		t.start();
		synchronized (t) {
			System.out.println("Main Thread Started");
			try {
				t.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main thread got notification call");
			System.out.println(t.total);

	}

	}

}
