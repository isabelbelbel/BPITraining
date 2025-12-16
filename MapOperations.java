package M3_Activity3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapOperations {

	private static Map<String, Integer> productsMap = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		productsMap.put("Laptop", 50000);
		productsMap.put("Mouse" , 500);
		productsMap.put("Keyboard", 1500);
		productsMap.put("Monitor", 4500);
		productsMap.put("Printer", 6500);
        
        Scanner sc = new Scanner(System.in);
		int option = 0;		
		do {
			
			System.out.println("Select an option:");
			System.out.println("1. Search a product");
			System.out.println("2. Add a product");
			System.out.println("3. Print all products and count");
			System.out.println("4. Find the cheapest product");
			System.out.println("5. Exit");

			System.out.print(">");
			
			String strOption = sc.nextLine().trim();
			option = Integer.parseInt(strOption);
						
			switch (option) {
			case 1:
				searchProduct();
				break;
			case 2:
				addProduct();
				break;
			case 3:
				printAll();break;
			case 4:
				findCheapest();
				break;
			case 5:
				option = 5;
				System.out.println("Exiting...");	
				break;
			default:
				System.out.println("Please enter valid option");				
				
			}
			System.out.println("");
		}
		while(option != 5);
		sc.close();
	
	}
	
	private static void searchProduct() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter product name to search: ");
		String search = sc.nextLine().trim();
		
		boolean isFound = productsMap.containsKey(search);
		
		if (isFound) {
			System.out.println("Product found! Price " + productsMap.get(search));
		}else {
			
			System.out.println("Product not found!");
		}
		
	}
	private static void addProduct() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter product name to add: ");
		String key = sc.nextLine().trim();
		System.out.print("Enter price: ");
		int value = Integer.parseInt(sc.nextLine().trim());
		
		productsMap.put(key, value);
		System.out.println("Product added: " + key);
		
	}
	private static void printAll() {
		
		System.out.println("All products and prices:");
		for (Map.Entry<String, Integer> product : productsMap.entrySet()) {
			
			System.out.println(product.getKey() +" - "+ product.getValue());
			
		}
        System.out.println("Total products: " + productsMap.size());

	}
	private static void findCheapest() {
		
		String lowestKey = null;
		int lowestValue = 0;

		for (Map.Entry<String, Integer> product : productsMap.entrySet()) {
		    lowestKey = product.getKey();
		    lowestValue = product.getValue();
		    break;
		}

		for (Map.Entry<String, Integer> product : productsMap.entrySet()) {
		    if (product.getValue() < lowestValue) {
		        lowestKey = product.getKey();
		        lowestValue = product.getValue();
		    }
		}

		System.out.println("Cheapest product: " + lowestKey+" - "+ lowestValue);

	}
	

}
