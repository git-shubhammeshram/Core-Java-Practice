package Polymorphism;

public class ProgramApr1_1 {
	
	//Here we can show method overloading
	public void show()
	{
		System.out.println("Zero parameter addition is = "+ (10+10));
	}
	public void show(int a)
	{
		System.out.println("Single int paramter value is = "+ a);
	}
	public void show(int a, int b)
	{
		System.out.println("Double int paramter value is = "+ (a+b));
	}
	public void show(double a)
	{
		System.out.println("Single double paramter value is = "+ a);
	}
	public void show(double a,double b)
	{
		System.out.println("Double double  paramter value is = "+ a);
	}
}
