package com.divs;

import java.util.Scanner;

public class A1Program2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=13;
		//I
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
				for(int j=0;j<n;j++) {
					
					if(j==0 || j==n-1 || i==j) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}

				}
				
				System.out.print(" ");
					for(int j=0;j<n;j++) {
						
						if(i==0 || i==n-1 || i==(n-1)/2 || j==0) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}

					}
					System.out.print(" ");
						for(int j=0;j<n;j++) {
						

							if((j==0  && i<(n-1)) || (j==n-1 && i<(n-1)) || (i==(n-1) && j>n/4 && j<(3*n)/4)) {
								System.out.print("*");
							}else {
								System.out.print(" ");
							}

						}
						
						System.out.print(" ");
							for(int j=0;j<n;j++) {
							if((j==0  && i>(0)) || (i==0 && j>0 && j<(n-1)) || (j==n-1 && i>0  && i<(n-1)/2) || (i-j ==(n-1)/2) || (i==(n-1)/2 && j<(n-1))) {
									System.out.print("*");
								}else {
									System.out.print(" ");
								}

							
						}
							
							System.out.print(" ");
								for(int j=0;j<n;j++) {
									if((i==0 && j>0 && j<(n-1)) || (j==0 && i>0 && i<(n-1)) || (i==(n-1) && j>0 && j<(n-1))
											|| (j==(n-1) && i>0 && i<(n-1))) {
										System.out.print("*");
									}else {
										System.out.print(" ");
									}
								
							}
				
								System.out.print(" ");
									for(int j=0;j<n;j++) {
										
										if(j==0 || j==n-1 || i==j) {
											System.out.print("*");
										}else {
											System.out.print(" ");
										}

									
								}
			System.out.println();
		}
		//N
//		for(int i=0;i<=n;i++) {
//			for(int j=0;j<n;j++) {
//				
//				if(j==0 || j==n-1 || i==j) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//
//			}
//			System.out.println();
//		}
		//E
//		for(int i=0;i<=n;i++) {
//			for(int j=0;j<n;j++) {
//				
//				if(i==0 || i==n || i==(n-1)/2 || j==0) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//
//			}
//			System.out.println();
//		}

		//U
//		for(int i=0;i<=n;i++) {
//			for(int j=0;j<n;j++) {
//			
//
//				if((j==0  && i<(n-1)) || (j==n-1 && i<(n-1)) || (i==(n-1) && j>n/4 && j<(3*n)/4)) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//
//			}
//			System.out.println();
//		}
		//R
		
//		for(int i=0;i<=n;i++) {
//			for(int j=0;j<n;j++) {
//			if((j==0  && i>(0)) || (i==0 && j>0 && j<(n-1)) || (j==n-1 && i>0  && i<(n-1)/2) || (i-j ==(n-1)/2) || (i==(n-1)/2 && j<(n-1))) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//
//			}
//			System.out.println();
//		}
		
		//O
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if((i==0 && j>0 && j<(n-1)) || (j==0 && i>0 && i<(n-1)) || (i==(n-1) && j>0 && j<(n-1))
//						|| (j==(n-1) && i>0 && i<(n-1))) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		//N
//				for(int i=0;i<=n;i++) {
//					for(int j=0;j<n;j++) {
//						
//						if(j==0 || j==n-1 || i==j) {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						}
//
//					}
//					System.out.println();
//				}

	}
}
