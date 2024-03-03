package Collection;

import java.util.LinkedList;

public class ProgramApr9_1 {
	
	public static void main(String[] args) {
		LinkedList ll1 =new LinkedList();
		LinkedList ll2 = new LinkedList(ll1);
		
		System.out.println(ll1.size());
		System.out.println(ll2.size());
		System.out.println(ll1.isEmpty());
		
		for(int i=0;i<=10; i++)
		{
			ll1.add(i);
		}
		System.out.println(ll1);
		
		ll1.removeAll(ll1);
		System.out.println(ll1);
		
		ll1.add("Amravati");
		ll1.add("Chandrapur");
		ll1.add("Nagpur");
		ll1.add("Wardha");
		ll1.add("Aurangabaad");
		System.out.println(ll1);
		
		System.out.println(ll1.indexOf("Nagpur"));
		
		ll1.addFirst("Mumbai");
		ll1.addLast("Pune");
		System.out.println(ll1);
		
		ll1.remove("Nagpur");
		System.out.println(ll1);
		
		ll1.removeFirst();
		ll1.removeLast();
		System.out.println(ll1);
		
		ll1.add(3, "Morshi");
		System.out.println(ll1);
		
		ll1.addFirst("Amravati");
		ll1.addLast("Chandrapur");
		System.out.println(ll1);
		
		ll1.removeFirstOccurrence("Amravati");
		ll1.removeLastOccurrence("Chandrapur");
		System.out.println(ll1);
		
		
		
		
		
		
	}

}
