package ConditionStatements;

public class NastedIfSecond {

	public static void main(String[] args) {
		String Pin = "9119";
		double ammount = 1000.99;
		if(Pin == "9119")   //comparator operator     
		{
			if(ammount <= 1000.99)
			{
			System.out.println("Cash Is Debit");
		}
			else
			{
				System.out.println("Insuffuciant Balance");
			}
	}
		else
		{
			System.out.println("Incorrect Pin");
		}
	}		
}