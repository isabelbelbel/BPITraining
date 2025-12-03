package com.bpi.hello;

import java.util.*;


public class Activity4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = Integer.parseInt(scn.nextLine());
		
		System.out.print(guessAge(age));
		
		scn.close();
	
		

	}
	
	public static String guessAge(int age) {
		
		String judgement;
		
		if (age < 18)
			judgement = "Minor";
		else if (age >= 60)
			judgement = "Senior";
		else 
			judgement = "Adult";
		
		return judgement;
		
	}

}
