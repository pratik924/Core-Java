package com.rays.basic;

public class CountVowel {
	public static void main(String[] args) {
		
		String str = "google";
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			char c = str.charAt(i);
			
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count ++;
			}
		}
		System.out.println(count);
	}

}
