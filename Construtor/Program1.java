package Construtor;

public class Program1 {
	int a;
	static int b;
	Program1()
	{
		a=10;
		b=20;
		System.out.println("The value is A = "+ a);
		System.out.println("The value is B = "+ b);
	}

	public static void main(String[] args) {
		Program1 z = new  Program1();
	}

}
