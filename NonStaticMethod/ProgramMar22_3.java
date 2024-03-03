package NonStaticMethod;

public class ProgramMar22_3 {
//Non-Static	method	with	parameter	from	same	class
	public void show(String Name)
	{
		System.out.println(Name);
	}
	public void show2(char A)
	{
		System.out.println(A);
	}
	
	
	public static void main(String[] args) {
		ProgramMar22_3 z = new ProgramMar22_3();
		z.show("Shubham");
		z.show2('A');
	}

}
