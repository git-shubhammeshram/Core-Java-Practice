package NonStaticMethod;

public class ProgramMar22_4 {
//Non-Static	method	with	parameter	from	different	class
	public void show( String name, int age, int id)
	{
		System.out.println("Student name is = " + name);
		System.out.println("Student age = " + age);
		System.out.println("Student id is = " + id);
	}
	public void show1(int EmplId, String name, double sal)
	{
		System.out.println("The employee id is = "+ EmplId);
		System.out.println("The employee name is = "+ name);
		System.out.println("The employee sallery is = "+ sal);
	}
	public static void main(String[] args) {
		ProgramMar22_4 z = new ProgramMar22_4();
		z.show("Shubham", 21, 121);
		z.show1(9119, "Shubham", 68000.91);
	}

}
