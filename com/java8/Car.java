package com.java8;

 interface Vehicle {
	String getBrand();

	String seedUp();

	String slowDown();

	default String turnAlarmOn() {
		return "Turning the vehicle alarm on";
	}

	default String turnAlaramOff() {
		return "Turning the vehicle alarm off";
	}
}

class Car implements Vehicle {

	private String brand;

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String seedUp() {
		return "Turning the vehicle alarm on";
	}

	@Override
	public String slowDown() {
		return "Turning the vehicle alarm off";
	}

	public static void main(String[] args) {
		Vehicle car = new Car();
		System.out.println(car.getBrand());
		System.out.println(car.seedUp());
		System.out.println(car.slowDown());
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlaramOff());
	}
}