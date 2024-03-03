package Construtor;

public class Program4 {
	int a;
	int b;
	Program4()
	{
		a=20;
	}
	Program4(int c)
	{
		b=c;
	}
	Program4(int d, int e)
	{
		a=d;
		b=e;
	}
	
	public void show()
	{
		System.out.println("The value is A = "+ a);
		System.out.println("The value is B = "+ b);

	}
	public static void main(String[] args) {
		Program4 x = new Program4();
		x.show();
		Program4 y = new Program4(20);
		y.show();
		Program4 z = new Program4(20,40);
		z.show();
	}

}
