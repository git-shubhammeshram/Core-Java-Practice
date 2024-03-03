package ArrayJava;

public class ProgramApr14_1 {
	public static void main(String[] args) {
		
		int mockMarks[] = {10,20,30,40,50,60,70};
		System.out.println(mockMarks.length);
		System.out.println(mockMarks[1]);
		
		for(int i=0; i<mockMarks.length;i++)
		{
			System.out.println(mockMarks[i]);
		}
		
		int mockMarks2[] = new int[10];
		mockMarks2[0] = 11;
		mockMarks2[1] = 22;
		mockMarks2[2] = 33;
		System.out.println(mockMarks2[2]);
		

}
}
