package com.example.designpattern._01_creational_patterns._02_factorymethod._02_after;

public class Client {
	public static void main(String[] args) {

		Client client = new Client();
		//일종의 의존성주입(DI)로 볼 수 있다.
		client.print(new WhiteShipFactory(), "whiteship", "juuxmee@gmail.com");
		client.print(new BlackShipFactory(), "Blackship", "juuxmee@gmail.com");
		//확장에 용이하고 변경에 닫힌 코드!!!!!!!!!!로 만들어야함 --> 이렇게 하면 클라이언트 코드도 바뀌지 않음??
		// Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "juuxmee@gmail.com");
		// System.out.println("whiteship = " + whiteship);
		//
		// Ship blackship = new BlackShipFactory().orderShip("Blackship", "juuxmee@gmail.com");
		// System.out.println("blackship = " + blackship);
	}

	private void print(ShipFactory shipFactory, String name, String email) {
		System.out.println(shipFactory.orderShip(name, email));
	}
}
