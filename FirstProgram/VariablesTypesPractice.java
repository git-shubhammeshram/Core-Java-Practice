package FirstProgram;

public class VariablesTypesPractice {
	static int a=10;     //Global variable
	public static void show()   //Non Static Method Use for New object
	{
		int b=20;
		System.out.println("B=" + b);
	}
	
	public static void main(String[] args) {
		
		System.out.println("A=" + a);
		show();   //Calling Static Method
		
	}

}
