package ThisKeyword;

public class ProgramMar30_1 {
	//It is also used when we want to call zero parameter constructor of its own class
	ProgramMar30_1()
	{
		
		System.out.println("This is zero paramter constructer");
	}
	
	ProgramMar30_1(int a)
	{
		this();
		System.out.println("This is paramterized constructer A = "+ a);
	}

	public static void main(String[] args) {
		ProgramMar30_1 x = new ProgramMar30_1(125);
	}

}
