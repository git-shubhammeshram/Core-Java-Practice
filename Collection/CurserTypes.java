package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CurserTypes {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		for(int i=1; i<=10; i++)
		{
			v1.add(i);
		}
		System.out.println(v1);
		
		//Cursor
		/*System.out.println("Enumeration Cursor");
		
		Enumeration e = v1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}*/
		
		/*System.out.println("Iterator Cursor");
		Iterator itr = v1.iterator();
		while(itr.hasNext())
		{
			
			int num = (int) itr.next();
			if(num%3==0)
			{
				System.out.println(num);
			}
			else
			{
				itr.remove();
			}
		
//			System.out.println(itr.next());
		}*/
		
		System.out.println("ListIterator Cursor");
		
		ListIterator litr = v1.listIterator();
		while(litr.hasNext());
		
		int num1 = (int) litr.next();
		{
			if(num1 == 2)
			{
				litr.remove();
			}
			else if(num1 == 2)
			{
				litr.add(55);
			}
			else if(num1 == 3)
			{
				litr.set(108);
			}
			
			System.out.println(v1);
		}


		
	}

}
