package M4_Activity6;

public class InsufficientFundsException extends Exception{

	private double balance;
	private double requestedAmount;
	
	public InsufficientFundsException (String message, double balance, double requestAmount) {
		
		super(message);
		this.balance = getBalance();
		this.requestedAmount = getRequestedAmount();
	}
	
	public double getBalance() {
		return balance;
	}

	public double getRequestedAmount() {
		return requestedAmount;
	}
	
}
