package com.rays.basic;

public class PrimeNum {
	
	public static void main(String[] args) {
		
		int num= 13;
		int count=0;
		
		for (int i = 2; i < num; i++) {
			if (num%i==0) {
				count++;
			}
		}
		
		if (count>0) {
			System.out.println(num + " is not prime number");
		} else {
			System.out.println(num+ " is a prime number");
		}
	
		}
	}


