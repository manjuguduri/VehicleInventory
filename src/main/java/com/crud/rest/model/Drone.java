package com.crud.rest.model;

public class Drone extends AbstractVehicle {

	/**
	 * Calculates the Motorcycle Price based on Model
	 */
	@Override
	public double calculatePrice(String model) {

		double price;
		switch (model) {

		case "FreeFly":
			price = 18000;
			break;

		case "SkyViper":
			price = 1000;
			break;

		case "Mavic":
			price = 900;
			break;

		case "DjiMavic":
			price = 1200;
			break;

		default:
			price = 0.0;
		}

		return price;
	}
/**
 * Calculates the Motorcycle Speed based on Model
 * 
 */
	@Override
	public int calculateSpeed(String model) {
		int speed;
		switch (model) {

		case "FreeFly":
			speed = 70;
			break;

		case "SkyViper":
			speed = 55;
			break;

		case "Mavic":
			speed = 68;
			break;

		case "DjiMavic":
			speed = 65;
			break;

		default:
			speed = 0;
		}
		return speed;
	}
}
