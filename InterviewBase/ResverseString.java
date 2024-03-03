package InterviewBase;

public class ResverseString {

	public static void main(String[] args) {
		
		String name = "mahbuhS";
		String revName = "";
		
		for(int i=name.length()-1; i>=0;i--)
		{
			revName= revName + name.charAt(i);
			
		}
		System.out.println(revName);

		

	}

}
