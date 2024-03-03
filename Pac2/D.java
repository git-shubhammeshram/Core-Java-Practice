package Pac2;

import Pac1.A;

public class D extends A {
	public void print()
	{
		System.out.println("The value is B = " + b);
		//Scope of protected veriable
		//System.out.println("The value is C = " + c);
		//Scope of default variable is not exits in other package
	}

}
