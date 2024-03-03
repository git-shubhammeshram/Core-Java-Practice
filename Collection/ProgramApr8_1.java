package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ProgramApr8_1 {

	public static void main(String[] args) {

		ArrayList ary1 = new ArrayList();
		ArrayList ary2 = new ArrayList(1000);
		ArrayList ary3 = new ArrayList(ary1);
		
		System.out.println("Size of array before adding elements is = "+ ary1.size());
		ary1.add(11);
		ary1.add(22);
		ary1.add(33.33);
		ary1.add("Komal");
		System.out.println("Content of array is = "+ary1);
		System.out.println("Size of array After adding elements is = "+ ary1.size());
		
		for(int i=41; i<=50; i++)
		{
			ary1.add(i);
		}
		System.out.println(ary1);
		
		System.out.println(ary1.contains(45));
		System.out.println(ary1.indexOf(22));
		ary1.remove(3);
		System.out.println(ary1);
		
		System.out.println("****************");
		for(Object value:ary1)
		{
			System.out.println(value);
		}
		
		System.out.println("****************");

		for(int i=0; i<ary1.size(); i++)
		{
			System.out.println(ary1.get(i));
		}
		
		ary1.set(2, "Shubham");
		System.out.println(ary1);
		
		Collections.reverse(ary1);
		System.out.println(ary1);
		
//		Collections.sort(ary1);
//		System.out.println(ary1);

		
		
		
		
		


	}

}
