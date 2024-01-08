package com.divs;


public class ThreadSample  {

	public static void main(String[] args) {
		
		new Thread(()-> {
				System.out.println("Child Thread");
				
			}).start();
		
		
//		Runnable r=()->{
//			for(int i=0;i<5;i++) {
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				System.out.println("Child Thread:"+i);
//			}
//			
//		};
		
		
		
		;
		
			System.out.println("Main Thread");
		
		

	}

}
