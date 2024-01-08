package com.divs;

abstract class A {
	
//	B b=new B();
	void Demo() {
//		b.show();
		System.out.println("in Demo");
	}
	
//	class B{
////		void show() {
////			
////			System.out.println("in Show");
////		}
//	}

	public static void main(String[] args) {
		
		A ob=new A(){
			
			void Demo() {
				System.out.println("in called");
			}
			
		};
		
ob.Demo();
	}

}
