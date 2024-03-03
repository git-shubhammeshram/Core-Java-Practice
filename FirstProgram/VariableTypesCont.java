package FirstProgram;

public class VariableTypesCont {
   static int a=10; //static variable
   int b=20; //non static variable
	public void show()
	{
		a++;
		b++;
		System.out.println(a+ " "+b);
	}
	public static void main(String[] args) {
		//creating the new object
		//class name Object=new class name();
		//vtc,show() object calling
		VariableTypesCont vtc=new VariableTypesCont ();
		vtc.show();
		VariableTypesCont vtc2=new VariableTypesCont ();
		vtc2.show();
	}

}
