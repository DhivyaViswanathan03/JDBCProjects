package com.divs;
class A1{
	void Demo() {
		System.out.println("in Demo");
	}
	 class A2{
		
		void Show() {
			System.out.println("in Show");
		}
		
	}
}

public class AB {

	public static void main(String[] args) {
		A1 a1=new A1();
		a1.Demo();
		A1.A2 a2;
		a2=a1.new A2();
		a2.Show();
		

	}

}
