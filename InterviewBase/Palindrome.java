package InterviewBase;

public class Palindrome {

	public static void main(String[] args) {
		
		String name = "mom";
		String RevName = "";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			RevName = RevName + name.charAt(i);
		}
		System.out.println("Reverse String Is = " +RevName);

		if(RevName.equals(name))
		{
			System.out.println("Palindrome is verified");
		}
		else
		{
            System.out.println("Palindrome is failed");
		}
	}

}
