package M3_Activity2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOperations {


	private static Set<String> products = new HashSet<>(
			Arrays.asList("Laptop", "Monitor", "Mouse", "Keyboard", "Printer"));

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int option = 0;		
		do {
			
			System.out.println("Select an option:");
			System.out.println("1. Search a product");
			System.out.println("2. Add a product");
			System.out.println("3. Print all products and count");
			System.out.println("4. Exit");
			System.out.print(">");
			
			String strOption = sc.nextLine().trim();
			option = Integer.parseInt(strOption);
						
			switch (option) {
			case 1:
				search();
				break;
			case 2:
				add();
				break;
			case 3:
				printAll();break;
			case 4:
				option = 4;
				System.out.println("Exiting...");	
				break;
			default:
				System.out.println("Please enter valid option");				
				
			}
			System.out.println("");
		}
		while(option != 4);
		sc.close();
	
	}
	
	private static void search() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter product name to search: ");
		String search = sc.nextLine().trim();
		
		boolean isFound = products.contains(search);
		
		if (isFound) {
			System.out.println("Product found: " + search);
		}else {
			
			System.out.println("Product not found.");
		}
	}
	private static void add() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter product name to add: ");
		String newProduct = sc.nextLine().trim();
		products.add(newProduct);
		System.out.println("Produt added: " + newProduct);
		
		
	}
	private static void printAll() {
	
		System.out.println("All products:");
        for (String product : products) {
            System.out.println("- " + product);
        }
        System.out.println("Total unique: " + products.size());

	}
	

}
