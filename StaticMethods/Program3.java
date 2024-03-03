package StaticMethods;

public class Program3 {

	public static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum of two number ="+ sum);
	}
	public static void sub(int c,int d)
	{
		int sub=c-d;
		System.out.println("Sub of two number ="+ sub);
	}
	public static void mul(int e,int f)
	{
		System.out.println("mul of two number ="+ (e*f));
	}
	public static void div(double g,double h)
	{
		System.out.println("Div of two number ="+ (g/h));
	}
	public static void main(String[] args) {
		System.out.println("Start");
		add(1,2);
		sub(2,3);
		mul(4,5);
		div(6,7);
		System.out.println("End");
	}

}
