package String;

public class ProgramApr15_5 {
	public static void main(String[] args) {
		String Date = "17-04-2022";
		String splitDate[]= Date.split("-");
		System.out.println("Original = "+ Date);
		System.out.println("After split");
		for(int i=0; i<splitDate.length;i++)
		{
			System.out.println(splitDate[i]);
		}
		
	}
}
