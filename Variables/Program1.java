package Variables;

public class Program1 {
	int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		int c = 30;
		final int d = 40;
		Program1 z = new Program1();
		System.out.println("A = "+ z.a);
		System.out.println("B = " + b);
		System.out.println("D = " + d);
		System.out.println("C = " + c);

		//d = 50;
		}

}
