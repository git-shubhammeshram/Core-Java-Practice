package Variables;

public class Program3 {
	//Memory management by using static variable
	int i = 0;
	static int j = 0;
	public void show()
	{
		System.out.println(i + "   "+ j);
		i++;
		j++;
	}

	public static void main(String[] args) {
		Program3 x =new Program3();
		x.show();
		x.show();
		Program3 z =new Program3();
		z.show();
		Program3 y =new Program3();
		y.show();

	}

}
