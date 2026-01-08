package M4_Activity4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountValidator accValidator = new AccountValidator();
		
		try {
			accValidator.validateAccountNumber("1234567890");
		}catch(Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
		
		try {
			accValidator.validateAccountNumber("123");
		}catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		try {
			accValidator.validateAccountNumber(null);		
		}catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
