package Interface;

import java.util.Scanner;

public class ProgramApr3_2C implements ProgramApr3_1P {

	String Emp_Name ;
	int Emp_Id , Emp_Age ;
	double Emp_Sal ;
	
	
	@Override
	public void setEmplInfo() 
	{
		//Emp_Name = "Komal Uge";
		//Emp_Id = 128 ;
		//Emp_Age = 21 ;
		//Emp_Sal = 149000.87 ;
		
		Scanner a = new Scanner(System.in);
		System.out.println("Employee Details is Name, Id, Age, Sallary");
		Emp_Name = a.next();
		Emp_Id = a.nextInt();
		Emp_Age = a.nextInt();
		Emp_Sal = a.nextDouble();
		
		
	}

	@Override
	public void getEmplInfo() 
	{
		System.out.println("Employee name is = "+ Emp_Name);
		System.out.println("Employee age is = "+ Emp_Age);
		System.out.println("Employee id is = "+ Emp_Id);
		System.out.println("Employee sallary is = "+ Emp_Sal);

	}

}
