package NonStaticMethod;

public class ProgramMar22_5 {
//Non-Static	method	with	return	type	from	same	class
	public int show()
	{
		int a=85;
		int b=85;
		return(a*b);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		ProgramMar22_5 z = new ProgramMar22_5();//Creating the object
		int mul = z.show(); //Creating method object
		System.out.println("The value is = "+ mul);
	}

}
