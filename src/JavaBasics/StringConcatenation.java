package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		
		
		String s1="Hello";
		String s2="World";
		
		double c=12.33;
		double d=10.33;
		
		System.out.println(a+b);
		System.out.println(s1+s2);
		
		System.out.println(a+b+s1+s2);
		
		System.out.println(s1+s2+a+b);
		
		System.out.println(s1+s2+(a+b));
		
		System.out.println(a+b+s1+s2+a+s1+b+s2);
		
		System.out.println(c+d);
		System.out.println(s1+s2+c+d);
		
		System.out.println("The value of a is: "+a);
		System.out.println("The value of a is: "+b);
		System.out.println("The addition of a and b is: "+(a+b));
		
		System.out.print("Hello I am here");
		System.out.println("*Come Here");
		
		//println is used to print on the console with a new line ahead of it
		//print is used to just print on the console
	}

}
