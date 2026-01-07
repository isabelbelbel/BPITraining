package M4_Activity2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATMSystem atm = new ATMSystem();
		
		System.out.println("=== ATM Withdrawal System ===");
		
		System.out.println("\n--- Test 1: Valid Withdrawal ---");
		atm.processWithdrawal("1", "5000");
		
		System.out.println("\n--- Test 2: Invalid Account Index ---");
		atm.processWithdrawal("abc", "5000");
		
		System.out.println("\n--- Test 3: Account Not Found ---");
		atm.processWithdrawal("10", "5000");
		
		System.out.println("\n--- Test 4: Insufficient Funds ---");
		atm.processWithdrawal("1", "20000");
		
		System.out.println("\n=== All tests completed! ===\n");


	}

}
