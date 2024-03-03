package Collection;

import java.util.HashSet;
import java.util.Vector;

public class ProgramApr11_1 {
	public static void main(String[] args) {
		
		HashSet hs1 = new HashSet();
		HashSet hs2 = new HashSet(1000);
		HashSet hs3 = new HashSet(hs1);
		
		hs1.add("Shubham");
		hs1.add("Komal");
		hs1.add("PO");;
		hs1.add(2023);
		hs1.add(null);
		hs1.add(null);
		hs1.add("Komal");
		
		System.out.println(hs1);
//		hs1.clear();
//		System.out.println(hs1);
		Vector v1 = new Vector(hs1);
		System.out.println(v1);
		
		System.out.println(v1.indexOf(2));
		
		

		
	}

}
