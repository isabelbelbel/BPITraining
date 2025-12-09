package M2_Activity6;

public class Car extends Vehicle{
	
	public Car(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void startEngine() {
		System.out.println("Starting engine...");
	}
	
	
}

