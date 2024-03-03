package Abstraction;

public class ProgramApr2_2 extends ProgramApr2_1{
	public void show()
	{
		int c = 30;
		int d = 30;
		System.out.println("The addition is = "+ (c+d));
	}

	@Override
	public void display() {
		int g = 10;
		double h = 20.35;
		System.out.println("The addition is abstract method is = " + (g+h));
	}

}
