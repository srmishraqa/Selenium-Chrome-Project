package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		 int a =10;
		 int b=20;
		 
		 if(a>b){
			System.out.println("a is greater than b"); 
		 }
		 else{
			 System.out.println("b is greater than a");
		 }
		 
		 //Comparison Operators
		 //< > <= >= == !=
		 
		 int c=40;
		 int d=40;
		 if(c==d){
			 System.out.println("c is equal to d");
		         }
		 else{
			 System.out.println("c is not equal to d");
			 }
		 //logic to find highest number
		 
		 int x=36;
		 int y=28;
		 int z=38;
		 //without using nested if
		
		 //nested if will be used here
		 if(x>y & x>z) //true & false =false
		 {
			 System.out.println("x is the greatest");
			 }
		 else if(y>z)//false
			 {
			 System.out.println("y is the greatest");
		 }
		 else
		 {
			 System.out.println("z is the greatest");
		 }
		 
	}
}
