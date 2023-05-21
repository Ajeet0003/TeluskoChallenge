package com.java.problem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//pascal triangle using Recursion and Memoization
public class PascalTriangleUsingRecursionAndMemoization {

	public static Map<Integer, Integer> cache=new HashMap<>();
	public static int fact(int a) {
			if(a==0)
				return 1;
			
			if(cache.containsKey(a)) {
				return cache.get(a);
			}
			
			int result=a*fact(a-1);
			cache.put(a, result);
			return result;
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
