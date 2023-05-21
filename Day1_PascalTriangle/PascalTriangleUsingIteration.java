package com.java.problem;

import java.util.Scanner;

public class PascalTriangleUsingIteration {

	public static int fact(int a) {
		int f=1;
		if(a==0)
			return 1;
		for (int i = 1; i <=a; i++) {
			f=f*i;
		}
		return f;
	}

public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Row ");
	int r=sc.nextInt();
	
	for(int i=0;i<=r;i++) {
		for(int j=	1;j<=r-i;j++) {
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			   System.out.print(" "+ fact(i)/(fact(j)*fact(i-j)));
		}
		System.out.println();
	}
	sc.close();
}

}
