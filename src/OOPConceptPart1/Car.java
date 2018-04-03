package OOPConceptPart1;

public class Car {
	
	//Class Variables or Global Variables:
	
	String mod;
	int wheel;

	public static void main(String[] args) {
		
		//new Car();---> This is the object of Car Class
		//new keyword is used to create the object
		//a,b,c are Object reference variables and it cannot be duplicate
		//Global variables or Class variables will be given to each object created
		
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		
		//Initialization of class/Object variables
		a.mod="BMW X-1";
		a.wheel=4;
		
		b.mod="Chevy Cruze";
		b.wheel=6;
		
		c.mod="Toyota Truck";
		c.wheel=8;
		
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		a=b;
		b=c;
		c=a;
		
		System.out.println("After Changing the references");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		a.mod="BMW X-1";
		System.out.println(a.mod);
		c.mod="Ferrari";
		System.out.println(a.mod);
		System.out.println(c.mod);

	}

}
