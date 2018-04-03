package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		
		obj.sum(10);
		
		obj.sum(20,30);
		
		obj.sum(45.75,20);
	}
	
	public static void main(int p) {
		
	}
	
      public static void main(int q,int r) {//main method can be overloaded too.
		
	}
	
	//you cannot create a method inside a method
	
	//duplicate methods--> same method name with same number of arguments are not allowed
	
	//Method Overloading --> when the method names are same with different arguments or input parameters with different data type with in the same class
	
	public void sum() {//0 input parameter
		System.out.println("sum() method -- zero parameter");
	}
	
	public void sum(int i) {//1 input parameter
		System.out.println("sum method with one parameter");
		System.out.println(i);
	}

	
	public void sum(int k,int l) {//2 input parameter
		System.out.println("sum method with two parameter");
		System.out.println(k+l);
	}
	
	public void sum(double k,int l) {//2 input parameter
		System.out.println("sum method with two parameter of different datatype");
		System.out.println(k);
		System.out.println(l);
	}
}
