package NonStaticMethod;

public class ProgramFirst {
	public void show()
	{
		int a = 10;
		int b = 05;
		System.out.println("The values is = "+ (a*b));
	}
	public void show2()
	{
		int c=10,d=2,e=c/d;
		System.out.println("The values is = "+e);
	}
	

	public static void main(String[] args) {
		ProgramFirst z = new ProgramFirst();
		z.show();
		z.show2();
		
	}

}
