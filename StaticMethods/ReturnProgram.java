package StaticMethods;

public class ReturnProgram {
	public static int show()
	{
		int a=20;
		int b=30;
		return(a+b);
	}

	public static void main(String[] args) {
		int c=show();
		System.out.println("Value of return type is = "+c);
	}

}
