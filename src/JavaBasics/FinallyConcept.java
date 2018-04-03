package JavaBasics;

//finally is a block

public class FinallyConcept {

	public static void main(String[] args) {
	
		//test1();
		// test2();
		// div();
		 div2();

	}
	
	
	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}
		
		catch(Exception e) {
			System.out.println("inside catch block");
		}
		
		finally {
			System.out.println("inside finally block");
		}
	}
	
	
	public static void test2() {
		try {
			System.out.println("inside test 2");
		}
		finally {
			System.out.println("finally code in test 2 method");
		}
		
		//there is no catch block but still it executes the code written inside finally block
		//exception will be thrown
	}
	
	public static void div() {
		int i=10;
		try {
			System.out.println("inside Try Block");
			int k=i/0;
		}
		
		catch(ArithmeticException e){
			System.out.println("Inside Catch Block");
			System.out.println("Any number can't be devided by zero");
		}
		
		finally {
			System.out.println("execute this code even afetr exception");
		}
	}
	
	public static void div2() {
		int m=10;
		try {
			System.out.println("inside div 2 Try Block");
			int n=m/0;
		}
		
		catch(NullPointerException e){
			System.out.println("Inside Catch Block");
			System.out.println("Any number can't be devided by zero");
		}
		//even if we give wrong exception type in catch block finally block code will be executed as always
		//exception will be thrown but there's no proper catch block to catch it
		
		finally {
			System.out.println("execute this code even afetr exception in div2 finally block");
		}
	}
	

}
//finally keyword is used to associate with try catch block
//it always executes the code code written inside the finally block irrespective of exception
//In selenium We can use finally to write driver.quit();