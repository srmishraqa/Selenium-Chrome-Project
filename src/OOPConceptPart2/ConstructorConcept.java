package OOPConceptPart2;

public class ConstructorConcept {
	
	//Constructor: Class entity which is used to define some class features while creating the object
	//it looks like a function
	//it can't return any value
	//Constructor name should be same as class name
	
	//constructor:no static and no return type
	
	//default constructor:as no parameter:it is always default
	
	public  ConstructorConcept() {
		System.out.println("Default Constructor");
	}
	
	//parameterized Constructor
	
	public  ConstructorConcept(int i) {
		System.out.println("Single Param Constructor");
		System.out.println("The value of i is: "+i);
	}
	
	
	public  ConstructorConcept(int j,int k) {
		System.out.println("Two Param Constructor");
		System.out.println("The value of j is: "+j);
		System.out.println("The value of k is: "+k);
	}

	//************constructor can be overloaded******************** 
	
	//constructor will be called immediately when we create an object of the particular class
	
	public static void main(String[] args) {
		
		ConstructorConcept obj=new ConstructorConcept();//we are calling here a default constructor
		
		ConstructorConcept obj1=new ConstructorConcept(10);//We are calling single pram constructor
		
		ConstructorConcept obj2=new ConstructorConcept(20,30);//We are calling Two pram constructor

	}

}
