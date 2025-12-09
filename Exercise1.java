package com.bpi.training;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		Car car2 = new Car("Toyota", "Camry", 2677000);
		
		car1.showMakeAndModel();
		car2.showMakeAndModel();
		
		car2.displayPrice();

		
		Car car3 = new Car();
		car3.setCarInfo(new Car("Mitsubishi", "Xpander", 1198000));
		
		car3.showMakeAndModel();
		car3.displayPrice();		
		
	}

}
