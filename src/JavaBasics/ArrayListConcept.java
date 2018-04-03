package JavaBasics;

//ArrayList Size : is dynamic,Automatically increases or decreases when anything is added or removed
//In ArrayList we don't have any Restriction of any data type.We can add any data type
//Can contain duplicate values/elements
//It maintains insertion order
//It is not synchronized-->slow
//It allows random access to fetch any element as it stores values on the basis of indexes

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	
	public static void main(String[] args) {
		
		//Generic ArrayList
		ArrayList ar=new ArrayList();
		
		ar.add(100);//index=0
		ar.add(200);//index=1
		ar.add(300);//index=2
		
		System.out.println(ar.size());
		
		ar.add(400);//index=3
		ar.add(500);//index=4
		
		System.out.println(ar.size());
		
		ar.add("Hello");//index=5
		ar.add("Tom");//index=6
		ar.add(12.55);//index=7
		ar.add('c');//index=8
		
		System.out.println(ar.size());
		
		ar.add("extra");//index=9
		
		System.out.println(ar.size());
		
		//to remove 
		
		ar.remove(9);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		System.out.println(ar.get(8));
		//System.out.println(ar.get(9));//IndexOutOfBoundException
		
		//to print all the values of ArrayList : use for loop
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//To Restrict an ArrayList to certain data type we can mention the data type while creating an object
		//Non-generic ArrayList
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(101);
		ar1.add(102);
		
		//ar1.add('c');//This not allowed as the ArrayList is only restricted to Integer
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("XXX");
		ar2.add("BBB");
		//ar2.add(123);//This not allowed as the ArrayList is only restricted to String
		
		//index re adjusting if we remove one in between
		
		ar.remove(5);
		
		System.out.println(ar.get(5));
		System.out.println(ar.get(6));
		
		System.out.println("*************************");
		
		//Storing user defined class object in ArrayList
		
		//ArrayList<E> ar3=new ArrayList<E>();
		
		//Employee Object
		
		Employee e1=new Employee("Soumya",27,"QA");
		Employee e2=new Employee("TOM",28,"DEV");
		Employee e3=new Employee("PETER",29,"ADMIN");
		
		//Creating an ArrayList where object will be Stored
		
		ArrayList<Employee> ar4=new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//Using iterator to traverse the value
		
		Iterator<Employee> it=ar4.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("*************************");
		
		//addAll()
		
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("ar5-1");
		ar5.add("ar5-2");
		ar5.add("ar5-3");
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("ar6-1");
		ar6.add("ar6-2");
		ar6.add("ar6-3");
		
		ar5.addAll(ar6);
		
		for(int z=0;z<ar5.size();z++) {
			System.out.println(ar5.get(z));
		}
		
		System.out.println("*************************");
		
		//removeAll()
		
		ar5.removeAll(ar6);
		
		for(int y=0;y<ar5.size();y++) {
			System.out.println(ar5.get(y));
		}
		
		System.out.println("*************************");
		
		//retainAll()
		//to retain all the common parts like intersected values
		
		ArrayList<String> ar7=new ArrayList<String>();
		ar7.add("Rahul");
		ar7.add("Dravid");
		ar7.add("Sachin");
		
		ArrayList<String> ar8=new ArrayList<String>();
		ar8.add("Sachin");
		ar8.add("Lokesh");
		ar8.add("Rahul");
		
		ar7.retainAll(ar8);

		for(int x=0;x<ar7.size();x++) {
			System.out.println(ar7.get(x));
		}
		
		
	}

}
