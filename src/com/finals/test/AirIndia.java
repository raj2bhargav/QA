package com.finals.test;

public class AirIndia extends AirCraft{
	
	public static void main(String[] args) {
		
		AirIndia ai = new AirIndia();
		ai.engineGuidelines();
		ai.safetyGuidelines();
		ai.bodyColor();
		
		
	}

	@Override
	public void bodyColor() {
		System.out.println("Red Color -- Air India");
		
	}

}
