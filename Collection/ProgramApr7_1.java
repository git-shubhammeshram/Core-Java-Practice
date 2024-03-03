package Collection;

import java.util.ArrayList;

public class ProgramApr7_1 {

	public static void main(String[] args) {

		ArrayList ary1 = new ArrayList();
		
		ArrayList ary2 = new ArrayList(1000);
		
		ArrayList ary3 = new ArrayList(ary2);
		
		System.out.println(ary1.size());
		System.out.println(ary1.isEmpty());
		
		ary1.add(10);
		ary1.add(20);
		ary1.add(30);
		ary1.add(40);
		ary1.add(50);
		ary1.add(60);
		
		System.out.println(ary1);
		System.out.println(ary1.size());
		System.out.println(ary1.isEmpty());
		
		ary1.add(2, 200);
		System.out.println(ary1);
		
		ary1.add("Shubham");
		System.out.println(ary1);
		
		
		ary1.add(null);
		System.out.println(ary1);
		
		ary1.remove(2);
		System.out.println(ary1);
		
		ary1.contains("Shubham");
		System.out.println(ary1);
		
		ary1.add("Shubham");
		System.out.println(ary1);
		
		
		
		

		

	}

}
