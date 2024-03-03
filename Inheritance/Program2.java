package Inheritance;

public class Program2 extends Program1 {
	
	public void Bike()
	{
		System.out.println("Child have bike");
	}

	public static void main(String[] args) {
		Program2 x = new Program2();
		x.House();
		x.Car();
		x.Bike();
		
	}
}

