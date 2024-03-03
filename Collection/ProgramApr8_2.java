package Collection;

import java.util.Vector;

public class ProgramApr8_2 {
	
	public static void main(String[] args) {
		Vector v1 = new Vector();
		Vector v2 = new Vector(1000);
		Vector v3 = new Vector(v2);
		
		System.out.println(v1.capacity());
		for(int i=50; i<=60; i++)
		{
			v1.add(i);
		}
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		v1.add(61);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		v1.addElement("Shubham");
		System.out.println(v1);
		
		

		
	}

}
