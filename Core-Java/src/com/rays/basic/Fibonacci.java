package com.rays.basic;

import java.util.*;
public class Fibonacci {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number: ");
	int i = sc.nextInt();
	
	while(i<1000) {
	
	System.out.println(i);
	i = i+i;
	}
	
//	for (int i = 7; i < 1000; i =  i+i) {
//		System.out.println(i);
//	}
	
}
}

