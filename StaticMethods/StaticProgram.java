package StaticMethods;

public class StaticProgram {
	public static void show()
	{
		System.out.println("This is static show method");
	}
	public static void display()
	{
		System.out.println("This is static display method");
	}
	
	public static void main(String[] args) {

		System.out.println("This is start of main method");
		show();
		display();
		System.out.println("This is end of main method");
	}

}
