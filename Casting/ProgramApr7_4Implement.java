package Casting;

public class ProgramApr7_4Implement {

	public static void main(String[] args) {

//		ProgramApr7_2P x = new ProgramApr7_3C();
//		x.show();
		
		ProgramApr7_3C y = (ProgramApr7_3C) new ProgramApr7_2P();
		y.show();
		y.display();
		
	}

}
