package com.carrentalsystem;

public class Main_Class
{
	public static void main(String[] args)
	{
		CarRentalSystem crs=new CarRentalSystem();
		
		Car car1=new Car("C001","Thar","Mahindra",2000.00);
		Car car2=new Car("C002","Fortuner","Toyota",3000.00);
		Car car3=new Car("C003","Scorpio","Mahindra",1500.00);
		
		crs.addCar(car1);
		crs.addCar(car2);
		crs.addCar(car3);
		
		crs.menu();
		
	}

}