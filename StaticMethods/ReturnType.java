package StaticMethods;

public class ReturnType {
	public static double add()
	{
		double a=10, b=20;
		return (a+b);
	}
	

	public static void main(String[] args) {
		System.out.println("Start");
		double output= add();
		System.out.println("Sum ="+ output); 
		//System.out.println("add ="+ add());
		System.out.println("End");
		
	}

}
