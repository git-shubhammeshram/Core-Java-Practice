package ConditionStatements;

public class NestedIfCondition {

	public static void main(String[] args) {
		String InstagramId = "Shubham.98";
		String InstagramPass = "Pass@123";
		if(InstagramId == "Shubham.98")		{
			if(InstagramPass == "Pass@123")
			{
				System.out.println("Sucessfully Login");
			}
			else
			{
				System.out.println("Password Incorrect");
			}
		}
		else
			System.out.println("Username Incorrect");
	}

}
