package com.divs;

class Display{
	String name;
	public synchronized void wish(String name)  {
		for(int i=0;i<5;i++) {
			System.out.print("Name is:");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
		
	}
}

class MyThread extends Thread{
	Display d;
	String name;
	public MyThread(Display d, String name) {
		this.d=d;
		this.name=name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}
}

public class SynchronizationSample {

	public static void main(String[] args) {
		Display d=new Display();
		MyThread t1=new MyThread(d,"Sachin");
		MyThread t2=new MyThread(d,"Dhoni");
		t1.start();
		t2.start();
		

	}

}
