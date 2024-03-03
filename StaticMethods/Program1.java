package StaticMethods;

public class Program1 {

	public static void add(int a)
	{
		int sum=a+a;
		System.out.println(" Sum =" + sum);
	}
	public static void main(String[] args) {
		System.out.println("This is staring of main method");
		add(30);
		System.out.println("Method Ended");
	}

}
