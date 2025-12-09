package com.bpi.training;

public class Car {
	
	private String make;
	private String model;
	private float price;
	
	Car(){
		
		this.make = "currently";
		this.model = "unknown";
		this.price= 0;
		
	}
	
	Car (String make, String model, float price){
		this.make = make;
		this.model = model;
		this.price = price;
	}
	
	public void setCarInfo(Car car)
	{
		this.make = car.make;
		this.model = car.model;
		this.price = car.price;
	}
	
	public Car getCarInfo()
	{
		Car car = new Car();
		car.make = this.make;
		car.model = this.model;
		car.price = this.price;
		
		return car;
	}
	
	public void setMake(String make)
	{
		this.make = make;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}
	
	public String getMake()
	{
		return this.make;
	}
	
	public String getModel()
	{
		return this.model;
	}
	public float getPrice()
	{
		return this.price;
	}
	void showMakeAndModel()
	{
		System.out.println("The car's make and model is " + this.make + " " + this.model + ".");
	}			
	
	void displayPrice()
	{
		System.out.println("Price for " + this.make +" "+ this.model + " is Php"+ String.valueOf(this.price));		
	}
	
}
