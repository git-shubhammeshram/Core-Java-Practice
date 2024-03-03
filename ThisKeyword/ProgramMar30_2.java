package ThisKeyword;

public class ProgramMar30_2 {
	  //- It is also used to call parameterized constructor of its own class
	ProgramMar30_2()
	{
		this(198);
		System.out.println("This is zero parameterzed constructer");
	}
	ProgramMar30_2(int a)
	{
		System.out.println("This is parameterized constructor A = "+ a);
	}
	public static void main(String[] args) {
		ProgramMar30_2 x = new ProgramMar30_2();
	}

}
