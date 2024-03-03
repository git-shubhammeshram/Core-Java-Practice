package ThisKeyword;

public class ProgramMar29_1 {
	public void show()
	{
		System.out.println(this);
	}

	public static void main(String[] args) {
		ProgramMar29_1 x = new ProgramMar29_1();
				x.show();
				System.out.println("----------------");
		ProgramMar29_1 y = new ProgramMar29_1();
		        y.show();
	}

}
