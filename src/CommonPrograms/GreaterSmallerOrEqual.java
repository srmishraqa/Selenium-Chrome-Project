package CommonPrograms;
//Program to compare two numbers
public class GreaterSmallerOrEqual {
	
	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else if(b>a) {
			System.out.println("b is grater than a");
		}
		else {
			System.out.println("a is equal to b");
		}
			
	}
	
}
