package JavaBasics;

//In Hashtable we will use put() instead of add()
//here we have to use key as kind of index and Values
//we can any data type in Hashtable: key and value can be of any data type



import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h=new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World"); 
		
		System.out.println(h.size());
		
		h.put(1, "SSS");
		h.put(2, 100);
		h.put(3, 101.86);
		
		System.out.println(h.size());
		System.out.println(h.get("A"));
		System.out.println(h.get(3));
		
		//to restrict to certain data type
		
		Hashtable<Integer,Integer> h1=new Hashtable<Integer,Integer>();
		
		h1.put(1, 111);
		h1.put(2, 112);
		h1.put(3, 113);
		//h1.put(4,"RRR"); Not allowed
		
		Hashtable<Integer,String> h2=new Hashtable<Integer,String>();
		
		h2.put(1, "wwe");
		h2.put(2, "MMA");
	}

}
