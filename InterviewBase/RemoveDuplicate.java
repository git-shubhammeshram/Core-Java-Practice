package InterviewBase;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		String name = "Shubbhhaammm";
		StringBuffer x = new StringBuffer();
		
		LinkedHashSet<Character> y = new LinkedHashSet<Character>();
		
		for(int i=0; i<name.length(); i++)
		{
			y.add(name.charAt(i));
		}
		System.out.println(y);
		
		for(Object oneByone:y)
		{
			x.append(oneByone);
		}
		System.out.println(x);
		
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
