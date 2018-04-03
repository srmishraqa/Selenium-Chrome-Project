package ListConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		
		//add
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		//print
		System.out.println("Contents of LinkedList :"+ll);
		
		//addFirst
		ll.addFirst("Soumya");
		
		//addLast
		ll.addLast("Mishra");
		System.out.println("Contents of LinkedList :"+ll);
		
		//get:
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		
		//set:
		//It replaces the value of that particular index by the desired value entered
		ll.set(0, "LET's Start");
		System.out.println(ll.get(0));
		System.out.println("Contents of LinkedList :"+ll);
		
		//remove First and Last element:
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents of LinkedList :"+ll);
		
		ll.remove(1);
		System.out.println("Contents of LinkedList :"+ll);
		
		//how to print all the values of LinkedList
		
		//using for loop
		System.out.println("*********** Using For Loop");
		for(int i=0;i<ll.size();i++ ) {
			System.out.println(ll.get(i));
		}
		
		//Using advance for loop
		System.out.println("*********** Using Adavnce For Loop");
		for(String str :ll) {
			System.out.println(str);
		}
		
		//Using advance for Iterator
		System.out.println("*********** Using Iterator");
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Using While Loop
		System.out.println("*********** Using While Loop");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
	
	
	
	}

}
