package M2_Activity6;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Car(4, "Toyota");
		Vehicle truck = new Truck(16, "Isuzu");
		
		
		car.setBrand("Toyota");
		car.setNumberOfWheels(4);
		
		truck.setBrand("Isuzu");
		truck.setNumberOfWheels(16);
		
		showBrandAndWheel(car);
		showBrandAndWheel(truck);
				
		car.startEngine();
		truck.startEngine();
		
		refuelVehicle(truck);
		refuelVehicle(car);
		
		destroyVehicle(truck);
		destroyVehicle(car);
		
		
	}
	private static void refuelVehicle(Vehicle vehicle)
	{
		vehicle.refuel();
	}
	private static void destroyVehicle(Vehicle vehicle)
	{
		vehicle.destroy();
	}
	
	private static void showBrandAndWheel(Vehicle vehicle) {
		System.out.println(vehicle.getBrand() + " has " + String.valueOf(vehicle.getNumberOfWheels()) + " wheels.");

	}

}
