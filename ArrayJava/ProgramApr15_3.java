package ArrayJava;

public class ProgramApr15_3 {
	public static void main(String[] args) {
		String Subject[][] = new String [2][2];
		Subject[0][0] = "Physics";
		Subject[0][1] = "Chemistry";
		Subject[1][0] = "Histroy";
		Subject[1][1] = "Politics";
		
		for(int i=0;i<Subject.length;i++)
		{
			for(int j=0;j<Subject.length;j++)
			{
				System.out.print(Subject[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
