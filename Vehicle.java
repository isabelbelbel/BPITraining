package M2_Activity6;

abstract class Vehicle implements Refuelable {
	
	private int numberOfWheels;
	private String brand;

	public Vehicle(int numberOfWheels, String brand) {
        this.numberOfWheels = numberOfWheels;
        this.brand = brand;
    }

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;          
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public abstract void startEngine();
	
	public void destroy()
	{
		System.out.println("Destroying vehicle " + this.brand);
	}
	
	@Override 
	public void refuel() {
		System.out.println("Refueling vehicle...");
	}
	

}
