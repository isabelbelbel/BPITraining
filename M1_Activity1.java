package com.bpi.hello;

import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter your name:");
		
		String name = scn.nextLine();
		
		System.out.println("Hello, " + name + "!");
		
		scn.close();
		

	}

}
