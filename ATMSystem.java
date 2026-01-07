package M4_Activity2;

public class ATMSystem {

	void processWithdrawal(String accountIndex, String amountInput) {
		
		try {
			
			double[] accounts = {10000, 15000, 20000};
			
			System.out.println("Account = "+ accountIndex + ", Amount = " + amountInput);
			
			int index = Integer.parseInt(accountIndex);
			double balance = accounts[index];
			double amount = Double.parseDouble(amountInput);
			
			System.out.println("Current Balance : P " + balance);
			System.out.println("Withdrawal : P " + amount);
			
			if (amount > balance) {
				System.out.println("Insufficient funds! Cannot withdraw P " + amount);
			}else {
				System.out.println("New balance: P " + (balance - amount));

				System.out.println("Withdrawal successful!");

			}
			

			
		} catch (NumberFormatException e) {
			
			System.out.println("Error: Invalid input!");
			System.out.println("Please enter valid numbers.");

			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Error: Account not found!");
			System.out.println("Invalid account index.");
			
		} 
		//catch (Exception e) {}
	}
}
