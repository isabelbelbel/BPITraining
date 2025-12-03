package com.bpi.hello;

import java.util.*;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int var1 = Integer.parseInt(sc.nextLine());
		System.out.print("Enter second integer: ");
		int var2 = Integer.parseInt(sc.nextLine());

		System.out.println("Sum: "+ computeSum(var1, var2));
		System.out.println("Difference: "+ computeDiff(var1, var2));
		System.out.println("Product: "+ computeProd(var1, var2));

		sc.close();
		
	}
	
	public static int computeSum(int int1, int int2) {
		
		return int1 + int2;
	}

	public static int computeDiff(int int1, int int2) {
			
		return int1 - int2;
	}
	
	public static int computeProd(int int1, int int2) {
	
	return int1 * int2;
	}
	
	
}
