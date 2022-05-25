package com.example.designpattern._01_creational_patterns._02_factorymethod._02_after.jdk8;

public interface ShipFactory {

	default Ship orderShip(String name, String email) {
		validate(name, email);
		prepareFor(name);
		Ship ship = createShip();
		sendEmailTo(email, ship);
		return ship;
	}

	Ship createShip();

	//java 11부터 가능
	void validate(String name, String email);
	void prepareFor(String name);
	void sendEmailTo(String email, Ship ship);
}
