/**
 * 
 */
package com.bpi.hello;

/**
 * 
 */
import java.util.*;


public class Activity2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter your age:");
		String age = scn.nextLine();
		
		int ageInt = Integer.parseInt(age);
		double ageDouble = Double.parseDouble(age);
		
		System.out.println("Your age as int: " + ageInt);
		System.out.println("Your age as double: " + ageDouble);
		
		scn.close();
		


	}

}
 