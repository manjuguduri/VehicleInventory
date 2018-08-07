package com.crud.rest.model;

public class Amphibian extends AbstractVehicle {

	/**
	 * Calculates the Motorcycle Price based on Model
	 */
	@Override
	public double calculatePrice(String model) {

		double price;
		switch (model) {

		case "HydraSpyder":
			price = 15000;
			break;

		case "GibbsAquada":
			price = 12000;
			break;

		case "GibbsQuadski":
			price = 13000;
			break;

		case "WaterCarPanther":
			price = 13500;
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

		case "HydraSpyder":
			speed = 53;
			break;

		case "GibbsAquada":
			speed = 30;
			break;

		case "GibbsQuadski":
			speed = 45;
			break;

		case "WaterCarPanther":
			speed = 65;
			break;

		default:
			speed = 0;
		}
		return speed;
	}
}
