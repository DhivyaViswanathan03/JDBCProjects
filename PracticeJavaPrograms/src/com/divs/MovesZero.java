package com.divs;

public class MovesZero {
	public static void main(String[] args) {
		int nums[]= {0,1,0,3,12};
		int align[]=new int[nums.length];
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				align[count]=nums[i];
				count++;
			}
		}
		for(int i=count;i<nums.length;i++) {
			align[i]=0;
			
		}
		
for(int i=0;i<align.length;i++) {
	System.out.println(align[i]);
	
}
	}

}
