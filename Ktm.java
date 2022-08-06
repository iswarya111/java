package org.bike;

public class Ktm extends Bike{

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Bike speed range: 56rpm");
		
	}
public void cost() {
	System.out.println("Bike cost range : 75k");
}
public static void main(String[] args) {
	Ktm m = new Ktm();
	m.cost();
	m.speed();
}
}
