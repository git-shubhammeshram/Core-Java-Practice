package Construtor;

public class Program3 {
	//Assignment :- Write a java program which contain zero parameterised constructor and
	//Parameterized constructor
	int a = 20;
	static int b = 30;
	Program3()
	{
		System.out.println("The value is = "+ a);
		System.out.println("The value is = "+ b);

	}
	Program3(int a,double b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Program3 x = new Program3();
		Program3 z = new Program3(20,20);
	}

}
