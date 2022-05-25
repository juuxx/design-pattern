package com.example.designpattern._01_creational_patterns._02_factorymethod._01_before;

public class Client {
	public static void main(String[] args) {
		Client client = new Client();

		Ship whiteship = ShipFactory.orderShip("Whiteship", "juuxmee@gmail.com");
		System.out.println("whiteship = " + whiteship);

		Ship blackship = ShipFactory.orderShip("Blackship", "juuxmee@gmail.com");
		System.out.println("blackship = " + blackship);
	}
}
