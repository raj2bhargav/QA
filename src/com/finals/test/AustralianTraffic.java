package com.finals.test;

public class AustralianTraffic implements CentralTrafficRules,AsiaTraffic {

	public static void main(String[] args) {
		
		CentralTrafficRules at = new AustralianTraffic();
		
		
		at.goGreen();
		at.stopRed();
		at.yellowFlash();
		at.completeStop();
		System.out.println(at.myVar);
		
		
		AustralianTraffic ats = new AustralianTraffic();
		
		ats.pedestrian();
		
		
		AsiaTraffic as = new AustralianTraffic();
		as.trainSymbol();

	}

	@Override
	public void goGreen() {
		System.out.println("Go Green");
		
	}

	@Override
	public void stopRed() {
		System.out.println("Stop Red");
		
	}

	@Override
	public void yellowFlash() {
		System.out.println("Yellow Flash");
		
	}

	@Override
	public void completeStop() {
		System.out.println("Complete Stop");
		
	}
	
	
	public void pedestrian() {
		System.out.println("Pedestrian Walk");
	}

	@Override
	public void trainSymbol() {
		System.out.println("Train Symbol");
		
	}

}
