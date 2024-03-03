package StaticMethods;

public class Program2 {

	public static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum of two num =" + sum);
	}
	public static void main(String[] args) {

		System.out.println("This is start");
		add(10,20);
		System.out.println("This is end");
	}

}
