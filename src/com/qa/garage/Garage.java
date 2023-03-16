package com.qa.garage2;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehicle v1 = new Vehicle("blue",4,"petrol","car");
		//Vehicle v2 = new Vehicle("red",2,"petrol","");
		Vehicle v1 = new Car();
		v1.setId(1);
		v1.setColour("blue");
		//v1.setEngineSize(1.1f);
		v1.setFuelType("petrol");
		//v1.setNumberOfDoors(4);
		v1.setNumberOfWheels(4);
		v1.setVehicleType("car");
		
		Vehicle v2 = new Lorry();
		v2.setId(2);
		v2.setColour("red");
		v2.setFuelType("diesel");
		v2.setNumberOfWheels(4);
		v2.setVehicleType("lorry");
		//v2.setCubicCapacity(65);
		//v2.setHeight(5);
		
		Vehicle v3 = new Bus();
		v3.setId(3);
		v3.setColour("white");
		v3.setFuelType("diesel");
		v3.setNumberOfWheels(4);
		v3.setVehicleType("bus");
		//v3.setNumberOfFloors(2);
		//v3.setNumberOfSeats(50);
		
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(v1);
		vehicles.add(v2);
		vehicles.add(v3);
		
		
		//calcBill(vehicles);		
		Vehicle v4 = new Car(4,1.1f,4, "black", 4,"Petrol", "Car");
		addVehicleToGarage(vehicles, v4);
		
		
		//removeVehicleById(vehicles, 2);
		
		//emptyGarage(vehicles);

		
		List<Vehicle> vehiclesBeingRemoved= new ArrayList<>();
		vehiclesBeingRemoved.add(v4);
		vehiclesBeingRemoved.add(v1);

		
		removeMultipleVehicles (vehicles, vehiclesBeingRemoved);
		
		
		for (Vehicle vehicle:vehicles) {
			System.out.println(vehicle.getVehicleType());
		}
		
	}
	
	public static void fixVehicle(Vehicle vehicle) {
		float bill;
		if (vehicle.getClass().getSimpleName().equals("Car")) {
			bill = 100;
			System.out.println("Vehicle is fixed and bill is "+bill+" pounds");			
		}
		else if (vehicle.getClass().getSimpleName().equals("Lorry")){
			bill = 200;
			System.out.println("Vehicle is fixed and bill is "+bill+" pounds");			
		}			
		else if (vehicle.getClass().getSimpleName().equals("Bus")){
			bill = 300;
			System.out.println("Vehicle is fixed and bill is "+bill+" pounds");			
		}
	}
	
	public static void removeMultipleVehicles (List<Vehicle> vehicles, List<Vehicle> vehiclesBeingRemoved) {
		for (Vehicle v:vehiclesBeingRemoved){
			for (Vehicle veh:vehicles) {
				if (v.getId()==veh.getId()) {
					vehicles.remove(v);
					break;
				}
			}
		}
	}
	
	public static void emptyGarage(List<Vehicle> vehicles) {
	
		vehicles.removeAll(vehicles);
	}
	
	public static void calcBill(List<Vehicle> vehicles) {
		float bill=0;
		for(Vehicle vehicle:vehicles)
		{
			if (vehicle.getClass().getSimpleName().equals("Car")) {
				bill = 100;
				System.out.println(bill);			
			}
			else if (vehicle.getClass().getSimpleName().equals("Lorry")){
				bill = 200;
				System.out.println(bill);			
			}			
			else if (vehicle.getClass().getSimpleName().equals("Bus")){
				bill = 300;
				System.out.println(bill);			
			}
		}
	}
	
	public static void addVehicleToGarage(List<Vehicle> vehicles, Vehicle vehicle) {
		for (Vehicle v:vehicles) {
			if (v.getId()==vehicle.getId()) {
				System.out.println("A vehicle of this id already exists");
				return;
			}
		}
		vehicles.add(vehicle);		
	}
	
	public static void removeVehicleById(List<Vehicle> vehicles, int id) {
		for (Vehicle vehicle:vehicles) {
			if (vehicle.getId()==id) {
				vehicles.remove(vehicle);
				return;
			}
		}
	}

}
