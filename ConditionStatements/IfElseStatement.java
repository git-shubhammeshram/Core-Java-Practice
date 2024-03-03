package ConditionStatements;

public class IfElseStatement {

	public static void main(String[] args) {
		
		int History=91;
		
		if(History>=40 && History<=60)
		{
			System.out.println("Student is pass second class");
		}
		
		else if(History>=60 && History<=75)
		{
			System.out.println("Student is pass in second class");
		}
		
		else if(History>=75 && History<90)
		{
			System.out.println("Student is pass in first class");
		}
		
		else if(History>=90 && History<100)
		{
			System.out.println("Student is pass in Distinction");
		}
		
		else if (History>=100)
		{
			System.out.println("Wrong Input");
		}
		
		else
		{
			System.out.println("Student is fail");
		}
	}

}
