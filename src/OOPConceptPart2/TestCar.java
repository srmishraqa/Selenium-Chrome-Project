package OOPConceptPart2;

public class TestCar {

	
	public static void main(String[] args) {
	
		BMW b=new BMW();//As this class is publicly defined we can create object anywhere
		
		
		//Static Polymorphism or Complie Time Polymorphism --> mathod oevrdriding and deciding which method to implement at the time of compilation
		
		b.start();
		
		//if same method exists in both parent and child class preference will be given to child class method--> This is called method overriding
		//When Same method is present both in Parent class and as well as in child class with same name and same no of arguments 
		//preference will be given to child class method
		
		b.stop();
		b.refuel();
		b.theftSafety();
		b.enigine();
		
		System.out.println("**************************************");
		
		
		Car c = new Car();
		
		c.start();
		c.stop();
		c.refuel();
		c.enigine();
		//A parent can't access the property of any Child
		System.out.println("**************************************");
		
		
		//Top Casting
		Car c1=new BMW();//Child class object can be referred by parent class reference variable --> Dynamic Polymorphism or Runtime Polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		c1.enigine();
		
		//Only and Only Overridden methods i.e. Parent class methods and common methods can be called by using parent class reference variable
		
		//Down Casting
		//BMW b1=new Car(); //Not Allowed
		//BMW b1=(BMW) new Car();//ClassCastException
		
	}
}
