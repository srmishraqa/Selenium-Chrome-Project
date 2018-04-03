package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava obj =new FunctionsInJava();
		//object is created and obj is the reference variable
		//after creating an object a copy of non static methods will be given to object
		
		obj.test();
		
		int l=obj.pqr();
		System.out.println(l);
		
		String str=obj.qa();
		System.out.println(str);
		
		int res=obj.divison(20,5);
		System.out.println(res);
		
	}
	
	//non-static methods
	
	//void means does not return anything 
	//return type = void
	
	public void test() {//no input,no output
		System.out.println("test method");
	}
    
	//return type of the method is int
	
	public int pqr() {//no input,Some Output
		System.out.println("pqr method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;//the return type and return keyword must match
	}
	
	//return type is String
	public String qa() {//no input,Some output
		System.out.println("qa method");
		String s="Selenium";
		return s;
	}
	
	//x & y are input parameters/arguments
	
	public int divison(int x,int y) {//return type is integer some input,some output
		System.out.println("division method");
		int d= x/y;
		return d;
	}
	
}
