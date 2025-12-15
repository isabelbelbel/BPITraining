package M3_Activity1;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List<String> products = new ArrayList<>(Arrays.asList("Laptop", "Mouse", "Keyboard", "Monitor", "Printer"));		
		System.out.println("All products: ");
		for(int x = 0; x < products.size(); x++) {
			
			System.out.println(x + 1 + ". " + products.get(x));
			
		}
		
		products.add("Webcam");
		products.remove(1);
		
		System.out.println("After adding and removing products: ");
		for(int x = 0; x < products.size(); x++) {
			
			System.out.println(x + 1 + ". " + products.get(x));
			
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter product name to search: ");
		String search = sc.nextLine().trim();
		sc.close();
		
		boolean isFound = products.contains(search);
		
		if (isFound) {
			System.out.print("Product found: " + search);
		}else {
			
			System.out.print("Product not found");
		}
		
		
		
		
		
	}

}
