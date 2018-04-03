package CommonPrograms;
//program to check even or odd number
public class EvenOdd {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("This is an even number");
		}
		else {
			System.out.println("This is an odd number");
		}
		
	}

}
