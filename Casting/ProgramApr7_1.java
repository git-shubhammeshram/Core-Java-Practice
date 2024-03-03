package Casting;

public class ProgramApr7_1 {
	
	static int a = 30;
	static double c = 10.10;



	public static void main(String[] args) {
		
		double b = a ;
		System.out.println("Original value of A = "+a);
		System.out.println("Implicit  value of B = "+b);
		
		
		int d = (int) c ;
		System.out.println("Original value of C = "+c);
		System.out.println("Exciplit  value of B = "+d);		
		
	}

}
