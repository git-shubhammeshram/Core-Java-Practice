package ConditionStatements;

public class SwitchCase {

	public static void main(String[] args) {
		String Month = "April";
		switch(Month) 
		{
		case "Jan":
		System.out.println("Month Is Jan");
		break;
		
		case "Feb":
			System.out.println("Month Is Feb");
			break;
			
		case "March":
			System.out.println("Month Is March");
			break;
		default:
			System.out.println("This leap Year");
		}
	}

}
