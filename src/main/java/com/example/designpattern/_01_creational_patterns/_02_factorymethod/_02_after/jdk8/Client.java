package com.example.designpattern._01_creational_patterns._02_factorymethod._02_after.jdk8;

import com.example.designpattern._01_creational_patterns._02_factorymethod._02_after.BlackShipFactory;

public class Client {
	public static void main(String[] args) {

		Client client = new Client();
		//일종의 의존성주입(DI)로 볼 수 있다.
		client.print(new WhiteShipFactory(), "whiteship", "juuxmee@gmail.com");

	}

	private void print(ShipFactory shipFactory, String name, String email) {
		System.out.println(shipFactory.orderShip(name, email));
	}
}
