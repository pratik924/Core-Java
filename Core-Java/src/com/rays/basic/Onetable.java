package com.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Onetable {
	public static void main(String[]args) throws ParseException {
		Date date = new Date();
		System.out.println("default format:" + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String formatedDate = sdf.format(date);
		System.out.println("my formate:"+ formatedDate);
		System.out.println("----------");
		String dob ="2002-09-30";
		System.out.println("String dob :" + dob);
		

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-mm-dd");
		Date datedob = sdf1.parse(dob);
		
		
		
		
		
		
		
	}

}
