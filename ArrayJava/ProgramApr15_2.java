package ArrayJava;

import java.util.Arrays;

public class ProgramApr15_2 {
	public static void main(String[] args) {
		String Name[]= new String[5];
		Name[0]= "Shubham";
		Name[1]= "Komal";
		Name[2]= "Shantanu";
		Name[3]= "Chetan";
		Name[4]= "Dhammapal";
		for(int i=0;i<Name.length;i++)
		{
			System.out.println(Name[i]);
		}
		System.out.println("-------------");
		
//		Arrays.sort(Name);		
//		for(int i=0;i<Name.length;i++)
//		{
//			System.out.println(Name[i]);
//		}
//		System.out.println("-------------");
		
//		Arrays.sort(Name);		
//		for(int i=Name.length-1; i<=0;i--)
//		{
//			System.out.println(Name[i]);
//		}
	}

}
