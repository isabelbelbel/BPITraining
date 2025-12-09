package M2_Activity6;

public class Truck extends Vehicle{
	
	public Truck(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void startEngine() {
		System.out.println("Starting engine...");
	}
	
	
	
}

