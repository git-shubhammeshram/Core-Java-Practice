package SuperKeyword;

public class ProgramMar31_5 extends ProgramMar31_4 {
	double a = 20.20;
	public void show()
	{
		double a = 30.30;
		System.out.println("The value local variable is A = "+ a);
		System.out.println("The value is gloabal varibale is A = "+ this.a);
		System.out.println("The value of super gloabal variable is A = "+ super.a);
	}

}
