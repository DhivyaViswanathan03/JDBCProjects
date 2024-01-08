package com.divs;
enum Result{
	PASS,FAIL;
	Result(){
		System.out.println("COns is called");
	}
}
public class EnumSample {

	public static void main(String[] args) {
		System.out.println(Result.PASS);

	}

}
