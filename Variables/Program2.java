package Variables;

public class Program2 {
	static int a = 10;
	public void show()
	{
		int b = 20;
		System.out.println(a + " " + b);
		a++;
		b++;
		
	}

	public static void main(String[] args) {
		Program2 z = new Program2();
		z.show();
		z.show();
		z.show();
	}

}
