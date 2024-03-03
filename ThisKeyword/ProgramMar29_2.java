package ThisKeyword;

public class ProgramMar29_2 {
	double num = 158.08;
	ProgramMar29_2(double num)
	{
		System.out.println(num);
		System.out.println(this.num);
	}
	public void show(double num)
	{
		System.out.println("Show method printing value = "+num);
		System.out.println("Show method printing value = "+this.num);
	}
	public void display()
	{
		System.out.println("Display method printing value = "+this.num);

	}

	public static void main(String[] args) {
		ProgramMar29_2 x = new ProgramMar29_2(125.08);
		x.show(285.85);
		x.display();
		
	}

}
